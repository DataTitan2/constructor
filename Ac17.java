/*17.Define a class called Library with the following description: Instance 
variables/data  members: Int acc_num – stores the accession number of the book String
 title – stores the title of the book stores the name of the author Member Methods: 
 (i) void input() – To input and  store the accession number, title and author. 
 (ii)void compute – To accept the number of days  late, calculate and display and 
 fine charged at the rate of Rs.2 per day. (iii) void display() To  display the
  details in the following format: Accession Number Title Author Write a main  method 
  to create an object of the class and call the above member methods 
*/
import java.util.Scanner;
class Library{
    int acc_num;
    String title;
    int issue_date;
    int book_sub;
    int charge;
    int extra_date;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Accession number of the book");
        acc_num = sc.nextInt();

        System.out.println("name of the author Member");
        title = sc.next();

        System.out.println("Enter issue book date");
        issue_date = sc.nextInt();

        System.out.println("Enter issue book submite date");
        book_sub = sc.nextInt();
    }
    void compute(){
        
        if(issue_date<book_sub){
            extra_date= book_sub-issue_date;
            charge= extra_date*2;
        }
        else{
            System.out.println("No charge on the book");
        }
    }
    void display(){
        System.out.println("Accession number of the book="+acc_num);
        System.out.println("name of the author Member="+ title);
        System.out.println("issue_date="+issue_date);
        System.out.println("book_sub="+book_sub);
        System.out.println("charge="+charge);
    }
    public static void main(String args[]){
        
        Library l = new Library();
        l.input();
        l.compute();
        l.display();
    }
}

