package com.ibm;

/*import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;*/

public class EmployeeTest {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee employee = factory.getBean("emp", Employee.class);
		employee.display();

		/*ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Employee employee1 = ctx.getBean("emp", Employee.class);
		employee1.display();*/
	}
}