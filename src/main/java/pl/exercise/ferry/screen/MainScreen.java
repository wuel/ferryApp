package pl.exercise.ferry.screen;


public class MainScreen extends AbstractScreen {

  public MainScreen(ScreenManager screenManager) {
    super(screenManager);
  }

  public void interact() {
    System.out.println("Witamy w systemie zakupów");
    System.out.println("1. Kup bilet");
    String firstResponse = in.nextLine();
    if ("1".equalsIgnoreCase(firstResponse)) {
      screenManager.chooseScreen(ScreenIdentity.TicketScreen);
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
