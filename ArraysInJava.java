import java.util.Arrays;
class ArraysInJava {
    public static void main(String[] args) {
        
        //Array - reference type 
        int[] numbers = new int[5];
        numbers[0]=1;
        numbers[1]=4;
        numbers[2]=7;
        System.out.println(Arrays.toString(numbers));
        
    }
    /*
   
     if it is integer array  and if not intiated 0 will be print then in the output is : [1, 4, 7, 0, 0]
     
     -----------------------------
     String[] names = new String[6];
        names[0] = "Sivaka";
        names[1] = "Chitra";
        
        System.out.println(Arrays.toString(names));
        
      String - null well be printed  : [Sivaka, Chitra, null, null, null, null]
--------------------------------------------------
      Boolean - false will be printed 
      
      
    */
}
