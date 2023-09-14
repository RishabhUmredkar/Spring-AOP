package MethodBeforeAdvisorTest;
import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class beforeAdvisor implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] arg1, Object target	) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Additional concern before logic");
		System.out.println("Method Info : "+method.getName()+"  "+method.getModifiers());
		System.out.println("Argunment Info.....");
		for(Object arg : arg1)
			System.out.println(arg);
		System.out.println("target Object "+target);
		System.out.println("target object class name : "+target.getClass().getName());
	}

}