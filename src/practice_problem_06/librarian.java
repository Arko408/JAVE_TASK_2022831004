package practice_problem_06;

public class librarian
{
    int id;
    String name;

    void searchBook(String name) {
        System.out.println(name+" is searced");
    }

    boolean verifyMember(int id) {
        return true;
    }

    void orderBooks(String b) {
        System.out.println(b+"is ordered");
    }

    void sellBooks(String s) {
        System.out.println(s+"is sold");
    }
}
