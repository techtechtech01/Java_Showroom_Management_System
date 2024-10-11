import java.util.Scanner;
interface utility{
  public void get_details();
  public void set_details();
}
public class Showroom implements utility{
  protected String name;
  protected String address;
  protected String manager_name;
  public int no_of_cars;
  public int no_of_employees;

  @Override
  public void get_details(){
    System.out.println("======Showroom Details======");
    System.out.println("Name: "+name);
    System.out.println("Address: "+address);
    System.out.println("Manager Name: "+manager_name);
    System.out.println("No of Cars: "+no_of_cars);
    System.out.println("No of Employees: "+no_of_employees);
  }
  @Override
  public void set_details(){
    System.out.println("======Enter Details of Showroom======");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Name: ");
    name=sc.nextLine();
    System.out.println("Enter Address: ");
    address=sc.nextLine();
    System.out.println("Enter Manager Name: ");
    manager_name=sc.nextLine();
    System.out.println("Enter No of Cars: ");
    no_of_cars=sc.nextInt();
    System.out.println("Enter No of Employees: ");
    no_of_employees=sc.nextInt();
    
  }
}
