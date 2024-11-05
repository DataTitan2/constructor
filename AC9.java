/*9.create a class Toy having variable toyname ,price,and static variable "madein" . 
create no arg and parameterized constructor to initialize class variables .
 Define static function staticdisplay and non static method display */

import java.util.Scanner;

class Toy{
    String Toyname;
    double price;
   static String madein;

   public Toy (String Toyname,double price,String madein){
    this.Toyname = Toyname;
    this.price=price;
    this.madein=madein;
   }
   Static void Display(){
    System.out.println("Toyname: "+Toyname);
    System.out.println("Toy price: "+price);
    System.out.println("madein: "+madein);
   }
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Toyname");
    String s = sc.next();

    System.out.println("Enter price");
    double d = sc.nextDouble();

    System.out.println("Enter made in ");
    String s1 = sc.nextLine();

    Toy t = new Toy(s,d,s1);

    t.Display();
   }


   }