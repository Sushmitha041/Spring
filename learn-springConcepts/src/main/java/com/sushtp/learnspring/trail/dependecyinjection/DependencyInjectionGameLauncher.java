package com.sushtp.learnspring.trail.dependecyinjection;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class BusinessClass{
	
	
	Dependency1 dependency1;
	Dependency2 dependency2;
	
	
//@Autowired	
//public BusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
//		super();
//		this.dependency1 = dependency1;
//		this.dependency2 = dependency2;
//		System.out.println("Constructor injection");
//	}


//	public Dependency1 getDependency1() {
//		return dependency1;
//	}
	@Autowired
	public void setDependency1(Dependency1 dependency1) {
		System.out.println("setter injection1");
		this.dependency1 = dependency1;
	}
//
//	public Dependency2 getDependency2() {
//		return dependency2;
//	}
	@Autowired
	public void setDependency2(Dependency2 dependency2) {
		System.out.println("setter injection2");
		this.dependency2 = dependency2;
	}

	public String toString() {
		return dependency1 +"and"+ dependency2;
	}
}

@Component
class Dependency1{
	
}

@Component
class Dependency2
{
	
}
@Configuration
@ComponentScan
public class DependencyInjectionGameLauncher {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(DependencyInjectionGameLauncher.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(BusinessClass.class));
		}
	}

}
