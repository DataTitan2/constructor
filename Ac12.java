/*12.Define a class Electric Bill with the following specifications: Instance 
Variable/ data  member: String n – to store the name of the customer int units – 
to store the number of units  consumed double bill – to store the amount to paid
 Member methods: Void accept() – to  accept the name of the customer and number of 
 units consumed Void calculate() – to  calculate the bill as per the following 
 tariff : Number of units Rate per unit First 100 units  Rs.2.00 Next 200 units
  Rs.3.00 Above 300 units Rs.5.00 A surcharge of 2.5% charged if the  number of
   units consumed is above 300 units. Void print() – To print the details as 
   follows :  Name of the customer ……… Number of units consumed …… Bill amount ……. 
   Write a  main method to create an object of the class and call the above member 
   methods.
*/
import java.util.Scanner;
class Electric_Bill{
    String name;
    int units;
    double bill;

    public void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer name");
        this.name = sc.next();

        System.out.println("units consumed");
        this.units = sc.nextInt();
    }
    public void calculate(){
        if(units<=100){
        bill = (units*2);
        }
        else if(units<=300){
            bill = (100*2)+((units-100)*3);
        }else{
            bill = ((100*2)+(200*3)+(units-300)*5);
            bill = bill*0.025;
        }
        }
        public void print(){
        System.out.println("\n Electric Bill Details:");
        System.out.println("Name of the customer: " + name);
        System.out.println("Number of units consumed: " + units);
        System.out.printf("Bill amount: Rs. %.2f%n", bill);
        }
        public static void main(String args[]){
            Electric_Bill E = new Electric_Bill();
            E.accept();
            E.calculate();
            E.print();
            
        }
    }
    
    
