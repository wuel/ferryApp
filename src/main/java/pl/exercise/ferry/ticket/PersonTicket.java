package pl.exercise.ferry.ticket;

import pl.exercise.ferry.pax.PaxType;

public abstract class PersonTicket implements Ticket {

    private final PaxType paxType;
    protected String name;
    protected int age;

    public PersonTicket(PaxType paxType, String name, int age) {
        this.paxType = paxType;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
