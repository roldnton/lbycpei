import acm.program.*;
import acm.graphics.*;
public class HelloACM extends GraphicsProgram {
    public void run(){
        GLabel label = new GLabel("Hello World!!");
        add(label, 100, 100);

        GRect rect = new GRect(200, 200);
        add(rect, 50, 50);
    }
    public static void main(String[] args){
        (new HelloACM()).start(args);
    }
}
