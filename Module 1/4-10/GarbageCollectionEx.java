package com.a104;

public class GarbageCollectionEx 
{
	
	@Override
	protected void finalize() throws Throwable 
	{
		// TODO Auto-generated method stub
		//super.finalize();
		System.out.println("Garbage Collection Called");
	}
	
	
	public static void main(String[] args) 
	{
		
		GarbageCollectionEx g1 = new GarbageCollectionEx();
		GarbageCollectionEx g2 = new GarbageCollectionEx();
		GarbageCollectionEx g3 = new GarbageCollectionEx();
	
		g1 = null;
		g2 = null;
	
		
		System.gc();
		
		
	}
}
