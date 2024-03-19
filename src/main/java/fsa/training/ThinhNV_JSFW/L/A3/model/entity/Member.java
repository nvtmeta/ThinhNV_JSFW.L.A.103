package fsa.training.ThinhNV_JSFW.L.A3.model.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

//    Firstname
    @Column(name = "Firstname", nullable = false)
    private String firstname;

//    Lastname
    @Column(name = "Lastname", nullable = false)
    private String lastname;

//    Email
    @Column(name = "Email", nullable = false)
    private String email;

//    Password
    @Column(name = "Password", nullable = false)
    private String password;

//    Phone
    @Column(name = "Phone", nullable = false)
    private String phone;

//    Username
    @Column(name = "Username", nullable = false)
    private String username;


//    Description
    @Column(name = "Description")
    private String description;

//    CreatedDate
    @Column(name = "CreatedDate")
    @CreationTimestamp
    private LocalDateTime createdDate;

//    UpdatedDate
    @Column(name = "UpdatedTime")
    @UpdateTimestamp
    private LocalDateTime updatedTime;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Content> contents;

}
