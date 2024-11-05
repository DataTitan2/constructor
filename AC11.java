/*11.Design a class RailwayTicket with the following description: 
Instance variables/data  members: String name: to store the name of the customer. 
String coach: to store the type of  coach customer wants to travel. long mobno: 
to store customer’s mobile number. int amt: to  store basic amount of ticket. 
int totalamt: to store the amount to be paid after updating the  original amount. 
Methods: void accept(): to take input for name, coach, mobile number and amount.
 void  update(): to update the amount as per the coach selected. Extra amount to be
  added in the  amount as follows:  
Type of coaches Amount First_AC 700 Second_AC 500 Third_AC 250 sleeper None void 
 display(): To display all details of a customer such as name, coach, total amount 
 and mobile  number. Write a main() method to create an object of the class and call
  the above methods. 
*/
import java.util.Scanner;
class RailwayTicket{
    String name;
    String coach;
    long mobno;
    int amt;
    int totalamt;

   public void accept(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter coustomer name");
      this.name = sc.next();

      System.out.println("Enter coach(First_AC,Second_AC,Third_AC):");
      this.coach = sc.next();

      System.out.println("Enter mobile number");
      this.mobno = sc.nextInt();

      System.out.println("Enter the amount");
      this.amt =sc.nextInt();

      System.out.println("Enter Extra amount to be added ");
      this.totalamt = sc.nextInt();
      totalamt = totalamt+amt;

    }
    void  update(){
      int extra_amount;

      switch (coach) {

      case "First_AC":
      extra_amount = 700;
      break;
      case "Second_AC":
      extra_amount = 500;
      break;
      case "Third_AC":
      extra_amount = 250;

      case "sleeper":
      extra_amount = 0;
      break;
      default:
      System.out.println("Invalid coach type");
    }
      /*totalamt = amt+extra;*/
    }
      public void disply(){
      System.out.println("Enter coustomer name:="+name);
      System.out.println("Enter coach:="+coach);
      System.out.println("Enter total amt:="+totalamt);
      }
      public static void
      
      main(String args[]){
      RailwayTicket  r = new RailwayTicket();
      r.accept();
      r.update();
      r.disply();
    }
      }
