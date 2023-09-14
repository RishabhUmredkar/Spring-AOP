package MethodAfterReturningAdvice;
import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class AfterAdvisor implements AfterReturningAdvice{

	

	   public void afterReturning(Object returnValue, Method method,  
		         Object[] args, Object target) throws Throwable {  
		          
		        System.out.println("additional concern after returning advice");  
		    	System.out.println("addition returning advice");
	}

}