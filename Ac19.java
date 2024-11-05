/*19. Define a class Student as given below: Data members/instance variables:
 name:to store  the student’s name. age: to store the age. m1, m2, m3: to store the 
 marks in three subjects.  maximum: to store the highest marks among three subjects.
   average: to store the average  marks. Member functions: 
   (i) A parameterized constructor to initialize the data members.
    (ii)  To accept the details of a student. 
    (iii) To compute the average and the maximum out of three  marks. 
    (iv) To display all the details of the student. 
    Write a main() method to create an object  of the class and call the above 
    methods accordingly to enable the task.*/
import java.util.Scanner;
    class Student{
        String name;
        int age;
        int m1;
        int m2;
        int m3;
        double avg;

        Student(){
            name = "";
            age = 0;
            m1=0;
            m2=0;
            m3=0;
            avg = 0.0;
        }
        void accept(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter The student name");
            name = sc.nextLine();

            System.out.println("Enter the age");
            age = sc.nextInt();

            System.out.println("marks m1 ");
            m1 = sc.nextInt();

            System.out.println("Enter m2");
            m2 = sc.nextInt();

            System.out.println("Enter m3");
            m3 = sc.nextInt();
        }
        void compute(){
            avg = (m1+m2+m3)/3;
        }
        void display(){
            System.out.println("Student name="+name);
            System.out.println("Student age="+age);
            System.out.println("average  marks="+avg);  
     
        }
        public static void main(String args[]){
            Student s = new Student();
            s.accept();
            s.compute();
            s.display();
        }
    }