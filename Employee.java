import java.util.Scanner;
public class Employee extends Showroom implements utility{
  public String name;
  public String address;
  public String post;
  @Override
  public void get_details(){
    System.out.println("======Employee Details======");
    System.out.println("Name: "+name);
    System.out.println("Address: "+address);
    System.out.println("Post: "+post);
  } 
  @Override
  public void set_details(){
    System.out.println("======Enter Details of Employee======");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Name: ");
    name=sc.nextLine();
    System.out.println("Enter Address: ");
    address=sc.nextLine();
    System.out.println("Enter Post: ");
    post=sc.nextLine();
  }
  
}