package pl.exercise.ferry.ticket;

import java.math.BigDecimal;

public class CargoTicket implements Ticket{

    protected TicketType ticketType;
    protected String owner;
    protected double volume;

    public CargoTicket(TicketType ticketType, String owner, double volume) {
        this.ticketType = TicketType.CARGO;
        this.owner = owner;
        this.volume = volume;
    }

    public String getOwner() {
        return owner;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(volume*50);
    }

    @Override
    public String getName() {
        return "cargo";
    }
}
