import java.util.Arrays;

class MyPoint
{
    int x;
    int y;
}

class Circle extends MyPoint
{
    int r;

    int x;
}

public class HelloWorld {
    public static void main(String[] args)
    {
        Circle c = new Circle();

        c.x = 1;
        c.y = 2;
        c.r = 3;


        System.out.println(("c.x=" + c.x));
        System.out.println(("c.y=" + c.y));
        System.out.println(("c.r=" + c.r));
    }
}
