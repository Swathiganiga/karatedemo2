Feature: greeting end point




Scenario: create a user and then get it by id


  
* def MongoDBExample = Java.type('example.demo.database.emp')
* def result = MongoDBExample.create()
* print 'created id is: ' + result

* match result == {  name : "smitha" , lastName : "g" , age : 41 }