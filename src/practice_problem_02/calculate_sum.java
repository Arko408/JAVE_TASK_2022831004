package practice_problem_02;

public class calculate_sum
{
    public static void main(String[] args)
    {
        int sum1=0,sum2=0;
        for (int i = 2; i <= 20; i += 2)
        {
            sum1+=i;
        }
        for (int i = 1; i <= 20; i += 2)
        {
            sum2+=i;
        }
        System.out.println(sum1+" "+sum2);
    }
}
