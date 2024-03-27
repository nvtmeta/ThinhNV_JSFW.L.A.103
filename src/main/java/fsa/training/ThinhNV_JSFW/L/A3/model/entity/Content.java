package fsa.training.ThinhNV_JSFW.L.A3.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Nationalized;
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

    @Nationalized
    @Column(name = "Title", nullable = false)
    private String title;

    @Nationalized
    @Column(name = "Brief", nullable = false)
    private String brief;

    @Nationalized
    @Column(name = "Content", nullable = false)
    private String content;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "AuthorId", nullable = false)
    private Member author;

    @Column(name = "CreatedDate")
    @CreationTimestamp
    private LocalDateTime createdDate;

    @Column(name = "UpdatedTime")
    @UpdateTimestamp
    private LocalDateTime updatedTime;
}
