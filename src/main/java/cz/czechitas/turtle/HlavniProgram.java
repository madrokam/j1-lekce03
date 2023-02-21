package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka=new Turtle();


    public void start() {
        ctverec(50,Color.pink);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(100);
        zofka.penDown();

        ctverec(50,Color.red);

    }

    public void ctverec(double delkaStrany, Color barva) {
        zofka.setPenColor(barva);
        for (int i=0; i < 4; i++) {

            zofka.move(delkaStrany);
            zofka.turnRight(90);
        }
    }


    public static void main(String[] args) {
        new HlavniProgram().start();




    }


}
