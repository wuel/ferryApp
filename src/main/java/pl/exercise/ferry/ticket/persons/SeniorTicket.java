package pl.exercise.ferry.ticket.persons;

import pl.exercise.ferry.pax.PaxType;
import pl.exercise.ferry.ticket.PersonTicket;

import java.math.BigDecimal;

public class SeniorTicket extends PersonTicket {

    public SeniorTicket() {
        super(PaxType.SENIOR);
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(5);
    }
}
