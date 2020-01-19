package pl.exercise.ferry.screen;


import pl.exercise.ferry.basket.Basket;

public class MainScreen extends AbstractScreen {

  public MainScreen(ScreenManager screenManager) {
    super(screenManager);
  }

  public void interact() {
    System.out.println("Witamy w systemie zakupów");
    System.out.println("1. Kup bilet");
    System.out.println("2. Wyświetl stan zakupów");
    String firstResponse = in.nextLine();
    if ("1".equalsIgnoreCase(firstResponse)) {
      screenManager.chooseScreen(ScreenIdentity.TicketScreen);
    }
    if ("2".equalsIgnoreCase(firstResponse)) {
      screenManager.chooseScreen(ScreenIdentity.BasketScreen);
    }
    else {
      screenManager.chooseScreen(ScreenIdentity.MainScreen);
    }
  }

  @Override
  public boolean isSupportingId(ScreenIdentity screenId) {
    return ScreenIdentity.MainScreen == screenId;
  }


}
