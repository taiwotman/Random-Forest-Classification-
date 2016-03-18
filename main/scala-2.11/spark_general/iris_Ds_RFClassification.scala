package spark_general

import java.nio.DoubleBuffer

import org.apache.spark.ml.Pipeline
import org.apache.spark.ml.classification.{RandomForestClassifier, RandomForestClassificationModel}
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.ml.feature._
import org.apache.spark.mllib.linalg.{Vector, Vectors}
import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkContext, SparkConf}


/**
  * Created by taiwoadetiloye on 2016-03-15.
  */
object iris_Ds_RFClassification extends App{

  val config = new SparkConf().setAppName("My RF Classification App").setMaster("local")
  val sc = new SparkContext(config)
  val sqlContext = new SQLContext(sc)

  //Load and parse the data file, converting it to a Dataframe
  val lines =sc.textFile("/Users/taiwoadetiloye/IdeaProjects/simpleGraph/src/main/resources/iris.data.txt")
 lines.persist()

  val nonEmpty = lines.filter(_.nonEmpty)
  val columns = nonEmpty.map(_.split(","))


  import sqlContext.implicits._

  val distinctSpecies = columns.map{a => a(4)}.distinct.collect
  val textToNumeric = distinctSpecies.zipWithIndex.toMap

  /* 2. map the columns to dataframe for SparkML unlike Mllib that used RDD*/
  case class IrisReviews(v1:Double, v2:Double,v3:Double, v4:Double, lbl:String)
  val data = columns.map{a => IrisReviews(a(0).toDouble, a(1).toDouble,a(2).toDouble,a(3).toDouble, a(4))}.toDF("data1", "data2", "data3","data4","species")

  data.printSchema() // => Goodjob
  data.groupBy("species").count.show


  //3. Transform to features and label

  // Index labels, adding metadata to the label column.
  // Fit on whole dataset to include all labels in index.
  val labelIndexer = new StringIndexer()
    .setInputCol("species")
    .setOutputCol("indexedLabel")
    .fit(data)

  val features = Array("data1", "data2", "data3","data4")
  val featureIndexer = new VectorAssembler()
        .setInputCols(features)
    .setOutputCol("indexedFeatures")

  // Split the data into training and test sets (30% held out for testing)
  val Array(trainingData, testData) = data.randomSplit(Array(0.7, 0.3))

  // Train a RandomForest model.
  val rf = new RandomForestClassifier()
    .setLabelCol("indexedLabel")
    .setFeaturesCol("indexedFeatures")
    .setNumTrees(10)

  // Convert indexed labels back to original labels.
  val labelConverter = new IndexToString()
    .setInputCol("prediction")
    .setOutputCol("predictedLabel")
    .setLabels(labelIndexer.labels)

  //Chain indexers and forest in a Pipeline
  val pipeline = new Pipeline()
    .setStages(Array(labelIndexer, featureIndexer, rf, labelConverter))

  // Train model.  This also runs the indexers.
  val model = pipeline.fit(trainingData)

  // Make predictions.
  val predictions = model.transform(testData)

  // Select example rows to display.
  predictions.select("predictedLabel", "indexedLabel", "indexedFeatures").show(500)


  // Select (prediction, true label) and compute test error
  val evaluator = new MulticlassClassificationEvaluator()
    .setLabelCol("indexedLabel")
    .setPredictionCol("prediction")
    .setMetricName("precision")
  val accuracy = evaluator.evaluate(predictions)
  println("Test Error = " + (1.0 - accuracy))

  val rfModel = model.stages(2).asInstanceOf[RandomForestClassificationModel]
  println("Learned classification forest model:\n" + rfModel.toDebugString)
}




