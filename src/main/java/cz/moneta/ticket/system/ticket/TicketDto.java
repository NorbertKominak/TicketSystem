package cz.moneta.ticket.system.ticket;

import lombok.Getter;
import lombok.Setter;


/**
 * Dto for {@link Ticket} entity.
 */
@Getter
@Setter
public class TicketDto {

    private long number;

    private String created;

    private long order;
}
