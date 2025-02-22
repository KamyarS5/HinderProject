package com.hinderproject.HinderProject.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String location;
    private double rental_price;
    private String neighborhood;
    private String qualities;

    @ManyToOne
    @JoinColumn(name = "landlord_id")
    private Landlord landlord;
}