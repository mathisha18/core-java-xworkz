class ChatAngadi{

    public static void main(String chat[]){
     String chatNames[]={"Pani Puri","Samosa Masala","Bhel Puri"};

	  // invoke logic(methods)
	 getChatNames(chatNames);  // Invoking a method
	}             //argument

    //Declaration of a method        //parameter
    public static void getChatNames(String chatNames[]){   //Signature of the method
		System.out.println("Inside getChatNames");
		 for(String chatName:chatNames)
		 {
			 System.out.println(chatName);
		 }	
	}   // body of the method




}