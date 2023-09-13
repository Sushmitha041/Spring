package ConfigClass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name,int age,Address address) {};
record Address(String home,String city) {};

@Configuration
public class ConfigurationClass {
	
	@Bean
	public String name()
	{
		return "NoOne";
	}
	@Bean
	public int age()
	{
		return 23;
	}
	@Bean
	public Person person()
	{
		return new Person("Sush",15,new Address("120","abcd"));
	}
	@Bean
	public Person personmethodcall()
	{
		return new Person(name(),age(),address());
	}
	@Bean
	public Person personparameter(String name, int age, Address addressto)
	{
		return new Person(name,age,addressto);
	}
	@Bean(name ="addressto")
	public Address address()
	{
		return new Address("139","Banglore");
	}
}
