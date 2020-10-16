import java.util.Scanner;
class employee
{
    private int id;
    private String name;
    private String post;
    private int sallary;
    private Scanner sc=new Scanner(System.in);
    
    public void input()
    {
        System.out.print("ID: ");
        id=sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        name= sc.nextLine();
        System.out.print("post: ");
        post=sc.nextLine();
        System.out.print("sallary: ");
        sallary=sc.nextInt();
    }
    public void display()
    {
        System.out.println("\nID: "+id);
        System.out.println("Name: "+name);
        System.out.println("post: "+post);
        System.out.println("sallary: "+sallary);
    }
}
public class classobject2
{
    public static void main(String args[])
    {
        employee x=new employee();
        x.input();
        x.display();
    }
}
