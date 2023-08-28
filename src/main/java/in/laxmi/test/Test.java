package in.laxmi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.laxmi.AppConfig;
import in.laxmi.dao.UserDao;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ApplicationContext 
	context = new AnnotationConfigApplicationContext(AppConfig.class);
  
	}

}
