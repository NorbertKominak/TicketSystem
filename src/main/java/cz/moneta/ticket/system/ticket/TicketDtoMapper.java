package cz.moneta.ticket.system.ticket;

import org.springframework.lang.NonNull;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TicketDtoMapper {

    public static TicketDto convertFrom(@NonNull Ticket ticket, long order) {
        TicketDto ticketDto = new TicketDto();

        ticketDto.setNumber(ticket.getNumber());
        ticketDto.setOrder(order);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
                .withZone(ZoneId.systemDefault());
        ticketDto.setCreated(formatter.format(ticket.getCreated()));

        return ticketDto;
    }
}
