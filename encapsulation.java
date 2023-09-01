class Student {
    private String name; 
    public String getName(){
        return name;
    }
    public void setName(String newname){
     this.name=newname;
    }
}
class Main{
    public static void main(String[] args) {
     Student obj =new Student();
     obj.setName("Sivaka");
     System.out.println(obj.getName()); // output Sivaka
    }
}
