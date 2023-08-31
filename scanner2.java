import java.util.Scanner;
class Main {
    
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);// here the System.in taking the value 
        System.out.println("Enter your First  Name");
        String f = obj.nextLine();// nextInt reading the value
     
        System.out.println("Enter your Last  Name");
        String l = obj.nextLine();// nextInt reading the value
   
        System.out.println("Your Fullname is " + " " + f + " "+ l );
        
    }
}
