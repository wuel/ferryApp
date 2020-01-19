package pl.exercise.ferry.ticket;

import pl.exercise.ferry.pax.PaxType;

public abstract class PersonTicket implements Ticket {

    private final PaxType paxType;
    protected String name;

    public PersonTicket(PaxType paxType, String name) {
        this.paxType = paxType;
        this.name = name;
    }
}
