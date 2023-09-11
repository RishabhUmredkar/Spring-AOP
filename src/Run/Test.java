package Run;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	Resource r = new ClassPathResource("applicationContext.xml");
	BeanFactory factory = new XmlBeanFactory(r);
	
	Actual ac = factory.getBean("proxy",Actual.class);
	ac.m();

}
