import java.util.HashMap;
public class Maps {
    public static void main(String[] args) {
         //Declaracion y creacion
        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();

        //Tamaño
        System.out.println(names.size());

        //añadir elementos
        names.put("Edgar", "Edgargmail.com");
        names.put("pepe", "pepe@gmail.com");
        names.put("papoi", "papoi@gmail.com");
        System.out.println(names);

        //Acceder a los elementos
        System.out.println(names.get("Edgar"));
        System.out.println(names.get("hola"));

        //verificar elementos

        System.out.println(names.containsKey("Edgar"));
        System.out.println(names.containsKey("hola"));

        System.out.println(names.containsValue("Edgargmail.com"));

        //Elimnar
        names.remove("Edgar");
        System.out.println(names);

        //Limapiar Hasmap
        names.clear();
        System.out.println(names);

        //otras operaciones

        names.put("Edgar", "Edgargmail.com");
        names.put("Edgar", "Edgar@gmail.com");
        //Remplanzando solo si exise
        names.replace("pepe", "pepe@gmail.com");
        //añadir si solo sii no existe 
        names.putIfAbsent("papoi", "papoi@gmail.com");
        System.out.println(names);

        //Otras operaciones 
        System.out.println(names.isEmpty());
        System.out.println(names.values());

        var values = names.values();

        System.out.println(values);



    }
}
