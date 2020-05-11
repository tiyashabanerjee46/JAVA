// Create  HashMap class
Map<String,String> myMap = new HashMap<String,String>(); 
myMap.put("Hello", "GoodBye");	
System.out.println(myMap.get("Hello")); 
myMap.put("Hello", "GoodBye!"); //replace GoodBye with GoodBye! 
System.out.println(myMap.get("Hello")); // Print the Value which is mapped to from "Hello" (replace one)
