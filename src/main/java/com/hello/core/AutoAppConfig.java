package com.hello.core;

import com.hello.core.member.MemberRepository;
import com.hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(excludeFilters = @Filter(type = FilterType.ANNOTATION, classes = Configuration.class))
public class AutoAppConfig {

//    @Bean(name = "memoryMemberRepository")
//    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }
}
/*
* 컴포넌트 스캔 기본 대상
컴포넌트 스캔은 @Component 뿐만 아니라 다음과 내용도 추가로 대상에 포함한다.
@Component : 컴포넌트 스캔에서 사용
@Controller : 스프링 MVC 컨트롤러에서 사용
@Service : 스프링 비즈니스 로직에서 사용
@Repository : 스프링 데이터 접근 계층에서 사용
@Configuration : 스프링 설정 정보에서 사용
* */

/*
* 수동 빈 등록 vs 자동 빈 등록
*
* 수동 빈 등록이 우선권을 가진다 (수동 빈이 자동 빈을 오버라이딩 해버린다.)
* 개발자가 의도한 바라면 좋으나, 실제로는 여러 설정이 꼬여 나온 결과가 많다.
* 이는 정말 잡기 어려운 버그가 만들어진다.
*  따라서 최근 스프링부트에서는 수동빈과 자동빈 출동 시 오류가 발생하도록 만들었다.
*
* Consider renaming one of the beans or enabling overriding by setting
spring.main.allow-bean-definition-overriding=tru
* */