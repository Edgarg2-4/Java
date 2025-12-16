import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        //Declaraciones
        ArrayList <String> names = new ArrayList<>();
        var numbers = new ArrayList<Integer>();
        //Tamaño
        System.out.println(names.size());
        //Añadir elementos 
        names.add("Edgar");
        names.add("Rojas");
        names.add("Guadarrama");
        System.out.println(names.size());


        //Acceder a los elementos

        System.out.println(names.getFirst());
        System.out.println(names.getLast());
        System.out.println(names.get(1));

        //Modificar elementos
        names.set(0, "padrino");
        System.out.println(names.getFirst());

        //Eliminar
        names.remove(2);
        System.out.println(names.getLast());
        System.out.println(names.size());

        //Buscar elementos
        System.out.println(names.contains("Edgar"));
        System.out.println(names.contains("Rojas"));

        names.clear();
        System.out.println(names.size());
    }
    
}
