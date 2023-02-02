package antibiotic.usage.guidalines.service;

import antibiotic.usage.guidalines.model.Medicine;
import antibiotic.usage.guidalines.repository.MedicineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicineService {
    private final MedicineRepository medicineRepository;


    //    create
    public Medicine createMedicine(Medicine medicine) {
        return medicineRepository.save(medicine);
    }


    //    list
    public List<Medicine> getMedicines() {
        return medicineRepository.findAll();
    }



    // get medicine by id
    public Medicine findMedicineById(int medicineId) {
        return medicineRepository.findById(medicineId).get();
    }

    //    update
    public Medicine updateMedicine(Medicine medicine) {
        return medicineRepository.save(medicine);
    }


//    delete
    public void deleteMedicine(int medicineId) {
        medicineRepository.deleteById(medicineId);
    }


}
