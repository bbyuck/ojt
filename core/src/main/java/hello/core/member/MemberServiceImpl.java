package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    // 생성자 주입
    // 생성자에 @Autowired 를 사용하면 컴포넌트 스캔을 통해 의존관계를 자동으로 주입해줌
    // @Autowired == ac.getBean("memberRepository", MemberRepository.class);
    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }


    // 테스트용
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
