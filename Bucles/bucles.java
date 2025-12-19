import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class bucles {
    public static void main(String[] args) {
        //Loops
        
          String[]names = {"hola", "mundo", "Edgar"};
        //For
        int i;
        for(i=5; i < 5; i+=2){
            System.out.println("Hola mundo");
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

                //While
        int index = 0;
        while(index<5){
            System.out.println("Hola java");
            index++;
        for( i= 0; i< names.length ; i++ ){
            System.out.println(names[i]);
        }

        }
        index = 0;
        while(index<names.length){
            System.out.println(names[index]);
            if(names[index].equals("hola")){
                index+=2;
            }
            index++;

        }
        index = 0;
        do{
            System.out.println("Hola java");
            index++;

        }while(index<0);
        
        //Control de bucles

        //-break
        for(String name: names){
           
            if(name.equals("mundo")){
                break;
            }
            System.out.println(name);

        }

        //Continue
          for(i=0; i < 5; i++){
            if(i == 3){
            continue;
            }
            System.out.println(i);
        }


    }
    
}
