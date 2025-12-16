

public class TiposDatos {

    public static void main(String[] args) {

        //Tipos de Datos Primitivos
        int myInt = 37;
        System.out.println(myInt);
        //float, long, byte

        double myDouble = 1.77;
        System.out.println(myDouble);

        char myChar = 'a';
        System.out.println(myChar);

        boolean myBoolean = true;
        System.out.println(myBoolean);


        String myString = "Hola mundo";
        System.out.println(myString);

        //Tipo de dato en tiempo de compilacion

        System.out.println(myString.getClass().getSimpleName());
        
    }
    
}
