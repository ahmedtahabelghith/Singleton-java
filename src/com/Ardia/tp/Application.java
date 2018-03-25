package com.Ardia.tp;


public class Application {

	public static void main(String[] args) {
		//illegal construct

	      //Compile Time Error: The constructor Singleton () is not visible

	      // Singleton object = new Singleton ();

	 

	      //Get the only object available

	      Singleton object = Singleton.getInstance();
	      Singleton object2=Singleton.getInstance();

	      
	 

	      //show the message

	      object.showMessage();
	      object2.showMessage();

	}

}
