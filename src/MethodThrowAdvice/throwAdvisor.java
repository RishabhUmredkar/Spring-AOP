package MethodThrowAdvice;

import org.springframework.aop.ThrowsAdvice;

public class throwAdvisor  implements ThrowsAdvice{
	public void afterThrowing(Exception ex) {
		System.out.println("additional concern if exception is occur");
	}
}
