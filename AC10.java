/*10.Design a class named ShowRoom with the following description: Instance variables/data  
members: String name: to store the name of the customer. long mobno: to store the mobile  
number of the customer. double cost: to store the cost of the items purchased. double dis: 
to  store the discount amount. double amount: to store the amount to be paid after discount. 
Member methods: ShowRoom(): default constructor to initialize data members. void input():  to input customer 
name, mobile number, cost. void calculate(): to calculate discount on the  cost of purchased items, based on 
the following criteria:  
COST DISCOUNT (IN PERCENTAGE) Less than or equal to Rs. 10000 5% More than Rs.  10000 and less than or
 equal to Rs. 20000 10% More than Rs. 20000 and less than or equal to  Rs. 35000 15% More than 
 Rs. 35000 20% void display(): to display customer name, mobile  number, amount to be paid after
  discount. Write a main() method to create an object of the  class and call the above member methods
*/
import util.java.Scanner;

class ShowRoom{
    String name;
    long mobno;
    double cost;
    double dis;
    double amount;
    
    ShowRoom(){
      String name=" ";
      long mobno= 0;
      double cost = 0.0;
      double dis = 0.0;
      double amount = 0.0;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        this.name  = sc.next();

        System.out.println("Enter mobile number");
        this.mobno=sc.nextLong();

        System.out.println("Enter the cost");
        this.cost  = sc.nextDouble();
    }
        public void calculate(){

            if(cost>=10000){
            dis = (cost*5)/100;}

            else if(cost>=20000){
            dis = (cost*10)/100;}

            else if(cost>=35000){
            dis = (cost*15)/100;}
            else{
                dis = (cost*20)/100{
                after dis = cost-dis;
        }
    }
        public void display(){
            System.out.println("customer name= " +name);
            System.out.println("customer mobile number= "+mobno);
            System.out.println("after discount= "+after dis);

        }
        public static void main(String args[]){
        ShowRoom  s = new ShowRoom();
        s.ShowRoom();
        s.input();
        s.calculate();
        s.display();



    }

}