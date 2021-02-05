package hello.hellospring.service;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService = new MemberService();

    @Test
    @DisplayName("회원가입")
    void join() {
        Member member = new Member();
        member.setName("spring1");

        Long saveId = memberService.join(member);

        Member findMember = memberService.findOne(saveId).get();
        assertThat(member.getName()).isEqualTo(findMember.getName());
    }

    @Test
    @DisplayName("전체 회원 조회")
    public void findMembers() {
        Member member1 = new Member();
        member1.setName("spring1");
        memberService.join(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        memberService.join(member2);

        assertThat(memberService.findMembers().size()).isEqualTo(2);
    }

    @Test
    @DisplayName("단건 조회")
    public void findOne(Long memberId) {
        Member member1 = new Member();
        member1.setName("spring1");
        memberService.join(member1);




    }
}