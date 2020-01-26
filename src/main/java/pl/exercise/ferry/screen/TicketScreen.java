package pl.exercise.ferry.screen;

import pl.exercise.ferry.basket.Basket;

import java.io.IOException;

public class TicketScreen extends AbstractScreen {

    TicketScreen(ScreenManager screenManager) {
        super(screenManager);
    }

    @Override
    public void interact() throws IOException {
        System.out.println("Wybierz bilet który chcesz kupić");
        System.out.println("1. Dodanie osoby do rejsu");
        System.out.println("2. Dodanie pojazdu i jego włąściciela do rejsu");
        System.out.println("3. Dodanie towaru do rejsu");
        System.out.println("4. Zakończenie rejsu");
        System.out.println("5. Wyszukiwanie uczestnika rejsu");
        System.out.println("6. Powrót do menu głównego");
        String secondResponse = in.next();
        if("1".equalsIgnoreCase(secondResponse)){
           screenManager.chooseScreen(ScreenIdentity.PersonScreen);
        }
        if ("2".equalsIgnoreCase(secondResponse)) {
            screenManager.chooseScreen(ScreenIdentity.VehicleScreen);
        }
        if ("3".equalsIgnoreCase(secondResponse)) {
            screenManager.chooseScreen(ScreenIdentity.CargoScreen);
        }
        if ("4".equalsIgnoreCase(secondResponse)) {
            try {
                Basket.INSTANCE.saveFiles();
                Basket.INSTANCE.basketCleaner();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if("6".equalsIgnoreCase(secondResponse)){
            screenManager.chooseScreen(ScreenIdentity.MainScreen);
        }
        screenManager.chooseScreen(ScreenIdentity.TicketScreen);
    }

    @Override
    public boolean isSupportingId(ScreenIdentity screenId) {
        return ScreenIdentity.TicketScreen == screenId;
    }

}
