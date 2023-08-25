//Arithmetic operators

class ArithmeticOperators{
public static void main(String a[])
    {
        int p= 16;
        int q=8;
        int r;
        r=p+q;	
        System.out.println("Addition  p+q:  "+r);
        r=p-q;
        System.out.println("Subtraction  p-q: "+r);
        r=p*q;
        System.out.println("Multiplication p*q: "+r);
        r=p/q;
        System.out.println("Division p/q: "+ r);
        r=p%q;
        System.out.println("Remainder p%q: "+r);
        p=++p;
        System.out.println("Increment Operator: "+p);
        q=--q;
        System.out.println("Decrement Operator: "+q);       

    }
}

/*
Addition  p+q:  24
Subtraction  p-q: 8
Multiplication p*q: 128
Division p/q: 2
Remainder p%q: 0
Increment Operator: 17
Decrement Operator: 7
*/
