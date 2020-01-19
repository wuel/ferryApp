package pl.exercise.ferry.screen;

import java.util.Set;


public class ScreenManager {

    private Set<Screen> screens;

    public ScreenManager() {
        final PersonScreen personScreen = new PersonScreen(this);
        final MainScreen mainScreen = new MainScreen(this);
        final VehicleScreen vehicleScreen = new VehicleScreen(this);
        final TicketScreen ticketScreen = new TicketScreen(this);
        this.screens = Set.of(personScreen, mainScreen, vehicleScreen, ticketScreen);
    }

    public void start() {
        chooseScreen(ScreenIdentity.MainScreen);
    }

    void chooseScreen(ScreenIdentity screenId) {
        Screen chosenScreen = findScreen(screenId);
        chosenScreen.interact();
    }

    private Screen findScreen(ScreenIdentity screenId) {
        for (Screen screen : screens) {
            if (screen.isSupportingId(screenId)) {
                return screen;
            }
        }
        throw new IllegalArgumentException(String.format("There is no screen defined with id %s", screenId));
    }
}
