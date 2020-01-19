package pl.exercise.ferry.screen;

import java.util.Scanner;

public abstract class AbstractScreen implements Screen{

    final ScreenManager screenManager;
    final Scanner in = new Scanner(System.in);

    AbstractScreen(ScreenManager screenManager) {
        this.screenManager = screenManager;
    }

    protected void cleanBuffer() {
        if (in.hasNext()){
            in.next();
        }
    }


}
