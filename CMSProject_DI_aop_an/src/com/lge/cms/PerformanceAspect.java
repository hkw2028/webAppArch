package com.lge.cms;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class PerformanceAspect {
	
	@Around("execution(* *..*ServiceImpl.*(..))")
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
