public class Main { 
public static void main(String[] args) { 
  //Widening Casting or Automatic casting: int to double 
  int numInt = 5; 
  double numDouble = numInt; // System.out.println(numInt); // Outputs 5 
  System.out.println(numDouble); // Outputs 5.0

  // Narrowing Casting or  manual casting: double to int
  double d = 6.5d; 
  int numD = (int)d; 
  System.out.println(d); // Outputs 6.5
  System.out.println(numD); // Outputs 6
  }
} 
