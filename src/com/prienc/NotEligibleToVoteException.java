package com.prienc;
// making an exception class  NotEligibleToVoteException it extends the exception class

public class NotEligibleToVoteException extends Exception{
	//Declaring variable int age
	int age;
	// making a constructor
	  public  NotEligibleToVoteException(int age){
		  
		  this.age =age;
		}
      public String toString(){
    	  return "Your age is "+age+" You must be 18+";
	}
      
}
