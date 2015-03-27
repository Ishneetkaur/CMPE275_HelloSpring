package com.ishneet;

import java.util.List;
import java.util.ArrayList;

public class Greeting implements Greeter {
	private List<String> names= new ArrayList<String>();
	
	@Override
	public void setNames(List<String> names) {
	      this.names = names;
	}

	@Override
	public String getGreeting() {
		System.out.print("Hello world from");
		for (int i = 0; i < names.size(); i++) {
			if(i != 0 && (i == names.size() - 1)){
				System.out.print(" and");
		    } 
			System.out.print(" " + names.get(i));
		}
		System.out.println("!");
	    return "Done";
	}
}
