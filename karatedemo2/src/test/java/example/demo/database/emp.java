package example.demo.database;


import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class emp{
public static void main(String[] args)  throws UnknownHostException{ 
	create();
}
public static Object create()
{
	MongoClient mongo=null;
	try {
		mongo = new MongoClient("localhost", 27017);
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	 DB database = mongo.getDB("testdb2");
		database.createCollection("users2", null);
	DBCollection table = database.getCollection("users2");
	BasicDBObject document = new BasicDBObject();
	
	document.put("name", "smitha");
	document.put("lastName", "g");
	document.put("age", 41);
	return document;
	
}
}