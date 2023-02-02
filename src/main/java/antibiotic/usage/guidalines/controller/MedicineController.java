package antibiotic.usage.guidalines.controller;

import antibiotic.usage.guidalines.model.Medicine;
import antibiotic.usage.guidalines.service.MedicineService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicine")
@AllArgsConstructor
public class MedicineController {
    private final MedicineService medicineService;


    @PostMapping("/createMedicine")
    public ResponseEntity<Medicine> createMedicine(@RequestBody Medicine medicine) {
        Medicine newMedicine = medicineService.createMedicine(medicine);
        return new ResponseEntity<>(newMedicine, HttpStatus.CREATED);
    }


    @GetMapping("/all")
    public ResponseEntity<List<Medicine>> getMedicines() {
        List<Medicine> medicines = medicineService.getMedicines();
        return new ResponseEntity<>(medicines, HttpStatus.OK);
    }


    @GetMapping("/find/{medicineId}")
    public ResponseEntity<Medicine> createMedicine(@PathVariable("medicineId") int medicineId) {
        Medicine medicine = medicineService.findMedicineById(medicineId);
        return new ResponseEntity<>(medicine, HttpStatus.OK);
    }

//    update
    @PutMapping("/updateMedicine")
    public ResponseEntity<Medicine> updateMedicine(@RequestBody Medicine medicine) {
        Medicine updatedMedicine = medicineService.updateMedicine(medicine);
        return new ResponseEntity<>(updatedMedicine, HttpStatus.OK);
    }


//    delete
    @DeleteMapping("/deleteMedicine/{medicineId}")
    public ResponseEntity<?> deleteMedicine(@PathVariable("medicineId") int medicineId) {
        medicineService.deleteMedicine(medicineId);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
