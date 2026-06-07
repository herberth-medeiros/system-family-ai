package systemfamily.AI.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Table(name = "TASK")
@Entity
@Data
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private LocalDate dueDate;

    private Boolean completed;

    @ManyToOne
    @JoinColumn(name = "responsible_id")
    private FamilyUser responsible;

    @ManyToOne
    @JoinColumn(name = "family_id")
    private Family family;

}
