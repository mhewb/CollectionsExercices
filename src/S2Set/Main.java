package S2Set;

import S1List.Country;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        //initialiser un ensemble de String nommé colors : Rouge, Cyan, Bleu et Vert

        HashSet<String> colors = new HashSet<String>();
        colors.add("Red");
        colors.add("Cyan");
        colors.add("Blue");
        colors.add("Green");

        displaySetOfString(colors);

        //Supprimez la couleur Rouge
        colors.remove("Red");
        displaySetOfString(colors);

        //Initialisez un ensemble de String nommé others : Jaune, Magenta
        HashSet<String> others = new HashSet<String>();
        others.add("Yellow");
        others.add("Magenta");
        displaySetOfString(others);

        //Ajoutez l’ensemble others dans l’ensemble colors
        colors.addAll(others);
        displaySetOfString(colors);

        // Recherchez une fonction spécifique de suppression qui s’exécute si une condition est vraie. Supprimez la couleur Vert.
        if (colors.contains("Green")) {
            colors.remove("Green");
        }
        displaySetOfString(colors);

        // Au sein de colors, effectuez une suppression de tous les éléments contenus par others
        colors.removeAll(others);
        displaySetOfString(colors);

        // Videz les ensembles colors et others
        colors.clear();
        displaySetOfString(colors);
        others.clear();
        displaySetOfString(others);

    }

    public static void displaySetOfString(HashSet<String> set) {

        if (set.isEmpty()) {
            System.out.println("Empty set.");
        } else {
            for (String s: set) {
                System.out.println(" - " + s);
            }
        }
        System.out.println("--------");
    }

}
