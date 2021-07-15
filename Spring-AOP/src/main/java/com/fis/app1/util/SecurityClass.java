package com.fis.app1.util;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SecurityClass {

	@Before("execution(public void com.fis1.app.service.ClientService.*())")
	public void doSecurityCheck()
	{
		System.out.println("execute security code");
	}
}
