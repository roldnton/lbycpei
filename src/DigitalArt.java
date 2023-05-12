import acm.program.*;
import acm.graphics.*;

import java.awt.*;

public class DigitalArt extends GraphicsProgram {
    public void run(){
        for (int i = 500; i < 750; i += 10) {
            GOval oval = new GOval(i, i);
            oval.setColor(Color.YELLOW);
            oval.setFilled(true);
            add(oval, 100, 100);
        }
        for (int i = 500; i < 750; i += 1) {
            GOval oval2 = new GOval(i, i);
            add(oval2, 100, 100);
        }
    }
    public static void main(String[] args){
        (new DigitalArt()).start(args);
    }
}
