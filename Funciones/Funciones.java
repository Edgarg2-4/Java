

public class Funciones {
    public static void main(String[] args) {
        String[]names = {"hola", "mundo", "Edgar"};
        //Funciones
        for(int i = 0; i<10;i++){
        SendEmail();
        }

        SendEmail();

        SendEmailToUser("Edgarrojas@gmail.com");

        SendEmailToUser("Edgarrojas@gmail.com", "Edgar");

        SendEmailToUser(names);

        var state = SendEmailWithState("");
        System.out.println(state);



    }

    public static void SendEmail(){
        System.out.println("Se envia el email");

    }
    //Sobrecarga de funciiones 
    public static void SendEmailToUser(String email){
        System.out.println("Se envia el email a "+ email);

    }

    public static void SendEmailToUser(String email, String name){
        System.out.println("Se envia el email a ("+ email + ") "+ name);

    }


     public static void SendEmailToUser(String[] emails){
        for(String email: emails)
        SendEmailToUser(email);;

    }
    //Funciones con retorno
     public static boolean SendEmailWithState(String email){
        if(email.isEmpty()){
            return false;
        }
        System.out.println("Se envia el email a "+ email);
        return true;
    }

   
    
    
    
}
