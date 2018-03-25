package com.Ardia.tp;

public class Singleton {
	
	
	private Singleton()

{
		}




private static Singleton instance = null;

 



public static Singleton getInstance()

{  

    if (instance == null)

    {  

            if (instance == null)

            {   instance = new Singleton();

            }

        

    }

    return instance;

}

/** Exemple d’un méthode interne afin de tester le singleton **/

public void showMessage(){

  System.out.println("Hello World!");

}

}

