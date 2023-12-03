package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    // MemberService는 여러 개를 생성할 이유가 없음
    // private final MemberService memberService = new MemberService();

    private final MemberService memberService;

    // 스프링 컨테이너에서 memberService를 가져옴
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
