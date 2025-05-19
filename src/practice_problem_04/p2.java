package practice_problem_04;
public class p2
{
    public void products(String category)
    {
        System.out.println(category);
    }
    public void products(int price1,int price2)
    {
        System.out.println(price1+" to "+price2);
    }
    public void products_by_brand(String brand)
    {
        System.out.println(brand);
    }
    public void products(String category,int price1,int price2)
    {
        System.out.println(category+" "+price1+" to "+price2);
    }
    public void products(String category,int price1,int price2,String brand)
    {
        System.out.println(category+" "+price1+" to "+price2+" "+brand);
    }
    public static void main(String[] args)
    {
        p2 product=new p2();
        product.products("electronics");
        product.products(55,56);
        product.products_by_brand("redmi");
        product.products("electronics",100,120);
        product.products("electronics",200,250,"redmi");
    }
}