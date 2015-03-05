interface Demo
{
    public static final int NUM = 4;
    public abstract void show1();
    public abstract void show2();
}
//类与类之间是继承关系，类与接口之间是实现关系。
//接口不能实例化，只能由实现了接口的子类并覆盖了
//接口中所有的方法后，该子类才可以实例化。
//否则，子类就是一个抽象类。
class DemoImpl implements Demo
{
    public void show1()
    {}
    public void show2()
    {}
}

//在java中不直接支持多继承机制，但支持多实现。
//一个类可以实现多个接口。

interface A
{
    void show();
}

interface B
{
    public abstract int add(int a, int b);
}

class Test implements A,B
{
    public void show()
    {
        System.out.println("Hello world");
    }
    public int add(int a, int b)
    {
        return a + b;
    }
}

//一个类在继承另一个类的同时还可以实现多个接口
//接口与接口之间是继承关系，并且可以多继承
abstract class Test2 extends DemoImpl implements A,B
{
   
}


class InterfaceDemo
{
    public static void main(String[] args)
    {
        DemoImpl d = new DemoImpl();
        System.out.println(d.NUM);
        System.out.println(DemoImpl.NUM);
        System.out.println(Demo.NUM);
        Test t = new Test();
        t.show();
            System.out.println(t.add(4,5));
    }
}

