package SKstudy_1._hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 이게 스프링부트 어플리케이션
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		// 스프링부트 어플리케이션 클래스를 인자로 넣어줌으로 스프링부트 어플리케이션이 실행됨
	}

}
