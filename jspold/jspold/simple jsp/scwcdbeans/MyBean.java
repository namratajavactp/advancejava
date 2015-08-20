package com.bean;
import java.io.*;
public class  MyBean implements Serializable
{
	private String name;
	private String address;
	private String state;
	public MyBean()
	{}
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public String getState()
	{
		return state;
	}
	public void setState(String state)
	{
		this.state=state;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String greet()
	{
		String str = getName();
		return "Hello"+str;
	}
}