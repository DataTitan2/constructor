/*1.Write a constructor in the Car class given below that initializes the brand class field with  the string “Ford”.
Call the getBrand() method in the main method of the Sample class and  store the value of
 the brand in a variable, and print the value.  */



class Car{
    String brand;
    public Car(){
        this.brand="Ford";
    }
    public String getBrand(){
       return brand;
    }
}
class Sample{
    public static void main(String args[]){
    Car c = new Car();
    c.getBrand();
    System.out.println("The car brand:"+c.getBrand());

   }
}
    