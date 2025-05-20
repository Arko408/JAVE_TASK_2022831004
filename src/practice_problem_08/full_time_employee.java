package practice_problem_08;

public class full_time_employee extends employee
{
    double fixedSalary;
    full_time_employee(String name, int id, String department, double fixedSalary)
    {
        super(name, id, department);
        this.fixedSalary = fixedSalary;
    }
    @Override
    double calculatePay()
    {
        return fixedSalary;
    }
}
