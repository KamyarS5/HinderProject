package com.hinderproject.HinderProject.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Landlord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;
    
    @OneToMany(mappedBy = "landlord", cascade = CascadeType.ALL)
    private List<Property> properties;
}
