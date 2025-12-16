

public class Strings {
 public static void main(String[] args) {
    //Cadenas de Texto
    String surname = new String("Rojas");
    var name = "Edgar";
   int age = 23;
    System.out.println(surname);
    //Operaciones basicas
    System.out.println(name+" "+surname);

    //Longitud
    System.out.println(name.length());
    //Obtener caracter
    System.out.println(name.charAt(name.length()-1));

    //Obtener una subcadena

    System.out.println(name.substring(2, 4));

    //Mayusculas y Minusculas

    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());
    System.out.println(name);

    //Comprobar si contiene
    System.out.println("Hola, java".toUpperCase().contains("AVA"));

    //Comparación

    System.out.println(name.equals("edgar"));
    System.out.println(name.equals("Edgar"));
    System.out.println(name.equalsIgnoreCase("edgar"));
      //== vs equals
      var a = "edgar";
      var b = "edgar";
      var c = new String("edgar");
      System.out.println(a ==  b);
      System.out.println(a ==  c);

      // Trim
      System.out.println(" hola como andamos tio ".trim());

      //Replace 
      System.out.println(" hola como andamos tio ".replace("tio", "padrino"));
      
      // Format
      System.out.println(String.format("hola soy %s y tengo %d", name, age));

 }    
}
