

public class operadores {

    public static void main(String[] args) {
        //Operadores 

        //aritméticos
        var a=5;
        var b=3;

        System.err.println(a+b);
        System.err.println(a-b);
        System.err.println(a*b);
        System.err.println(a/b);
        System.err.println(a%b);

        a = b;
        System.out.println(a);

        a = b * 2;
        System.out.println(a);

        a+=1;
        System.out.println(a);


        a-=1;
        System.out.println(a);
        a*=1;
        System.out.println(a);
        a/=1;
        System.out.println(a);

        //Comparación (Relacionales) <>

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);

        //Operadores Booleanos
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println(3>2&&5==2);
        //OR
        
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println(3>2||5==2);
        //Not
        System.err.println(!true);
        System.out.println(!false);
        System.out.println(!(3>2||5==2));

        //Unuarios
        System.out.println(+b);
        System.out.println(-b);
        System.out.println(b++);
        System.out.println(++b);
        System.out.println(b--);
        System.out.println(--b);

    }
    
}
