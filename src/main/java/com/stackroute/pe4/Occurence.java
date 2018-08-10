package com.stackroute.pe4;

public class Occurence 
{
		public int func(String s,char ch) 
		{
			String s1=Character.toString(ch);
			int c=s.length()-s.replaceAll(s1,"").length();	
			return c;
			
		}

}
