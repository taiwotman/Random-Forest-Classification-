root
 |-- data1: double (nullable = false)
 |-- data2: double (nullable = false)
 |-- data3: double (nullable = false)
 |-- data4: double (nullable = false)
 |-- species: string (nullable = true)

+---------------+-----+
|        species|count|
+---------------+-----+
|    Iris-setosa|   50|
| Iris-virginica|   50|
|Iris-versicolor|   50|
+---------------+-----+

+---------------+------------+-----------------+
| predictedLabel|indexedLabel|  indexedFeatures|
+---------------+------------+-----------------+
|    Iris-setosa|         0.0|[4.7,3.2,1.3,0.2]|
|    Iris-setosa|         0.0|[4.6,3.4,1.4,0.3]|
|    Iris-setosa|         0.0|[4.8,3.0,1.4,0.1]|
|    Iris-setosa|         0.0|[5.1,3.5,1.4,0.3]|
|    Iris-setosa|         0.0|[5.7,3.8,1.7,0.3]|
|    Iris-setosa|         0.0|[5.4,3.4,1.7,0.2]|
|    Iris-setosa|         0.0|[5.1,3.7,1.5,0.4]|
|    Iris-setosa|         0.0|[5.0,3.0,1.6,0.2]|
|    Iris-setosa|         0.0|[5.0,3.4,1.6,0.4]|
|    Iris-setosa|         0.0|[5.2,3.5,1.5,0.2]|
|    Iris-setosa|         0.0|[4.8,3.1,1.6,0.2]|
|    Iris-setosa|         0.0|[5.4,3.4,1.5,0.4]|
|    Iris-setosa|         0.0|[5.5,4.2,1.4,0.2]|
|    Iris-setosa|         0.0|[4.9,3.1,1.5,0.1]|
|    Iris-setosa|         0.0|[5.0,3.2,1.2,0.2]|
|    Iris-setosa|         0.0|[5.1,3.4,1.5,0.2]|
|    Iris-setosa|         0.0|[4.5,2.3,1.3,0.3]|
|    Iris-setosa|         0.0|[5.0,3.5,1.6,0.6]|
|    Iris-setosa|         0.0|[5.1,3.8,1.6,0.2]|
|    Iris-setosa|         0.0|[5.0,3.3,1.4,0.2]|
|Iris-versicolor|         1.0|[6.4,3.2,4.5,1.5]|
|Iris-versicolor|         1.0|[5.5,2.3,4.0,1.3]|
|Iris-versicolor|         1.0|[6.6,2.9,4.6,1.3]|
|Iris-versicolor|         1.0|[6.1,2.9,4.7,1.4]|
|Iris-versicolor|         1.0|[5.6,2.9,3.6,1.3]|
|Iris-versicolor|         1.0|[6.7,3.1,4.4,1.4]|
|Iris-versicolor|         1.0|[5.8,2.7,4.1,1.0]|
|Iris-versicolor|         1.0|[6.2,2.2,4.5,1.5]|
| Iris-virginica|         1.0|[5.9,3.2,4.8,1.8]|
|Iris-versicolor|         1.0|[6.3,2.5,4.9,1.5]|
|Iris-versicolor|         1.0|[6.6,3.0,4.4,1.4]|
|Iris-versicolor|         1.0|[6.0,2.9,4.5,1.5]|
|Iris-versicolor|         1.0|[5.4,3.0,4.5,1.5]|
|Iris-versicolor|         1.0|[6.7,3.1,4.7,1.5]|
|Iris-versicolor|         1.0|[6.3,2.3,4.4,1.3]|
|Iris-versicolor|         1.0|[5.7,3.0,4.2,1.2]|
|Iris-versicolor|         1.0|[5.7,2.9,4.2,1.3]|
| Iris-virginica|         2.0|[6.3,3.3,6.0,2.5]|
| Iris-virginica|         2.0|[6.5,3.0,5.8,2.2]|
| Iris-virginica|         2.0|[7.6,3.0,6.6,2.1]|
| Iris-virginica|         2.0|[7.3,2.9,6.3,1.8]|
| Iris-virginica|         2.0|[6.7,2.5,5.8,1.8]|
| Iris-virginica|         2.0|[7.2,3.6,6.1,2.5]|
| Iris-virginica|         2.0|[6.5,3.2,5.1,2.0]|
| Iris-virginica|         2.0|[6.4,3.2,5.3,2.3]|
|Iris-versicolor|         2.0|[6.0,2.2,5.0,1.5]|
| Iris-virginica|         2.0|[5.6,2.8,4.9,2.0]|
|Iris-versicolor|         2.0|[6.3,2.7,4.9,1.8]|
| Iris-virginica|         2.0|[6.2,2.8,4.8,1.8]|
| Iris-virginica|         2.0|[6.1,3.0,4.9,1.8]|
| Iris-virginica|         2.0|[6.4,2.8,5.6,2.1]|
| Iris-virginica|         2.0|[6.4,2.8,5.6,2.2]|
| Iris-virginica|         2.0|[7.7,3.0,6.1,2.3]|
| Iris-virginica|         2.0|[6.0,3.0,4.8,1.8]|
| Iris-virginica|         2.0|[5.8,2.7,5.1,1.9]|
| Iris-virginica|         2.0|[6.7,3.0,5.2,2.3]|
| Iris-virginica|         2.0|[6.3,2.5,5.0,1.9]|
| Iris-virginica|         2.0|[6.5,3.0,5.2,2.0]|
| Iris-virginica|         2.0|[6.2,3.4,5.4,2.3]|
| Iris-virginica|         2.0|[5.9,3.0,5.1,1.8]|
+---------------+------------+-----------------+

