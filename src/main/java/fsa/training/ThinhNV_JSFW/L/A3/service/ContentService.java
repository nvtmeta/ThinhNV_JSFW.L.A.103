package fsa.training.ThinhNV_JSFW.L.A3.service;

import fsa.training.ThinhNV_JSFW.L.A3.model.dto.ContentListDto;
import fsa.training.ThinhNV_JSFW.L.A3.model.entity.Content;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ContentService {

    void saveContent(Content content);

    String getContent();

    void deleteContent();

    void editContent(ContentListDto content);

    Page<ContentListDto> getContentList(Optional<String> q, Pageable pageable);
}
