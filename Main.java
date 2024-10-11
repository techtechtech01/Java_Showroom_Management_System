import java.util.Scanner;
public class Main {
  public static void main_menu(){
    System.out.println("==========Showing Main Menu==========");
    System.out.println("1. Add Showroom \t 2.Add Employee");
    System.out.println("3. Add Car \t \t     4.Get Showroom");
    System.out.println("5. Get Employee \t 6.Get Car");
    System.out.println("==========Enter 0 To Exit==========");
    System.out.println("Enter your Choice:");
    
  }
  
  public static void main(String[] args) {
    Showroom showroom[]=new Showroom[5];
    Employee employee[]=new Employee[5];
    Car car[]=new Car[5];
    Scanner sc=new Scanner(System.in);
    int showroom_counter=0;
    int no_of_cars=0;
    int no_of_employees=0;
    int choice=10;
    
  //choice=sc.nextInt();
  while(choice!=0){
    main_menu();
     
    choice=sc.nextInt();
    while(choice!=0&&choice!=9){
      switch(choice){
        case 1:
          showroom[showroom_counter]=new Showroom();
            showroom[showroom_counter].set_details();
showroom_counter++;
          
          System.out.println("1.Add New Showroom");
          System.out.println("9.Back to Main Menu");
          choice=sc.nextInt();
          break;