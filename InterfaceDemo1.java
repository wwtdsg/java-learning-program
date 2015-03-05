//暴露的规则
interface USB
{
    public void open();
    public void close();
}


class InterfaceDemo1
{
    public static void main(String[] args)
    {
        UPan u = new UPan();
        useUSB(u);//功能扩展
        useUSB(new UsbMouse());
        System.out.println("-----");
        USB upan = new UPan();
        upan.open();
        USB a = (USB)upan;
        a.open();

    }
    //使用的规则
    public static void useUSB(USB u)
    //多态的体现：接口类型的引用，用于接收接口类型的子类对象。
    {
        u.open();
        u.close();
    }
}

//实现规则
class UPan implements USB
{
    public void open()
    {
        System.out.println("UPan open");
    }
    public void close()
    {
        System.out.println("UPan close");
    }
}

class UsbMouse implements USB
{
    public void open()
    {
        System.out.println("UsbMouse open");
    }
    public void close()
    {
        System.out.println("UsbMouse close");
    }
    UsbMouse()
    {
        System.out.println("UsbMouse is ready for use");
    }
}
