package fbcmd4j;

import facebook4j.Account;
import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.Reading;
import facebook4j.ResponseList;
import facebook4j.User;
import facebook4j.auth.AccessToken;
import org.apache.logging.log4j.Logger;
import org.checkerframework.common.reflection.qual.NewInstance;
import org.apache.logging.log4j.LogManager;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class App {

    static Scanner input = new Scanner(System.in);

    private static final Logger logger = LogManager.getLogger(App.class);

    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

        Facebook facebook = new FacebookFactory().getInstance();

        User me = null;
        try {
            me = facebook.getMe();
        } catch (FacebookException e) {
            e.printStackTrace();
        }

        logger.debug(me.getId());
        logger.debug(me.getName());
        logger.debug(me.getEmail());

        Integer opcion = 1;

        while (opcion != 0){

        opcion = App.getopcion();

        try {
            switch (opcion) {
            case 1:

            logger.debug(facebook.getHome());

                break;
            case 2:
            logger.debug(facebook.getFeed());

                break;
            case 3:
            logger.debug(facebook.postStatusMessage("Chale que sad esto no jala"));

                break;
            case 4:
            logger.debug(facebook.postLink(new URL("https://media.giphy.com/media/hs6uT1cOjq0VLkI66r/giphy.gif")));

                break;

            default:

                break; 
            }

        } catch (FacebookException | MalformedURLException e) {
        System.out.println("No se pudo realizar la accion, cheque los permisos de la app."); 
        System.out.println(" "); 
     }

    }

             
 }

    public static Integer getopcion(){
        System.out.println("1. Obtener NewsFeed)"); 
        System.out.println("2. Obtener Publicaciones en el muro)"); 
        System.out.println("3. Hacer Publicacion en el muro)"); 
        System.out.println("4. Hacer Publicacion con link en el muro)"); 
        System.out.println("0. Cerra Aplicacion)"); 
        System.out.println("Elige una opcion (numero)");     
        Integer opcion;
        opcion = input.nextInt();
        return opcion;
        

    
  }



}

