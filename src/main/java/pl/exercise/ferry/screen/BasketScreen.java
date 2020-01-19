package pl.exercise.ferry.screen;

import pl.exercise.ferry.basket.Basket;

public class BasketScreen extends AbstractScreen{

    BasketScreen(ScreenManager screenManager) {
        super(screenManager);
    }

    @Override
    public void interact() {
        System.out.println("1. Wyświetl zakupione bilety");
        System.out.println("2. Wyswietl saldo zakupow");
        String firstResponse = in.nextLine();
        if ("1".equalsIgnoreCase(firstResponse)){
            Basket.INSTANCE.displayTicketList();
        }
        if ("2".equalsIgnoreCase(firstResponse)){
            System.out.println("Saldo Twoich zakupów wynosi: ");
            Basket.INSTANCE.displayAmount();
        }
    }

    @Override
    public boolean isSupportingId(ScreenIdentity screenId) {
        return ScreenIdentity.BasketScreen == screenId;
    }
}
