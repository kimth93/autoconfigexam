package kr.ac.skuniv.autoconfigexam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringExam1 {
	
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");
		
		myBean bean = context.getBean(myBean.class);
		
		bean.setName("kim");
		System.out.println(bean.getName());
		
	}
	

}
