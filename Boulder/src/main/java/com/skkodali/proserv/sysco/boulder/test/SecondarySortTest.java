package com.skkodali.proserv.sysco.boulder.test;

import org.apache.spark.api.java.JavaSparkContext;
public class SecondarySortTest 
{
	JavaSparkContext ctx;
	String inputPath;
	
	public SecondarySortTest(String inputPath)
	{
		ctx = new JavaSparkContext();
		this.inputPath = inputPath;
	}
	public void calculateTemps()
	{
		ctx.textFile(inputPath);
	}
	public static void main(String [] args)
	{
		SecondarySortTest s = new SecondarySortTest(args[0].toString());
	}
}
