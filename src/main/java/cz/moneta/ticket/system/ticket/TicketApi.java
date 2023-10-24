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

    @GetMapping("/current")
    public TicketDto getCurrent() {
        return service.getCurrent();
    }

    @DeleteMapping("/current")
    public void deleteCurrent() {
        service.deleteCurrent();
    }
}
