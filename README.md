# key-value-store
A distributed key value store

Follow the steps to run the program:

1) Clone/download the project into your local system.
2) Unzip the file. You may find the War named "KeyValueStore.war"
3) Considering the latest version of Tomcat Server is installed in your local, place the war file under ..\Tomcat\webapps folder
4) Start the Tomcat Server.
5) Upon successful server startup, open any broswer or using Postman desktop application sample invoke the following webservice URLs:
  
  Process 1: For Populating the Key-Value Store:
  http://localhost:8080/KeyValueStore/rest/KeyValueStoreServiceImpl/set?key=Key1&value=Value1
  
  Process 2: Retrieving all Key-Value pair available in Key-Value Store:
  http://localhost:8080/KeyValueStore/rest/KeyValueStoreServiceImpl/get
  
  Process 3: Retrieving a Value for the given Key:
  http://localhost:8080/KeyValueStore/rest/KeyValueStoreServiceImpl/getvalueof/Key1
  
  Process 4: Deleting the Key-Value Pair for the given Key:
  http://localhost:8080/KeyValueStore/rest/KeyValueStoreServiceImpl/delete/Key1
  
  Process 5: Retrieving a Key for the given Value:
  http://localhost:8080/KeyValueStore/rest/KeyValueStoreServiceImpl/getkeyof/Value1
