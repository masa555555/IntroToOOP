package week1.classes;
import java.awt.*;

public class Rectangle {

    // fields
    private double width;
    private double height;


    //constructors

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;

    }

    //methods

    void paint ( Graphics g) {

        g.setColor(Color.blue);
        // x,y: coordinate.
        g.drawRect(0, 0, 1, 1);
    }








}