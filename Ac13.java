/*12. Define a class named BookFair with the following description: 
Instance variables/Data members: 
String Bname – stores the name of the book. double price – stores the
 price of the book. Member Methods: 
(i) BookFair() – Default constructor to initialize data members. 
(ii) void Input() – To input and store the name and the price of the book. 
(iii) void calculate() – To calculate the price after discount. Discount is calculated based on  the 
following criteria.
PRICE DISCOUNT
Less than or equal to Rs 1000 2% of price 
More than Rs 1000 and less than or equal to Rs 3000 10% of price 
More than Rs 3000 15% of price 
(iv) void display() – To display the name and price of the book after discount.
 Write a main method to create an object of the class and call the above member 
 methods. 

*/
import Java.util.Scanner;

class BookFair{
    string Bname;
    double price;
    double dis;

    BookFair(){
        Bname = " ";
        price = 0.0;
        dis = 0.0;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the book name");
        Bname = sc.nextLine();

        System.out.println("Enter price of the book");
        price = sc.nextDouble();
        }
       public void calculate(){
        this.dis=0.0;
        if(price<=1000){
            dis = (price*2)/100;
        }
        else if(price>1000&& price<=3000){
            dis = (price*10)/100;
        }
        else{
            dis = (price*15)/100;
            price = price-dis;
        }
            
        }
    
        public void display(){
            System.out.println("the book name:="+Bname);
            System.out.println("the book name:="+price);
       }
      public static void main(String args[]){
         BookFair b = new BookFair();
        
        b.input();
        b.calculate();
        b.display();
       }
    }



    

