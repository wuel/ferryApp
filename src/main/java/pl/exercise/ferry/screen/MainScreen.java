package pl.exercise.ferry.screen;


import pl.exercise.ferry.basket.Basket;

import java.io.IOException;

public class MainScreen extends AbstractScreen {

  public MainScreen(ScreenManager screenManager) {
    super(screenManager);
  }

  public void interact() {
    System.out.println("Witamy w systemie zakupów");
    System.out.println("1. Kup bilet");
    System.out.println("2. Wyświetl stan zakupów");
    System.out.println("3. Zamknij program");
    String firstResponse = in.next();
    if ("1".equalsIgnoreCase(firstResponse)) {
      screenManager.chooseScreen(ScreenIdentity.TicketScreen);
    }
    if ("2".equalsIgnoreCase(firstResponse)) {
      screenManager.chooseScreen(ScreenIdentity.BasketScreen);
    }
    if ("3".equalsIgnoreCase(firstResponse)) {
      try {
        Basket.INSTANCE.saveFiles();
      } catch (IOException e) {
        e.printStackTrace();
      }
      System.out.println("Dziękujemy za zakupy :)");
      System.exit(0);
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
