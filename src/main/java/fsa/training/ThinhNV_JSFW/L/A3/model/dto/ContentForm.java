package fsa.training.ThinhNV_JSFW.L.A3.model.dto;

import fsa.training.ThinhNV_JSFW.L.A3.model.entity.Member;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContentForm {
    private Integer id;

    private String title;

    private String brief;

    private String content;

    private Long authorId;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime createdDate;
}
