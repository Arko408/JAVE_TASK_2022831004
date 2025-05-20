package practice_problem_08;

public abstract class employee
{
    String name;
    int id;
    String department;

    employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    abstract double calculatePay();

    void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}
