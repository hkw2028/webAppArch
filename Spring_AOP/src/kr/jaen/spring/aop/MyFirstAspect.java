package kr.jaen.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

import kr.jaen.spring.aop1.Employee;

public class MyFirstAspect {

    public void aaa(JoinPoint jp) {
        System.out.println("Hello Before! ");
        Signature sig = jp.getSignature();
        System.out.println("-----> " + sig.getName());
        Object[] o = jp.getArgs();
        System.out.println("----->" + o[0]);
    }

    public void bbb() {
        System.out.println("Hello After! *");
    }

    public void afterReturning(JoinPoint jp, Employee e) {
        System.out.println("Hello AfterReturning! ");
        Signature sig = jp.getSignature();
        System.out.println("-----> " + sig.getName());
        Object[] o = jp.getArgs();
        System.out.println("-----> " + o[0]);
    }

    public Employee around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Hello Around! before");
        Employee p = (Employee) pjp.proceed();
        System.out.println("Hello Around! after "+p);
        return p;
    }

    public String around2(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("***pre proceed");
        Signature sig = pjp.getSignature();
        System.out.println("Sig: " + sig.getName());
        String msg = (String) pjp.proceed();
        System.out.println("***post proceed");
        return msg;
    }

    public void afterThrowing(Throwable ex) {
        System.out.println("Hello Throwing! ");
        System.out.println("exception value = " + ex.toString());
    }
}