/*设计模式：对问题行之有效的解决方式。
 *其实它是一种思想
 *1.单例设计模式。
    解决的问题可以保证一个类在内存中的对象唯一性
    对于多个程序使用同一个对象时，必须保证对象的唯一性
  2.如何保证对象唯一性？
    1）不允许其他程序用new创建对象。
    2）在该类创建一个本类实例。
    3）对外提供一个方法让其他程序可以获取该类对象。
  3.步骤：
    1）私有化该类构造函数
    2）通过new在本类中创建一个本类的对象
    3）定义一个公有的方法，将创建的类返回
 */

class Single//类一加载，对象就已经存在。
{
    private static Single s = new Single();
    private Single(){}
    public static Single getInstance()
    {
        return s;
    }
}

class Single2//类加载进来，没有对象，只有调用了getInstance才有对象的创建。
             //延迟加载形式。
{
    private static Single2 s = null;
    private Single2(){}
    public static Single2 getInstance()
    {
        if(s==null)
            s = new Single2();
        return s;
    }
}

class SingleDemo
{
    public static void main(String[] args)
    {
        Single ss = Single.getInstance();
    }
}
