package practice_problem_05;

public class dog_attributes
{
    String name;
    int age;
    String breed;
    public dog_attributes(String name,int age,String breed)
    {
        this.age=age;
        this.breed=breed;
        this.name=name;
    }
    public void bark()
    {
        System.out.println("dog barked");
    }
    public void spin()
    {
        System.out.println("dog spinned");
    }
    public void rum()
    {
        System.out.println("dog is running");
    }
    public static void main(String[] args)
    {
        dog_attributes d=new dog_attributes("Husky",3,"breed");
        d.rum();
        d.bark();
        d.spin();
    }
}
