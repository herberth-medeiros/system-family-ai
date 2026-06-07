package systemfamily.AI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import systemfamily.AI.entity.Family;

public interface FamilyRepository extends JpaRepository<Family, Long> {
}
