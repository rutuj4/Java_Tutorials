package com.company;

public class D14_StringMethods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String Methods 2");
		System.out.println("---------------");
		String name = "Rutuj";
		System.out.println(name);
		System.out.println(name.substring(3));
		System.out.println("---------------");
		
		System.out.println(name.substring(2 ,4));
		//Start index will be included and end will be excluded
		System.out.println("---------------");
		
		System.out.println(name.replace('u', 'o'));
		System.out.println("---------------");
		
		System.out.println(name.startsWith("Ru"));
		System.out.println(name.startsWith("ut"));
		System.out.println("---------------");
		
		System.out.println(name.endsWith("uj"));
		System.out.println("---------------");
		
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(1));
		System.out.println(name.charAt(2));
		System.out.println("---------------");
		
		System.out.println(name.indexOf("ut"));
		System.out.println("---------------");
		
		String modifiedName = "Rutujtuj";
		System.out.println(modifiedName.indexOf("tuj13213"));
		System.out.println(modifiedName.indexOf("tuj", 4));
		System.out.println("---------------");
		
		
		System.out.println(name.equals("Rutuj"));
		System.out.println(name.equals("rutuj"));
		System.out.println("---------------");
		
		System.out.println(name.equalsIgnoreCase("rutuj"));
		System.out.println(name.equalsIgnoreCase("ruTuJ"));
		System.out.println("---------------");
	}

}
