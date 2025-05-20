package practice_problem_06;

public class publisher
{
    int id;
    String name;
    String address;
    int phoneNo;

    void addPub(String pub) {
        System.out.println(pub+" is added");
    }

    void modifyPub(String p) {
        System.out.println(p+" is modified");
    }

    void deletePub(String pub) {
        System.out.println(pub+" is deleted");
    }

    void orderStatus(String pub) {
        System.out.println(pub+" is ordered");
    }
}
