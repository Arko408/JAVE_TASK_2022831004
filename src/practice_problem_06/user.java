package practice_problem_06;

public class user
{
    int userID;
    String userName;
    String userAddress;
    int phoneNo;

    void returnBooks(String book) {
        System.out.println(book+"is returned");
    }

    void payFine(int pay) {
        System.out.println(pay+"is apyed");
    }

    void addNewUser(String user) {
        System.out.println(user+"is added");
    }

    void deleteUser(String user) {
        System.out.println(user+"is deleted");
    }

    void updateDetails(String user) {
        System.out.println(user+" details ");
    }

    void bookPurchase(String book) {
        System.out.println(book+"is purchased");
    }
}
