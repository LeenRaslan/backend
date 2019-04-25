package at.nacs.drhouseaccountancy.persistance.repository;

import at.nacs.drhouseaccountancy.persistance.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
