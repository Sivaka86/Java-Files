class Vechile  {
    //inheritance - parent and child class
    protected String brand="BMW";
    public void myMethod(){
        System.out.println("Parent Class");
    }
    }
class Car extends Vechile {
    private String yom="2022";
     public static void main(String[] args) {
     Car obj =new Car();
     obj.myMethod();
     System.out.println(obj.brand+" "+obj.yom);
    }
    //output:
    //Parent Class
    //BMW 2022
}

  
