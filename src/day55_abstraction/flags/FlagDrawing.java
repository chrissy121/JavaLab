package day55_abstraction.flags;

import java.awt.*;

public class FlagDrawing {
    public static void main(String[] args) {
       RussianFlag russianFlag = new RussianFlag();
       russianFlag.draw();

       FrenchFlag frenchFlag = new FrenchFlag();
       frenchFlag.draw();

       UkrainingFlag ukrainingFlag = new UkrainingFlag();
       ukrainingFlag.draw();

       MongolianFlag mongolianFlag = new MongolianFlag();
       mongolianFlag.draw();
    }
}
