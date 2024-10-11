import java.util.Scanner;
public class Car extends Showroom implements utility{
  public String name;
  public String model;
  public int prize;
  @Override
  public void get_details(){
    System.out.println("========Car Details========");
    System.out.println("Name: "+name);
    System.out.println("Model: "+model);
    System.out.println("Prize: "+prize);
  }
  @Override
  public void set_details(){
    System.out.println("========Enter Details of Car========");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Name: ");
    name=sc.nextLine();
    System.out.println("Enter Model: ");
    model=sc.nextLine();
    System.out.println("Enter Prize: ");
    prize=sc.nextInt();
  }
}