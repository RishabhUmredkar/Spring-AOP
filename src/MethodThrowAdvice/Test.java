package MethodThrowAdvice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {  
	Resource r = new ClassPathResource("MethodThrowAdvice/applicationContext.xml");
	BeanFactory factory = new XmlBeanFactory(r);
	
	validator ac = factory.getBean("proxy",validator.class);
  
	try {
		ac.validate(15);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}