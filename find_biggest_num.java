import java.util.Scanner;
class Main {
    
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);// here the System.in taking the value 
        System.out.println("Enter the 1st Number");
        int x = obj.nextInt();// nextInt reading the value
     
        System.out.println("Enter the 2st Number");
        int y = obj.nextInt();// nextInt reading the value
   
        System.out.println("Enter the 3rd Number");
        int z = obj.nextInt();// nextInt reading the value
      
        if( x > y  && x > z){
            System.out.println("x is the biggest number");
        }
         else if( y > x  && y > z){
            System.out.println("y is the biggest number");
        }
        else if( z > x  && z > y){
            System.out.println("z is the biggest number");
        }
        
        else {
            System.out.println("All are same Number ");
        }
    }
}
