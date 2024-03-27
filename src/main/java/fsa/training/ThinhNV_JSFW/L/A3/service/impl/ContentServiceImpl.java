package fsa.training.ThinhNV_JSFW.L.A3.service.impl;

import fsa.training.ThinhNV_JSFW.L.A3.model.dto.ContentListDto;
import fsa.training.ThinhNV_JSFW.L.A3.model.entity.Content;
import fsa.training.ThinhNV_JSFW.L.A3.repository.ContentRepository;
import fsa.training.ThinhNV_JSFW.L.A3.service.ContentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContentServiceImpl implements ContentService {
    private final ContentRepository contentRepository;

    public ContentServiceImpl(ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }

    @Override
    public void saveContent(Content content) {
        contentRepository.save(content);
    }

    @Override
    public String getContent() {
        return null;
    }

    @Override
    public void deleteContent() {

    }

    @Override
    public void editContent(ContentListDto content) {

    }

    @Override
    public Page<ContentListDto> getContentList(Optional<String> q, Pageable pageable) {
        return contentRepository.findAllDto(q.orElse(null), pageable);
    }

}
