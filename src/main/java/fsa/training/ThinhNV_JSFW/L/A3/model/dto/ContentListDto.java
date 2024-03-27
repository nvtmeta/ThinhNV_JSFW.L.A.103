package fsa.training.ThinhNV_JSFW.L.A3.model.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Getter
@Setter
public class ContentListDto {

    private int id;

    private String title;

    private String brief;

    private LocalDateTime createdDate;

    public ContentListDto(int id, String title, String brief, LocalDateTime createdDate) {
        this.id = id;
        this.title = title;
        this.brief = brief;
        this.createdDate = createdDate;
    }
}