Test Error = 0.050000000000000044
Learned classification forest model:
RandomForestClassificationModel (uid=rfc_478c3f064947) with 10 trees
  Tree 0 (weight 1.0):
    If (feature 2 <= 1.7)
     Predict: 0.0
    Else (feature 2 > 1.7)
     If (feature 2 <= 5.0)
      Predict: 1.0
     Else (feature 2 > 5.0)
      If (feature 2 <= 5.1)
       If (feature 3 <= 1.6)
        Predict: 1.0
       Else (feature 3 > 1.6)
        Predict: 2.0
      Else (feature 2 > 5.1)
       Predict: 2.0
  Tree 1 (weight 1.0):
    If (feature 3 <= 0.5)
     Predict: 0.0
    Else (feature 3 > 0.5)
     If (feature 2 <= 4.9)
      Predict: 1.0
     Else (feature 2 > 4.9)
      If (feature 2 <= 5.1)
       If (feature 3 <= 1.6)
        If (feature 3 <= 1.5)
         Predict: 2.0
        Else (feature 3 > 1.5)
         Predict: 1.0
       Else (feature 3 > 1.6)
        Predict: 2.0
      Else (feature 2 > 5.1)
       Predict: 2.0
  Tree 2 (weight 1.0):
    If (feature 2 <= 1.7)
     Predict: 0.0
    Else (feature 2 > 1.7)
     If (feature 2 <= 5.0)
      Predict: 1.0
     Else (feature 2 > 5.0)
      If (feature 3 <= 1.6)
       If (feature 2 <= 5.1)
        Predict: 1.0
       Else (feature 2 > 5.1)
        Predict: 2.0
      Else (feature 3 > 1.6)
       Predict: 2.0
  Tree 3 (weight 1.0):
    If (feature 3 <= 0.5)
     Predict: 0.0
    Else (feature 3 > 0.5)
     If (feature 3 <= 1.7)
      If (feature 0 <= 7.0)
       If (feature 2 <= 5.0)
        If (feature 0 <= 4.9)
         Predict: 1.0
        Else (feature 0 > 4.9)
         Predict: 1.0
       Else (feature 2 > 5.0)
        Predict: 2.0
      Else (feature 0 > 7.0)
       Predict: 2.0
     Else (feature 3 > 1.7)
      Predict: 2.0
  Tree 4 (weight 1.0):
    If (feature 2 <= 1.9)
     Predict: 0.0
    Else (feature 2 > 1.9)
     If (feature 3 <= 1.6)
      If (feature 3 <= 1.3)
       Predict: 1.0
      Else (feature 3 > 1.3)
       If (feature 2 <= 5.1)
        Predict: 1.0
       Else (feature 2 > 5.1)
        Predict: 2.0
     Else (feature 3 > 1.6)
      Predict: 2.0
  Tree 5 (weight 1.0):
    If (feature 2 <= 1.9)
     Predict: 0.0
    Else (feature 2 > 1.9)
     If (feature 3 <= 1.5)
      Predict: 1.0
     Else (feature 3 > 1.5)
      If (feature 2 <= 5.1)
       If (feature 1 <= 2.7)
        Predict: 1.0
       Else (feature 1 > 2.7)
        If (feature 3 <= 1.6)
         Predict: 1.0
        Else (feature 3 > 1.6)
         Predict: 2.0
      Else (feature 2 > 5.1)
       Predict: 2.0
  Tree 6 (weight 1.0):
    If (feature 3 <= 1.6)
     If (feature 2 <= 1.7)
      Predict: 0.0
     Else (feature 2 > 1.7)
      Predict: 1.0
    Else (feature 3 > 1.6)
     If (feature 3 <= 1.7)
      If (feature 1 <= 2.5)
       Predict: 2.0
      Else (feature 1 > 2.5)
       Predict: 1.0
     Else (feature 3 > 1.7)
      Predict: 2.0
  Tree 7 (weight 1.0):
    If (feature 3 <= 0.5)
     Predict: 0.0
    Else (feature 3 > 0.5)
     If (feature 3 <= 1.7)
      If (feature 0 <= 7.0)
       If (feature 3 <= 1.3)
        Predict: 1.0
       Else (feature 3 > 1.3)
        If (feature 1 <= 2.6)
         Predict: 2.0
        Else (feature 1 > 2.6)
         Predict: 1.0
      Else (feature 0 > 7.0)
       Predict: 2.0
     Else (feature 3 > 1.7)
      Predict: 2.0
  Tree 8 (weight 1.0):
    If (feature 3 <= 0.5)
     Predict: 0.0
    Else (feature 3 > 0.5)
     If (feature 2 <= 4.9)
      Predict: 1.0
     Else (feature 2 > 4.9)
      If (feature 2 <= 5.0)
       If (feature 3 <= 1.7)
        Predict: 1.0
       Else (feature 3 > 1.7)
        Predict: 2.0
      Else (feature 2 > 5.0)
       Predict: 2.0
  Tree 9 (weight 1.0):
    If (feature 3 <= 0.5)
     Predict: 0.0
    Else (feature 3 > 0.5)
     If (feature 3 <= 1.7)
      If (feature 3 <= 1.4)
       Predict: 1.0
      Else (feature 3 > 1.4)
       If (feature 0 <= 6.0)
        Predict: 1.0
       Else (feature 0 > 6.0)
        If (feature 2 <= 5.0)
         Predict: 1.0
        Else (feature 2 > 5.0)
         Predict: 2.0
     Else (feature 3 > 1.7)
      Predict: 2.0


Process finished with exit code 0