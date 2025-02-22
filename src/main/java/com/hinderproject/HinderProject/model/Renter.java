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

    @NotBlank(message = "This section cannot be blank")
    private String name;

    @Email(message = "Please enter a valid email")
    @Column(unique = true)
    private String email;

    @Notblank(message = "This section cannot be blank");
    private String password;
    private int age;
    private String maritalStatus;

    @Positive(message = "Income must be positive");
    private double incomeRange;
    private String preferredQualities;

    @OneToMany(mappedBy = "renter", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<RentalListing> rentalListings;

}