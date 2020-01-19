package pl.exercise.ferry.screen;

public class TicketScreen extends AbstractScreen {

    TicketScreen(ScreenManager screenManager) {
        super(screenManager);
    }

    @Override
    public void interact() {
        System.out.println("WWybierz bilet który chcesz kupić");
        System.out.println("1. Osoba");
        System.out.println("2. Pojazd");
        String secondResponse = in.nextLine();
        if("1".equalsIgnoreCase(secondResponse)){
           screenManager.chooseScreen(ScreenIdentity.PersonScreen);
        }
        if ("2".equalsIgnoreCase(secondResponse)) {
            screenManager.chooseScreen(ScreenIdentity.VehicleScreen);
        }
        screenManager.chooseScreen(ScreenIdentity.MainScreen);
    }

    @Override
    public boolean isSupportingId(ScreenIdentity screenId) {
        return ScreenIdentity.TicketScreen == screenId;
    }

}
