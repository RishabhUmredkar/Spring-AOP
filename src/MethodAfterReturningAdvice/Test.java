package MethodAfterReturningAdvice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {  
	Resource r = new ClassPathResource("MethodAfterReturningAdvice/applicationContext.xml");
	BeanFactory factory = new XmlBeanFactory(r);
	
	Actual ac = factory.getBean("proxy",Actual.class);
    System.out.println("proxy class name: "+ac.getClass().getName());  

	ac.m();
	}
}
