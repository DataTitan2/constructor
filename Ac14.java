/*14.Define a class ParkingLot with the following description: Instance 
variables/data  members: int vno – To store the vehicle number int hours – To store 
the number of hours the  vehicle is parked in the parking lot double bill – To store
 the bill amount Member methods: void input() – To input and store vno and hours void
  calculate() – To compute the parking  charge at the rate of Rs.3 for the first hour 
  or part thereof, and Rs.1.50 for each additional  hour or part thereof.
   void display() – To display the detail Write a main method to create an 
    object of the class and call the above methods 

*/
import java.util.Scanner;
class ParkingLot{
    int vno;
    int hours;
    double bill;
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vno");
        vno = sc.nextInt();

        System.out.println("Enter hours");
        hours = sc.nextInt();

    }
    
   public void calculate(){
        if (hours <= 1){
            bill = 3;
        } else if (hours>1){
            bill = 3 + (hours - 1) * 1.5;
        }
   }
        public void display(){
            System.out.println("vno number:="+vno);
            System.out.println("hours:="+hours);
            System.out.println("Total bill:="+bill);
        }
        public static void main(String args[]){
        ParkingLot p = new ParkingLot();
        p.input();
        p.calculate();
        p.display();        
    
    }
}
