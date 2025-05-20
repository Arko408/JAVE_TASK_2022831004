package practice_problem_05;

public class library
{
    String title;
    String author;
    public library(String title)
    {
        this.title=title;
    }
    public library(String title,String author)
    {
        this.author=author;
        this.title=title;
    }
    public static void main(String[] args)
    {
        library l=new library("title");
        library l2=new library("title","author");
    }
}
