package com.example.restapp;


public class Greeting {

private String name;

public Greeting(int id) {  
    	
    	switch (id) {
    	case 1:
    	    setName("Good Day!!");
    	    break;
    	case 2:
    	    setName("Bad Day!!"); 
    	    break;
    	case 3:    		
    		setName("Amazing Day!!");
    		break;
    	 default:
    		 setName("Ok!!");
    	}
        
    }

public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return name;
}

}
