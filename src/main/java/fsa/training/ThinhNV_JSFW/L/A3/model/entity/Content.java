package fsa.training.ThinhNV_JSFW.L.A3.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


//    Title
    @Column(name = "Title", nullable = false)
    private String title;

//    Brief
    @Column(name = "Brief", nullable = false)
    private String brief;

//    Content
    @Column(name = "Content", nullable = false)
    private String content;

//    AuthorId

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "AuthorId", nullable = false)
    private Member author;

//    CreatedDate
    @Column(name = "CreatedDate")
    @CreationTimestamp
    private LocalDateTime createdDate;

//    UpdatedTime
    @Column(name = "UpdatedTime")
    @UpdateTimestamp
    private LocalDateTime updatedTime;
}
