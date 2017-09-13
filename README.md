# key-value-store
A distributed key value store

Problem Statement:

“A key-value store, or key-value database, is a data storage paradigm designed for storing, retrieving, and managing associative arrays, a data structure more commonly known today as a dictionary or hash.” from Wikipedia. 

Implement a distributed Key-Value (KV) store using any language of your choice. For simplicity you can assume both the key and value types are strings. Your KV store should be running as (at least) 2 different processes that replicate data between them (ie) we should be able to put in a Key and Value to Process 1 and query for the same Key on Process 2, for which we should get the corresponding Value.

Expose the store via a HTTP service that would allow us to GET / SET key-value pairs. Ideally, write it as you would a production piece of code with tests. Bonus points for making this as fast as possible. 

Sample Invocations:
$ curl -H "Content-type: application/json" -XPOST http://localhost:4455/set/key -d ‘“value”’
OK 
$ curl -H “Accept: application/json” http://localhost:4466/get/key
“value”

Solution Approach:

Key value stores allows to store schema-less data. This data is usually consisting of a string which represents the key and the actual data which is considered to be the value in the "key - value" relationship. 

I have chosen Java programming language to implement the given problem statement. I have followed the approach of how a dictionary will perform. Hence chose HashMap class to implement the Key-Value pair and manipulate it for further processes.

Follow the steps to review the code:

1) Clone/download the project into your local system.
2) Unzip the file. You may find the War file named "KeyValueStore.war".
3) Considering Eclipse IDE is in your machine, In Eclipse, select File > Import.
4) In the Import dialog, under folder Web > WAR file and then click Next.
5) In the Import dialog, choose the available Apache Tomcat Server.
6) In the Import dialog, click Select All.
7) Click Finish to populate the Web project. 

Follow the steps to run the program:

1) Clone/download the project into your local machine.
2) Unzip the file. You may find the War file named "KeyValueStore.war".
3) Considering the latest version of Tomcat Server is installed in your local machine, place the war file under ..\Tomcat\webapps folder.
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
  
