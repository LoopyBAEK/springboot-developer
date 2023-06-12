package me.rose.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("/test")
    public List<Member> getAllMembers(){
        List<Member> members = testService.getAllMembers();
        return members;
    }
}

// @RestController : 라우터 역할을 하는 어노테이션
// 라우터란 HTTP 요청과 메소드를 연결하는 장치
// 이 어노테이션이 있어야 클라이언트의 요청에 맞는 메소드를 실행할 수 있다.
// @Controller 어노테이션에 @ResponseBody 어노테이션이 합쳐진 결과물이다.
// @Controller 어노테이션이 @ComponentScan을 통해 빈으로 등록되는 이유는 @Controller 어노테이션에서 @Component 어노테이션을 가지고 있기 때문이다.
// @Configuration, @Repository, @Service 어노테이션도 모두 @Component 어노테이션을 가지고 있지만 빈이 무슨 역할을 하는지 명확히 구분하기 위해 다른 이름으로 덮어둔 것이다.
