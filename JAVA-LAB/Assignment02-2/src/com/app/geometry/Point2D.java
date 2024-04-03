package com.app.geometry;

public class Point2D 
{
	private double X;
	private double Y;
	
	
	public Point2D() 
	{
		this.X = 0.0;
		this.Y = 0.0;
		
	}
	public Point2D(double X, double Y)
	{
		this.X = X;
		this.Y = Y;
	}
	public double getX() 
	{
		return X;
	}
	public void setX(double x) 
	{
		X = x;
	}
	public double getY() 
	{
		return Y;
	}
	public void setY(double y) 
	{
		Y = y;
	}
	
	public String getDetails()
	{
		String result;
		result = X + " , " +Y;
		return result;
	}

	public boolean isEqual(Point2D p2)
	{
	  if(this.X==p2.X && this.Y==p2.Y)
	  {
		  return true;
	  }
	  else
	  {
		  return false;
	  }
	}
	
	public double calculateDistance(Point2D p1,Point2D p2)
	{
		double distance;
		distance = Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));
		return distance;
	}
	
	
	
}
