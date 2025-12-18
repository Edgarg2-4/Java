import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class bucles {
    public static void main(String[] args) {
        //Loops

        //For
        int i;
        for(i=5; i < 5; i+=2){
            System.out.println("Hola mundo");
        }

        String[] names ={"Edgar", "Rojas", "Guadaraama", "Edgarrg24@gmail.com"};

        for( i= 0; i< names.length ; i++ ){
            System.out.println(names[i]);
        }
        //for each
        for(String name: names){
            System.out.println(name);

        }

        HashSet<Integer> numbers = new HashSet<>();
         numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        for(Integer number: numbers){
            System.out.println(number);

        }

        HashMap<String, String> Users = new HashMap<>();
        Users.put("Edgar", "Edgargmail.com");
        Users.put("pepe", "pepe@gmail.com");
        Users.put("papoi", "papoi@gmail.com");

        for(Map.Entry<String, String> user: Users.entrySet()){
            System.out.println(user.getValue());
            System.out.println(user.getKey());

        }

    }
    
}
