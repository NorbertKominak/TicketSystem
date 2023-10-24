package cz.moneta.ticket.system.ticket;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tickets")
@RequiredArgsConstructor
public class TicketApi {

    private final TicketService service;


    @PostMapping()
    public TicketDto createTicket() {
        return service.create();
    }

    @GetMapping("/first")
    public TicketDto getFirst() {
        return service.getFirst();
    }

    @DeleteMapping("/first")
    public void deleteFirst() {
        service.deleteFirst();
    }
}
