

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sushtp.learnspring.game.GameRunner;

@Configuration
@ComponentScan("com.sushtp.learnspring.game")
public class GamingLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GamingLauncherApplication.class)) {
			context.getBean(GameRunner.class).run();
		}
	}

}
