/*继承关系*/

class Person
{
    String name;
    final int age = 0;
}

class Student extends Person
{
//  String name;
//  int age;
    void study()
    {
        System.out.println(name + ", " + age + ", student study");
    }
}

class Worker extends Person
{
//  String name;
//  int age;
    void work()
    {
        System.out.println(name + ", "+age+", Worker work");
    }
}

class ExtendsDemo
{
    public static void main(String[] args)
    {
        Student s = new Student();
        s.name = "zhansgsan";
        s.age = 30;
        s.study();
    }
}
