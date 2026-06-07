package systemfamily.AI.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "FAMILY_USER")
@Entity
@Data
public class FamilyUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    @ManyToOne
    @JoinColumn(name = "family_id")
    private Family family;

}
