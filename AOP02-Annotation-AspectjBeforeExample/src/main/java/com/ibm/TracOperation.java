package com.ibm;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TracOperation {
	
	@Pointcut("execution(* Operation.s*(..))")
	public void ok() {}//pointcut name
	
	@Before("ok()")//appling point cut on before advice
	public void myadvice(JoinPoint jp) {//it is advice
		System.out.println("Slow down");
		System.out.println("Method Signature : "+jp.getSignature());
		System.out.println("Rise speed");
	}
}
