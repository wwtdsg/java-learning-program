class StaticCodeDemo
{
    static
    {
        System.out.println("zhe shi yi ge jingtai lizi");
    }
    private int age;
    private String sex;
    private String name ;

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
    {
        System.out.println("构造代码块"+"name: "+name+" age: "+age+" sex: "+sex);
    }
    StaticCodeDemo(String name,int age,String sex)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
        System.out.println("name: "+name+" age: "+age+" sex: "+sex);
    }
    public void printDetail()
    {
        System.out.println("name: "+name+" age: "+age+" sex: "+sex);
    }
}

class Main
{
    public static void main(String[] args)
    {

        StaticCodeDemo baby = new StaticCodeDemo("wangxinyi", 12, "female");
        StaticCodeDemo baby5 = new StaticCodeDemo("wangtao", 23, "male");
        baby.setName("wangxiner");
        baby5.setName("wangwentao");
        baby.printDetail();
        baby5.printDetail();
        String n = baby.getName();
        System.out.println(n);
    }
}
