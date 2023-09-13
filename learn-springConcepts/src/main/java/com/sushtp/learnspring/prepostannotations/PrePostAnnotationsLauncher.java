package com.sushtp.learnspring.prepostannotations;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass{
	private SomeDependency someDependency;
	
	public SomeClass(SomeDependency someDependency)
	{
		this.someDependency = someDependency;
		System.out.println("Dependency are ready");
	}
	
	@PostConstruct
	public void initialise() {
		someDependency.initialise();
	}
	
	@PreDestroy
	public void cleanUp()
	{
		System.out.println("Cleaned up");
	}
}

@Component
class SomeDependency{

	public void initialise() {
		// TODO Auto-generated method stub
		System.out.println("Post Contruct work done");
	}
	
}
@Configuration
@ComponentScan
public class PrePostAnnotationsLauncher {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationsLauncher.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
		}
	}

}
