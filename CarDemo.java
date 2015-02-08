class Car
{
    int num;
    String color;

    void run()
    {
        System.out.println(num + "----" + color);
    }
}

class CarDemo
{
    public static void main(String[] args)
    {
        Car c1 = new Car();
        Car c2 = new Car();
        show(c1);
        show(c2);
    }
    public static Car show(Car c)
    {
        c.num = 4;
        c.color = "blue";
        c.run();
        return c;
    }
}
