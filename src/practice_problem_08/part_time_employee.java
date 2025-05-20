package practice_problem_08;

public class part_time_employee extends employee
{
    double hourlyRate;
    int hoursWorked;

    part_time_employee(String name, int id, String department, double hourlyRate, int hoursWorked)
    {
        super(name, id, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
