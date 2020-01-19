package pl.exercise.ferry.basket;

import pl.exercise.ferry.ticket.Ticket;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Basket{

    public static final Basket INSTANCE = new Basket();

    private BigDecimal amount = BigDecimal.ZERO;

    static List<Ticket> ticketList = new ArrayList<>();


    private Basket(){
    }

    public BigDecimal addAmount(BigDecimal price){
        return amount.add(price);
    }

    public void addToList(Ticket ticket){
        ticketList.add(ticket);
    }






}
