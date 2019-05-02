package at.nacs.drhouseaccountancy.communication.endpoint;

import at.nacs.drhouseaccountancy.logic.Accountant;
import at.nacs.drhouseaccountancy.logic.InvoiceManager;
import at.nacs.drhouseaccountancy.persistance.domain.Invoice;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/invoices")
@RestController
public class InvoicesEndpoint {

    private final InvoiceManager manager;
    private final Accountant accountant;

    @GetMapping
    Invoice get(Invoice invoice) {
        manager.store(invoice);
        return invoice;
    }

    @PutMapping("/{id}/paid")
    void put(@PathVariable Long id){
        manager.isPaid(id);
    }
}
