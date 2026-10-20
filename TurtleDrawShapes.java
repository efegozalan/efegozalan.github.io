import java.awt.*;
import java.util.*;

public class TurtleDrawShapes
{

    public static void drawSquare(Turtle t)
    {
        t.setColor(Color.blue);

        for (int i = 0; i < 4; i++)
        {
            t.forward(100);
            t.turn(90);
        }
    }

    public static void drawTriangle(Turtle t)
    {
        t.setColor(Color.green);

        for (int i = 0; i < 3; i++)
        {
            t.forward(100);
            t.turn(120);
        }
    }

    public static void drawPentagon(Turtle t)
    {
        t.setColor(Color.red);

        for (int i = 0; i < 5; i++)
        {
            t.forward(100);
            t.turn(72);
        }
    }

    public static void drawShape(Turtle t, int n, int pixels)
    {
        t.setColor(Color.black);

        for (int i = 0; i < n; i++)
        {
            t.forward(pixels);
            t.turn(360 / n);
        }
    }

    public static void main(String[] args)
    {
        World world = new World(400, 400);
        Turtle yertle = new Turtle(world);

        yertle.penUp();
        yertle.moveTo(100, 200);
        yertle.penDown();
        yertle.setSpeed(25);

        // Draw a square
        drawSquare(yertle);

        // Draw a triangle
        drawTriangle(yertle);

        // Draw a pentagon
        drawPentagon(yertle);

        // Draw a shape with 4 sides
        drawShape(yertle, 4, 50);

        // Draw a hexagon with 6 sides and length 20
        drawShape(yertle, 6, 20);

        world.show(true);
    }
}
