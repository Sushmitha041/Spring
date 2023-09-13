package ConfigClass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 
public class AppGamingBasicJava2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(var context = new AnnotationConfigApplicationContext(ConfigurationClass.class)){
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age")); 
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("personmethodcall"));
			System.out.println(context.getBean("personparameter"));
			System.out.println(context.getBean("addressto"));
			System.out.println(context.getBean(Address.class));
		}
		


}
}
