package com.syntax.com15;


public class recapStringDemo {
  
	public static void main(String[] args) {
	
	  String str="This is Lubo.Lubo is break manager";
  System.out.println(str.replace("Lubo", "Sobron"));
  System.out.println(str.replaceAll("Lubo", "Sobron"));
  
  String str2="kakjakakakjBB456";
  
  System.out.println(str2.replaceAll("[^A-Za-z0-9]",""));
  
  System.out.println(str2.replace("[^A-Za-z0-9]", ""));
  
  // when you have to change the value of a variable of a string variable always use StringBuilder class
  
  StringBuilder stringbuilder=new StringBuilder();
  for (int i=0;i<5;i++) {
	  //stringBuilder.append(i);
	 
	String str4=("Me : Look it's not you it's me,walking away");
  StringBuilder strBuilder=new StringBuilder(str4);
  strBuilder.reverse();
  System.out.println(strBuilder);
  }
 
  }
  
  
  
  }
  
  
  
	
	








