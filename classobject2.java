import java.util.Scanner;
class employee
{
    private int id;
    private String name;
    private String post;
    private int sa
    public void display()
    {
        System.on("post: "+post);
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