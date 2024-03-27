package fsa.training.ThinhNV_JSFW.L.A3.model.dto;

import fsa.training.ThinhNV_JSFW.L.A3.model.entity.Content;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

public class MemberDto {
    private Integer id;
    private String firstname;
    private String email;
    private String password;
    private String username;
}
