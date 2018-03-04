package xxhProject;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.xxh.dao.InformationDao;
import cn.xxh.entity.Information;

public class Test1 {
	
	public static void main(String[] args) {
		ApplicationContext content = new ClassPathXmlApplicationContext("spring-mvc.xml");
		String[] aa = content.getBeanDefinitionNames();
		for(String b:aa){
			System.out.println(b);
		}
		InformationDao informationDao = (InformationDao) content.getBean("informationDao");
		 List<Information> BB = informationDao.find();
		 System.out.println(BB);
	}

}
