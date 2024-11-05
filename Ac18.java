/*18.Define a class Mobike with the following description: 
Instance variables/data members: 
int bno: to store the bike’s number. 
int phno: to store the phone number of the customer. 
String name: to store the name of the customer. 
int days: to store the number of days the bike is taken on rent. 
int charge: to calculate and store the rental charge. 
Member functions/methods: 
void input(): to input and store the detail of the customer. void compute(): to compute the  rental charge. 
The rent for a Mobike is charged on the following basis: 
First five days: Rs. 500 per day. 
Next five days: Rs. 400 per day. 
Rest of the days: Rs. 200 per day. 
void display(): to display the details in the following format: 
Bike No Phone No Name No. of days Charge 
*/
import java.util.Scanner;
class Mobike{
    int bno;
    int phno;
    String name;
    int days;
    int charge;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("The bike’s number");
        bno = sc.nextInt();

        System.out.println("Phone number of the customer");
        phno = sc.nextInt();

        System.out.println("Name of the customer");
        name = sc.next();

        System.out.println("the number of days the bike is taken on rent");
        days = sc.nextInt();
    }
        void calculate(){
            if(days<=5){
                charge = days*500;
            }
            else if (days <= 10) {
                charge = (5 * 500) + ((days - 5) * 400);
            } else {
                charge = (5 * 500) + (5 * 400) + ((days - 10) * 200);
            }
        }    
        void display(){
            System.out.println("The bikes number="+bno);
            System.out.println("Phone number of the customer="+phno);
            System.out.println("Total charge="+charge);
        } 
        public static void main(String args[]){
            Mobike m = new Mobike();
            m.input();
            m.calculate();
            m.display();
        

    }
}