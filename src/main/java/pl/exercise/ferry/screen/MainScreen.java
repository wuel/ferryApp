package pl.exercise.ferry.screen;

import java.io.IOException;

public class MainScreen extends AbstractScreen {

  public MainScreen(ScreenManager screenManager) {
    super(screenManager);
  }

  public void interact() throws IOException {
    System.out.println("Witamy w systemie zakupów");
    System.out.println("1. Utworzenie nowego rejsu");
    System.out.println("2. Odczyt zapisanych danych");
    System.out.println("3. Zamknij program");
    String firstResponse = in.next();
    if ("1".equalsIgnoreCase(firstResponse)) {
      screenManager.chooseScreen(ScreenIdentity.TicketScreen);
    }
    if ("2".equalsIgnoreCase(firstResponse)) {
      screenManager.chooseScreen(ScreenIdentity.BasketScreen);
    }
    if ("3".equalsIgnoreCase(firstResponse)) {
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
