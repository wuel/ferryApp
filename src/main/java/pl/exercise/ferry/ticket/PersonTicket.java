package pl.exercise.ferry.ticket;

import pl.exercise.ferry.pax.PaxType;

public abstract class PersonTicket implements Ticket {

    private final PaxType paxType;

    public PersonTicket(PaxType paxType) {
        this.paxType = paxType;
    }
}
