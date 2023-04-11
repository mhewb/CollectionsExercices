package S3Map;

import java.util.HashMap;
public class Main {

    public static void main(String[] args) {

        // Veuillez initialiser un carnet de contacts
        HashMap<String, String> contacts = new HashMap<>();
        contacts.put("Boris", "0680000000");
        contacts.put("Arthur", "0607070606");
        contacts.put("Thibault", "0605000005");
        contacts.put("Estelle", "0700000700");

        // Récupérez et affichez le numéro d’Arthur
        System.out.println("Arthur's phone number: " + contacts.get("Arthur"));

        // Affichez tout le carnet de contacts comme dans l’exemple ci-dessous
        for (var key : contacts.keySet()) {
            System.out.println("name:" + key + " => number: " + contacts.get(key));
        }
        System.out.println("-------------------");

        // Boris a changé de numéro, veuillez mettre à jour le carnet de contacts : 0799999907
        System.out.println("Updating Boris numnber:");
        System.out.println("Boris' phone number: " + contacts.get("Boris"));
        contacts.put("Boris", "0799999907");
        System.out.println("Boris' phone number: " + contacts.get("Boris"));
        System.out.println("-------------------");

        // Créez et utilisez une méthode qui affiche le carnet de contacts.
        // Faire en sorte que les numéros s’affichent avec un point entre chaque couple de numéros.
        displayMapContact(contacts);

        // Mettre à jour votre HashMap pour utiliser une classe User, rattachée au numéro.
        // La classe User devra comporter un prénom et une région de type Enum

        HashMap<User, String> contactsNew = new HashMap<>();
        contactsNew.put(new User("Boris", Region.FRANCE), "0680000000");
        contactsNew.put(new User("Arthur", Region.POLYNESIE), "0607070606");
        contactsNew.put(new User("Thibault", Region.INDONESIE), "0605000005");
        contactsNew.put(new User("Estelle", Region.MARTINIQUE), "0700000700");
        displayMapContactWithRegion(contactsNew);


    }

    public static void displayMapContact(HashMap<String, String> map) {
        for (String key : map.keySet()) {
            String phoneNumber = map.get(key).toString();
            phoneNumber = phoneNumber.replaceAll("(\\d{2})\\B", "$1.");
            System.out.println("name:" + key + " => number: " + phoneNumber);
        }
        System.out.println("-------------------");
    }

    public static void displayMapContactWithRegion(HashMap<User, String> map) {
        for (User key : map.keySet()) {
            String phoneNumber = map.get(key).toString();
            phoneNumber = phoneNumber.replaceAll("(\\d{2})\\B", "$1.");
            phoneNumber = phoneNumber.replaceAll("(^0)", key.getRegion().label + "(0)");
            System.out.println("name:" + key.getName() + " => number: " + phoneNumber);
        }
        System.out.println("-------------------");
    }


}
