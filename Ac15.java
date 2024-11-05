/*15.Define a class named movieMagic with the following description:
 Instance variables/data  members: int year – to store the year of
release of a movie String title – to store the title of the 
movie. float rating – to store the popularity rating of the 
movie. (minimum rating = 0.0 and  maximum rating = 5.0) Member 
Methods: (i) movieMagic() Default constructor to initialize 
numeric data members to 0 and String data member to "".
 (ii) void accept() To input and store  year, title and rating. 
 (iii) void display() To display the title of a movie and a message
based  on the rating as per the table below.  
RATING MESSAGE TO BE DISPLAYED 0.0 to 2.0 Flop 2.1 to 3.4 Semi-hit
 3.5 to 4.5 Hit  4.6 to 5.0 Super Hit Write a main method to create
an object of the class and call the above member methods. 
*/
import java.util.Scanner;
class movieMagic{
    int year;
    String movie;
    float rating;

    public movieMagic(){
     year = 0;
    movie = " ";
    rating=0;
    }
    public void accept(){
        Scanner sc = new Scanner(System.in);
            System.out.println("The year");
            year = sc.nextInt();

            System.out.println("Title of the movie ");
            movie = sc.next();

            System.out.println("Enter the rating");
            rating = sc.nextFloat();
        }
        public void calculate(){
            if(rating<=2.0){
                System.out.println("The movie is Flop");
            }
            else if(rating>2.0 && rating<=3.4){
                System.out.println("The movie is Semi-hit");
            }
            else if(rating>3.4 && rating<=4.5){
                System.out.println("The movie is Hit");
            }
            else if(rating>4.6 && rating<=5.0){
                System.out.println("The movie is super hit");
                }
                else{
                System.out.println("invalid rating");
            }
        }
            void display(){
                System.out.println("The year="+year);
                System.out.println("Title of the movie="+movie);
                System.out.println("rating="+rating);
            }
            public static void main(String args[]){
            movieMagic m = new movieMagic();
                m.accept();
                m.calculate();
                m.display();      
    } 
}
