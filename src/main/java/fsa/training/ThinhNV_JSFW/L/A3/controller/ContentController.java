package fsa.training.ThinhNV_JSFW.L.A3.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContentController {


    @GetMapping("/view-content")
    public String viewContent() {
        return "content/view-content";
    }

    @GetMapping("/add-content")
    public String addContent() {
        return "content/content-form";
    }

    @GetMapping("/edit-content")
    public String editContent() {
        return "content/content-form";
    }
}



