package com.fis.app1.util;

import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingClass {
	
	@After("execution(public void com.fis.app1.service.ClientService.doOrder())")
	public void doLogging()
	{
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("[INFO] do logging ->"+dateTime);
	}
	

	@After("execution(public * doPayment( ))")
	public void doLogging1()
	{
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("[INFO] do logging1 ->"+dateTime);
	}

	@After("execution(public * do*(*))")
	public void doLogging2(JoinPoint joinPoint)
	{
		LocalDateTime dateTime = LocalDateTime.now();
		//System.out.println("[INFO] do logging ->"+dateTime);
		
		Object obj[ ] = joinPoint.getArgs();
		String paymentType = " ";
		for (Object arg: obj) {
			if(arg instanceof String)
			{
				paymentType = (String)arg;
			}
		}
		System.out.println("[INFO] Do Logging with Payment Type called for "+paymentType+" -> "+dateTime);
	}

}
