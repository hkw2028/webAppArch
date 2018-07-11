package com.kyobo.cms;

public class MyAspect {

	public void log() {
		System.out.println( "log" );
	}
	
	public void encrypt() {
		System.out.println( "encrypt" );
	}
	
	public void transaction() {
		System.out.println( "transaction" );
	}
}
