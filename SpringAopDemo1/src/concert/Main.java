package concert;

import org.springframework.context.support.ClassPathXmlApplicationContext;


//ͨ��ʹ�û���Javaע�������(ע��AccountDaoInMemoryImpl���AccountServiceImpl��)��������ʹ��Spring����
public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		Performance performance = applicationContext.getBean(
				"performanceImpl", Performance.class);
		
		performance.perform();
	}
}