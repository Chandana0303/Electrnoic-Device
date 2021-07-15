package com.fis.app1.util;

import java.time.LocalDateTime;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingClass {
	
	@After("execution(public * do(*)")
	public void doLogging()
	{
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("[INFO] do logging ->"+dateTime);
	}

}
