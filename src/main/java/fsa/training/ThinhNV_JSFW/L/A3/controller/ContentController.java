package fsa.training.ThinhNV_JSFW.L.A3.controller;


import fsa.training.ThinhNV_JSFW.L.A3.model.dto.ContentForm;
import fsa.training.ThinhNV_JSFW.L.A3.model.dto.ContentListDto;
import fsa.training.ThinhNV_JSFW.L.A3.model.entity.Content;
import fsa.training.ThinhNV_JSFW.L.A3.model.entity.Member;
import fsa.training.ThinhNV_JSFW.L.A3.service.ContentService;
import fsa.training.ThinhNV_JSFW.L.A3.service.MemberService;
import fsa.training.ThinhNV_JSFW.L.A3.util.DateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Controller
public class ContentController {
    private final ContentService contentService;
    private final MemberService memberService;

    public ContentController(ContentService contentService, MemberService memberService) {
        this.contentService = contentService;
        this.memberService = memberService;
    }

    @GetMapping("/view-content")
    public String viewContent(Model model,
                              @PageableDefault(size = 5, page = 0) Pageable pageable,
                              @RequestParam(name = "q") Optional<String> q
    ) {

        Page<ContentListDto> contentList = contentService.getContentList(q, pageable);

//      /formate date
        for (ContentListDto content : contentList) {
            if(content.getCreatedDate() != null) {
                LocalDateTime createdDate = LocalDateTime.parse(content.getCreatedDate());
                content.setCreatedDate(DateUtils.formatDateTime(createdDate));
            }
        }
        System.out.println("contentList = " + contentList);
        model.addAttribute("contentList", contentList);

        return "content/view-content";
    }

    @GetMapping("/add-content")
    public String addContent(Model model) {

        model.addAttribute("contentForm", new ContentForm());
        return "content/content-form";
    }

    @PostMapping("/add-content")
    public String addContent(@ModelAttribute("contentForm") ContentForm contentForm) {
        Content content = new Content();
        BeanUtils.copyProperties(contentForm, content);

//        TODO, GET author from login session
        Member member = memberService.getMemberById(3);
        content.setAuthor(member);

        contentService.saveContent(content);
        return "redirect:/view-content";
    }

    @GetMapping("/edit-content")
    public String editContent() {
        return "content/content-form";
    }
}



