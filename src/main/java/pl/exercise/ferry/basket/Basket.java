package pl.exercise.ferry.basket;

import pl.exercise.ferry.pax.PaxType;
import pl.exercise.ferry.ticket.PersonTicket;
import pl.exercise.ferry.ticket.Ticket;
import pl.exercise.ferry.ticket.VehicleTicket;
import pl.exercise.ferry.ticket.persons.AdultTicket;
import pl.exercise.ferry.vehicle.Vehicle;
import pl.exercise.ferry.vehicle.VehicleType;

import java.io.FileWriter;
import java.io.IOException;
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
            System.out.println();
        } else {
            for (Ticket ticket : ticketList) {
                System.out.println("Bilet kupiony dla: " + ticket.getName() + " za kwotę: " + ticket.getPrice().toString());
                System.out.println();
            }
        }
    }

    public void displayAmount() {
        System.out.println("Saldo zakupów: " + Basket.INSTANCE.amount.toString() + "zl");
        System.out.println();
    }

    public void saveFiles() throws IOException {
        Writer writer = new Writer();
        FileWriter fileWriter = new FileWriter(writer.createFile());
        for (Ticket ticket: ticketList) {
            if(ticket instanceof PersonTicket){
                fileWriter.write(PaxType.fromAge(((PersonTicket) ticket).getAge()).toString() + ";");
                fileWriter.write(ticket.getName() + ";");
                fileWriter.write(String.valueOf(((PersonTicket) ticket).getAge()) + "\n");
            }
            if(ticket instanceof VehicleTicket){
                fileWriter.write(((VehicleTicket) ticket).getVehicleType().toString() + ";");
                fileWriter.write(((VehicleTicket) ticket).getOwner() + "\n");
            }
        }
        fileWriter.close();
    }
}
