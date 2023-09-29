import java.util.Date;
class HelloWorld {
    public static void main(String[] args) {
     String  message = "Hello World" + "!!";
     System.out.println(message);
     System.out.println(message.endsWith("!!")+"\n");
     System.out.println(message.startsWith("He")+"\n");
     System.out.println(message.length()+"\n");
     System.out.println(message.indexOf("o")+"\n");
     System.out.println(message.indexOf("m")+"\n");
     System.out.println(message.replace("!","*")+"\n");
     System.out.println(message);
     System.out.println(message.toUpperCase());
     System.out.println(message.toLowerCase());
     String  welcome = "Welcome to our      site    ";
     System.out.println(welcome);
      System.out.println(welcome.trim());
     //output
     /*
     Hello World!!
true

true

13

4

-1

Hello World**

Hello World!!
HELLO WORLD!!hello world!!
Welcome to our      site    
Welcome to our      site

     
     
     
     */
    }
}
