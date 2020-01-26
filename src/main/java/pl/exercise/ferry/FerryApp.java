package pl.exercise.ferry;

import pl.exercise.ferry.screen.MainScreen;
import pl.exercise.ferry.screen.ScreenManager;

import java.io.IOException;

public class FerryApp {

  public static void main(String[] args) throws IOException {
    ScreenManager screenManager = new ScreenManager();
    screenManager.start();
  }
}
