package pl.exercise.ferry.ticket.persons;

import pl.exercise.ferry.pax.PaxType;
import pl.exercise.ferry.ticket.PersonTicket;

import java.math.BigDecimal;

public class AdultTicket extends PersonTicket {

    public AdultTicket(String name, int age) {
        super(PaxType.ADULT, name, age);
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(10);
    }

    @Override
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
