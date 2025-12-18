

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

        //While
        int index = 0;
        while(index<5){
            System.out.println("Hola java");
            index++;

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
        
    }
    
}
