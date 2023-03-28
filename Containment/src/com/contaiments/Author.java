package com.contaiments;

public class Author {
	
	private int authorId;
	private String aname;
	private int age;
	
	Author()
	{
		
	}
	
	
	Author(int authorId, String aname, int age)
	{
		
		this.authorId = authorId;
		this.aname = aname;
		this.age = age;
	}


	public int getAuthorId() 
	{
		return authorId;
	}


	public void setAuthorId(int authorId)
	{
		this.authorId = authorId;
	}


	public String getAname() 
	{
		return aname;
	}


	public void setAname(String aname)
	{
		this.aname = aname;
	}


	public int getAge()
	{
		return age;
	}


	public void setAge(int age) 
	{
		this.age = age;
	}


	@Override
	public String toString() {
		return "Author : " + authorId + " " + aname + " " + age;
	}
	
	
	
	
	
	

}
