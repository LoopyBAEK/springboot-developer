package me.rose.springbootdeveloper;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}

// 이 인터페이스는 DB에서 데이터를 가져오는 퍼시스턴트 계층 역할을 할 것이다.