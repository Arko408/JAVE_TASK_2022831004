package practice_problem_05;

public class car_attributes
{
    String owner;
    String brand;
    int serial;
    public car_attributes(String owner,String brand,int serial)
    {
        this.brand=brand;
        this.owner=owner;
        this.serial=serial;
    }
    public void start()
    {
        System.out.println("Car is started");
    }
    public void stop()
    {
        System.out.println("Car is stopped");
    }
    public void fuel(int f)
    {
        System.out.println("fuel remaining = "+f);
    }
    public static void main(String[] args)
    {
        car_attributes a=new car_attributes("XXX","BMW",100096);
        a.start();
        a.stop();
        a.fuel(56);
    }
}
