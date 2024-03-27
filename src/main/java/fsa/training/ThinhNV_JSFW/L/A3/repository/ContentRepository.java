package fsa.training.ThinhNV_JSFW.L.A3.repository;

import fsa.training.ThinhNV_JSFW.L.A3.model.dto.ContentListDto;
import fsa.training.ThinhNV_JSFW.L.A3.model.entity.Content;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ContentRepository extends JpaRepository<Content, Integer> {

    //    search q is optional, if not, then get all
    @Query("SELECT new fsa.training.ThinhNV_JSFW.L.A3.model.dto.ContentListDto(c.title, c.brief, CAST(c.createdDate AS string))" +
            "  FROM Content c WHERE c.title LIKE %:q% OR c.brief LIKE %:q% " +
            "OR :q IS NULL ")
    Page<ContentListDto> findAllDto(@Param("q") String q, Pageable pageable);
}
