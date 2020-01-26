package pl.exercise.ferry.screen;

import pl.exercise.ferry.basket.Basket;
import pl.exercise.ferry.basket.Reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class BasketScreen extends AbstractScreen{

    String id;

    BasketScreen(ScreenManager screenManager) {
        super(screenManager);
    }

    @Override
    public void interact() throws IOException {
        if (Basket.INSTANCE.ticketList.isEmpty()) {
            System.out.println("Podaj id swoich zakupów");
            id = in.next();
            Reader reader = new Reader();
            reader.readFile(id);
        }
        System.out.println("1. Wyświetl zakupione bilety");
        System.out.println("2. Wyswietl saldo zakupow");
        System.out.println("3. Wróć do menu głównego");

        String firstResponse = in.next();
        if ("1".equalsIgnoreCase(firstResponse)) {
            Basket.INSTANCE.displayTicketList();
        }
        if ("2".equalsIgnoreCase(firstResponse)) {
            Basket.INSTANCE.displayAmount();
        }
        if ("3".equalsIgnoreCase(firstResponse)) {
            Basket.INSTANCE.ticketList.clear();
            Basket.INSTANCE.zeroAmount();
            screenManager.chooseScreen(ScreenIdentity.MainScreen);
        }
        screenManager.chooseScreen(ScreenIdentity.BasketScreen);
    }

    @Override
    public boolean isSupportingId(ScreenIdentity screenId) {
        return ScreenIdentity.BasketScreen == screenId;
    }

    public String getId() {
        return id;
    }
}
