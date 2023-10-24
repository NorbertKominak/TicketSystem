package cz.moneta.ticket.system.ticket;

import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {

    Ticket findFirstByOrderByCreated();
}
