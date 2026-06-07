package systemfamily.AI.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "FAMILY")
@Entity
@Data
public class Family {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

}
