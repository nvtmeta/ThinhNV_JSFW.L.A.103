package fsa.training.ThinhNV_JSFW.L.A3.repository;

import fsa.training.ThinhNV_JSFW.L.A3.model.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {
}
