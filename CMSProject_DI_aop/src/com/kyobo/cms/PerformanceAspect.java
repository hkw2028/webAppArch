package com.kyobo.cms;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

public class PerformanceAspect {
	
	public Object responseTime(ProceedingJoinPoint jp) throws Throwable{
		// ���� �۾�
		long startTime = System.nanoTime();
		Object result = jp.proceed();
		// ���� �۾�
		Signature signature = jp.getSignature();
		System.out.println(signature.toLongString()+", Elapsed Time : "+(System.nanoTime() - startTime)+" ns");
		return result;
	}
	
}
