

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

    }

    public static void SendEmail(){
        System.out.println("Se envia el email");

    }

    public static void SendEmailToUser(String email){
        System.out.println("Se envia el email a "+ email);

    }

    public static void SendEmailToUser(String email, String name){
        System.out.println("Se envia el email a ("+ email + ") "+ name);

    }


     public static void SendEmailToUser(String[] emails){
        for(String email: emails)
        System.out.println("Se envia el email a "+ email);

    }


   
    
    
    
}
