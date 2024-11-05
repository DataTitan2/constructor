/* Write a program by creating an 'Employee' class having the following methods and print  the final salary. 
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as  
parameter 
2 - 'AddSal()' which adds 10000 to salary of the employee if it is less than 50000. 
3 - 'AddWork()' which adds 5000 to salary of employee if the number of hours of work per  day is more than 6 hours. 
*/
class Employee{
        int salary;
        int hours;
        public void getInfo(int salary, int hours)
        {
            this.salary=salary;
            this.hours=hours;
        }
        public void addSalary()
        {
            if(salary<=50000)
            salary=salary+10000;
        }
        public void addWork()
        {
            if(hours>6)
            salary=salary+5000;
        } 
        
    public void display(){
        System.out.println("Salary: ="+salary);
        System.out.println("hours: ="+hours);
    }
    public static void main(String args[]){
        Employee E = new Employee();
        E.getInfo(45000,7);
        E.addSalary();
        E.addWork();
        E.display();
    }
}   
