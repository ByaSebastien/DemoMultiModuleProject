package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "User_")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
