package fsa.training.ThinhNV_JSFW.L.A3.service.impl;

import fsa.training.ThinhNV_JSFW.L.A3.model.entity.Member;
import fsa.training.ThinhNV_JSFW.L.A3.repository.MemberRepository;
import fsa.training.ThinhNV_JSFW.L.A3.service.MemberService;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public Member getMemberById(int id) {
        return memberRepository.findById(id).orElse(null);
    }
}
