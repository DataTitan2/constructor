/* WAP using parameterized constructor with two parameters id and name. While creating  
the objects obj1 and obj2 passed two arguments so that this constructor gets  
invoked after creation of obj1 and obj2
*/

class Student{
    String name;
    int id;
    public Student(String name,int id){
        this.name=name;
        this.id=id;
    }
   public void Display(){
    System.out.println("Name:= "+name);
    System.out.println("Id:= "+id);
}
    public static void main(String args[]){
        Student obj1 = new Student("John",101);
        
        Student obj2 = new Student("Kanchan",102);
    

        obj1.Display();
        obj2.Display();
    }
}