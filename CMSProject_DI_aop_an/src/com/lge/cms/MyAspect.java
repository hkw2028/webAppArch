package com.lge.cms;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	
	@Before("execution(* *..*ServiceImpl.* (..))")
	public void log() {
		System.out.println( "log" );
	}
	
	public void encrypt() {
		System.out.println( "encrypt" );
	}
	
	@After("execution(* *..*ServiceImpl.save (..))")
	public void transaction() {
		System.out.println( "transaction" );
	}
}
