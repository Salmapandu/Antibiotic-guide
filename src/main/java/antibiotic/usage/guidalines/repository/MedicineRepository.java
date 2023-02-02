package antibiotic.usage.guidalines.repository;

import antibiotic.usage.guidalines.model.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineRepository extends JpaRepository<Medicine, Integer> {
}
