package me.rose.springbootdeveloper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // 스프링 부트 사용에 필요한 기본 설정을 해준다.
public class SpringBootDeveloperApplication {
    public static void main(String[] args) {
        // SpringApplication.run() 메소드는 애플리케이션을 실행한다.
        // 첫 번째 인수는 스프링 부트 3 애플리케이션의 메인 클래스로 사용할 클래스
        // 두 번째 인수는 커맨드 라인의 인수들을 전달한다.
        SpringApplication.run(SpringBootDeveloperApplication.class, args);
    }

    // @SpringBootConfiguration
    // 스프링 부트 관련 설정을 나타내는 어노테이션이다.
    // @Configuration을 상속해서 만든 어노테이션이다.

    // @ComponentScan
    // 사용자가 등록한 빈을 읽고 등록하는 어노테이션이다.
    // 이 어노테이션은 @Component라는 어노테이션을 가진 클래스들을 찾아 빈으로 등록하는 역할을 한다.
    // 그렇다고 모든 빈에 @Component만 사용하는 게 아니다.

    // @EnableAutoConfiguration
    // 스프링 부트에서 자동 구성을 활성화하는 어노테이션이다.
    // 이 어노테이션은 스프링 부트 서버가 실행될 때 스프링 부트의 메타 파일을 읽고 정의된 설정들을 자동으로 구성하는 역할을 수행한다.
    // spring.factories 파일에 클래스들이 모두 @EnableAutoConfiguration을 사용할 때 자동 설정된다.
}
