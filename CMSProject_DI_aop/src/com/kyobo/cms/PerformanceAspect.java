package com.kyobo.cms;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

public class PerformanceAspect {
	
	public Object responseTime(ProceedingJoinPoint jp) throws Throwable{
		// 사전 작업
		long startTime = System.nanoTime();
		Object result = jp.proceed();
		// 사후 작업
		Signature signature = jp.getSignature();
		System.out.println(signature.toLongString()+", Elapsed Time : "+(System.nanoTime() - startTime)+" ns");
		return result;
	}
	
}
