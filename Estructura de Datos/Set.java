import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        
        //Declaracion y creacion
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();


        //Tamaño
        System.out.println(names.size());

        //Añadir elementos

        names.add("Edgar");
        names.add("Rojas");
        names.add("Guadarrama");
        names.add("Edgarrg@gmail.com");
        System.out.println(names.size());
        
        //Acceder a Elementos
        System.out.println(names);

        //Eliminar elementos 
        names.remove("Edgar");

        //Buscar elementos
        System.out.println(names.size());
        System.out.println(names.contains("Edgar"));
        System.out.println(names.contains("Edgarrg@gmail.com"));
        
         System.out.println(names);
        names.add("Edgar");
        names.add("Edgar");
        names.add("Edgar");
         System.out.println(names);


         //Conjuntos
        
         var countries = new HashSet<String>();
         countries.add("España");
         countries.add("Mexico");
         countries.add("Argentina");
         countries.add("Edgar");
         names.addAll(countries);
         
         System.out.println(names);

        // names.removeAll(countries);
        names.retainAll(countries);
         System.out.println(names);

    }
    
}
