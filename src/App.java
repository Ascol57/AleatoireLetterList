import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(generateList(10, 3));
    }

    public static ArrayList<Character> generateList(int listSize, int voyelleNumber) {
        if (voyelleNumber > listSize) {
            throw new IllegalArgumentException("Le nombre de voyelle doit être inférieur ou égal à 10");
        } else if (voyelleNumber < 0) {
            throw new IllegalArgumentException("Le nombre de voyelle doit être positif");
        } else if (listSize < 0) {
            throw new IllegalArgumentException("La taille de la liste doit être positif");
        }

        ArrayList<Character> voyelle = new ArrayList<Character>() {
            {
                add('A');
                add('E');
                add('I');
                add('O');
                add('U');
                add('Y');
            }
        };

        ArrayList<Character> consonne = new ArrayList<Character>() {
            {
                add('B');
                add('C');
                add('D');
                add('F');
                add('G');
                add('H');
                add('J');
                add('K');
                add('L');
                add('M');
                add('N');
                add('P');
                add('Q');
                add('R');
                add('S');
                add('T');
                add('V');
                add('W');
                add('X');
                add('Z');
            }
        };

        ArrayList<Character> liste1 = new ArrayList<Character>();
        ArrayList<Character> liste2 = new ArrayList<Character>();

        for (int i = 0; i < voyelleNumber; i++) {
            int j = (int) Math.round(Math.random() * (voyelle.size() - 1));
            liste1.add(voyelle.get(j));
        }

        for (int i = 0; i < listSize - voyelleNumber; i++) {
            int j = (int) Math.round(Math.random() * (consonne.size() - 1));
            liste1.add(consonne.get(j));
        }

        for (int i = 0; i < listSize; i++) {
            int j = (int) Math.round(Math.random() * (liste1.size() - 1));
            liste2.add(liste1.get(j));
            liste1.remove(j);
        }

        return liste2;
    }
}
