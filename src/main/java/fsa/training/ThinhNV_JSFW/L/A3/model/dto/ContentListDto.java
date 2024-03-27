package fsa.training.ThinhNV_JSFW.L.A3.model.dto;

import fsa.training.ThinhNV_JSFW.L.A3.model.entity.Member;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
public class ContentListDto {

    private String title;

    private String brief;
    private String createdDate;

    public ContentListDto(String title,  String brief, String createdDate) {
        this.title = title;
        this.brief = brief;
        this.createdDate = createdDate;
    }
}
