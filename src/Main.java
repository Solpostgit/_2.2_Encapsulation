import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Hogwarts[] printedStudents = new Hogwarts[]{
                new Griffindor("Harry Potter", "Griffindor", 7,6, 5, 6, 7),
                new Griffindor("Hermione Granger", "Griffindor", 5,5, 5, 5, 6),
                new Griffindor("Ronald Weasley", "Griffindor", 4,6, 3, 6, 5),
                new Hufflepuff("Zachariah Smith", "Hufflepuff", 4, 5, 6,7, 6),
                new Hufflepuff("Cedric Diggory", "Hufflepuff", 5, 4, 4,5, 7),
                new Hufflepuff("Justin Finch-Fletchley", "Hufflepuff", 6, 4, 7,5, 5),
                new Ravenclaw("Zhou Chang", "Ravenclaw", 5, 5, 7, 5, 5, 7),
                new Ravenclaw("Padma Patil", "Ravenclaw", 4, 6, 6, 7, 5, 5),
                new Ravenclaw("Marcus Belby", "Ravenclaw", 6, 5, 6, 5, 7, 6),
                new Slytherin("Draco Malfoy", "Slytherin", 6,6, 5, 5, 7,4, 7),
                new Slytherin("Graham Montague", "Slytherin", 4,5, 6, 5, 4,5, 4),
                new Slytherin("Gregory Goyle", "Slytherin", 5,4, 4, 4, 5,4, 5),
        };
        System.out.println(Arrays.toString(printedStudents));
    }

}