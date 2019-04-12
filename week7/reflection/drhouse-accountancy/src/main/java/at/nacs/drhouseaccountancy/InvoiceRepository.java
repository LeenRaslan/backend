package at.nacs.drhouseaccountancy;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

    List<Invoice> countAllByTreatmentCost
}
