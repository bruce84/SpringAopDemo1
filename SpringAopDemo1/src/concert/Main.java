package concert;

import org.springframework.context.support.ClassPathXmlApplicationContext;


//通过使用基于Java注解的配置(注解AccountDaoInMemoryImpl类和AccountServiceImpl类)来创建和使用Spring容器
public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		Performance performance = applicationContext.getBean(
				"performanceImpl", Performance.class);
		
		performance.perform();
	}
}