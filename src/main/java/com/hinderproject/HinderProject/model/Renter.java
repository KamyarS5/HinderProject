package com.hinderproject.HinderProject.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Renter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;
    private int age;
    private String maritalStatus;
    private double incomeRange;
    private String preferredQualities;
}