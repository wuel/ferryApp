package pl.exercise.ferry.ticket.persons;

import pl.exercise.ferry.pax.PaxType;
import pl.exercise.ferry.ticket.PersonTicket;

import java.math.BigDecimal;

public class AdultTicket extends PersonTicket {

    public AdultTicket(String name) {
        super(PaxType.ADULT, name);
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(10);
    }
}
