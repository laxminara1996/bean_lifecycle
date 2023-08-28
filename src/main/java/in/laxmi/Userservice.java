package in.laxmi;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

@Service
@DependsOn("userDao")

public class Userservice {

	public Userservice() {
		// TODO Auto-generated constructor stub
		System.out.println("userService:: constructor");
	}

}
