/*2.design a class having method signature like give below 
int addarray(int g[]) 
the above function take array as argument and return sum of array to calling program 
*/
class Array_Sum{
    public int addarray(int g[]){
        int sum=0; 
        for(int i=0; i<g.length; i++){
            sum=sum+g[i];
        }
        return sum;
    }

public static void main(String args[]){
    Array_Sum s=new Array_Sum();
    int []n = {1,2,3,4,5};
    int result = s.addarray(n);
    System.out.println("The sum of array:= "+result);
   }
}
