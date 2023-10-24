package cz.moneta.ticket.system.ticket;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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

    public TicketDto getFirst() {
        Ticket ticket = repository.findFirstByOrderByCreated();

        if (ticket == null) {
            throw new ResponseStatusException(
                    org.springframework.http.HttpStatus.NOT_FOUND,
                    "No tickets found");
        }

        return TicketDtoMapper.convertFrom(ticket, 0);
    }


}
