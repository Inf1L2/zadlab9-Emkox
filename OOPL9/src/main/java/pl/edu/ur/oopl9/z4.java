
package pl.edu.ur.oopl9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class z4 {
       public static void main(String[] args){
       HashMap<String,String> hm = new HashMap<>();
       hm.put("Orange","Pomarańcza");
       hm.put("Cat","Kot");
       hm.put("Apple","Jablko");
       hm.put("Cherry","Wisnia");
       hm.put("Dog","Pies");
       hm.put("Tape","taśma");
       hm.put("Bag","Torba");
       hm.put("You","Ty");
       hm.put("Be","Byc");
       hm.put("Cow","Krowa");
       hm.put("Car","Samochod");
       hm.put("Beach","Plaza");
       hm.put("Factory","Fabryka");
       hm.put("Dispenser","Dozownik");
       hm.put("Hooper","Lejek");
       hm.put("Dirt","Piasek");
       hm.put("Chocolate","Czekolada");
       hm.put("Fire","Ogień");
       hm.put("Sun","Słońce");
       hm.put("Head","Głowa");
       hm.put("Koniec!","Koniec programu");
       
       Scanner x = new Scanner(System.in);
       String slowo;
           System.out.println("Podaj slowo : ");
       
       do{
            slowo = x.nextLine();
            System.out.println(slowo+"-"+hm.get(slowo));
        }while("Koniec!".equals(slowo));
}
}
