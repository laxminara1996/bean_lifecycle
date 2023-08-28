package in.laxmi.dao;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
@Component
public class UserDao implements InitializingBean,DisposableBean{

public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("get data from db");
}

public void destroy() throws Exception {
	// TODO Auto-generated method stub
	
}

}
