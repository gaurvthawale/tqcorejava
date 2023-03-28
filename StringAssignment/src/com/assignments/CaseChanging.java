package com.assignments;
public class CaseChanging {
	   public static void main(String []args){
	      char c = 0;
	      String str = "jAcK";
	      System.out.println("String in lowercase: "+str);
	      // length of string
	      int len = str.length();
	      StringBuffer strBuffer = new StringBuffer(len);
	      for (int i = 0; i < len; i++) {
	         c = str.charAt(i);
	       
	        
	         if (Character.isUpperCase(c)) {
	        	 c = Character.toLowerCase(c);
	         }
	    
	         if (Character.isLowerCase(c)) {
	            c = Character.toUpperCase(c);
	         }
	         strBuffer.append(c);
	      }
	      System.out.println("Converting case: "+strBuffer.toString());
	   }
	}

	         