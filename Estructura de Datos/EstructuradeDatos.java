

public class EstructuradeDatos {
    public static void main(String[] args) {
        
        //Arreglos
        //Declaration
        int[] numbers = new int[3];
        System.out.println(numbers.length);

        String[]names = {"hola", "mundo", "Edgar"};
        System.out.println(names);
        //Acceso
        System.out.println(numbers[0]);
        System.out.println(names[1]);
        System.out.println((new String[3])[0]);

        //Modificacion
        numbers[0] = 1;
        numbers[1] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        //Eliminacion
        System.out.println(names.length);
        names[2] = null;
        System.out.println(names[2]);
        System.out.println(names.length);

        numbers[1] = 0;
        System.out.println(numbers[1]);
        
    }
    
}
