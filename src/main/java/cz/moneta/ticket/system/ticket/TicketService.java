package cz.moneta.ticket.system.ticket;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@RequiredArgsConstructor
public class TicketService {

    private final TicketRepository repository;


    public TicketDto create() {
        Ticket ticket = new Ticket();
        ticket.setCreated(Instant.now());

        ticket = repository.save(ticket);

        return TicketDtoMapper.convertFrom(ticket, repository.count() - 1);
    }
}
