package pl.exercise.ferry.basket;

import pl.exercise.ferry.ticket.PersonTicket;
import pl.exercise.ferry.ticket.Ticket;
import pl.exercise.ferry.ticket.persons.AdultTicket;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Basket{

    public static final Basket INSTANCE = new Basket();

    BigDecimal amount = BigDecimal.ZERO;

    static List<Ticket> ticketList = new ArrayList<>();

    private Basket(){
    }

    public void addAmount(BigDecimal price){
         amount = amount.add(price);
    }

    public void addToList(Ticket ticket){
        ticketList.add(ticket);
    }

    public void displayTicketList() {
        if (ticketList.isEmpty()) {
            System.out.println("Nic nie kupiłeś!");
        } else {
            for (Ticket ticket : ticketList) {
                System.out.println("Bilet kupiony dla: " + ticket.getName() + " za kwotę: " + ticket.getPrice().toString());
            }
        }
    }

    public void displayAmount() {
        System.out.println(Basket.INSTANCE.amount.toString());
    }



}
