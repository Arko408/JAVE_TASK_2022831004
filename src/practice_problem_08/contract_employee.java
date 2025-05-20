package practice_problem_08;

public class contract_employee extends employee
{
    String projectName;
    double contractAmount;

    contract_employee(String name, int id, String department, String projectName, double contractAmount)
    {
        super(name, id, department);
        this.projectName = projectName;
        this.contractAmount = contractAmount;
    }

    @Override
    double calculatePay() {
        return contractAmount;
    }
}
