import javax.print.PrintService;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor("Harry Potter", "Griffindor", 7, 6, 5, 6, 7);
        Griffindor hermioneGranger = new Griffindor("Hermione Granger", "Griffindor", 5, 5, 5, 5, 6);
        Griffindor ronaldWeasley = new Griffindor("Ronald Weasley", "Griffindor", 4, 6, 3, 6, 5);

        Hufflepuff zachariahSmith = new Hufflepuff("Zachariah Smith", "Hufflepuff", 4, 5, 6, 7, 6);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", "Hufflepuff", 5, 4, 4, 5, 7);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley", "Hufflepuff", 6, 4, 7, 5, 5);

        Ravenclaw zhouChang = new Ravenclaw("Zhou Chang", "Ravenclaw", 5, 5, 7, 5, 5, 7);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", "Ravenclaw", 4, 6, 6, 7, 5, 5);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", "Ravenclaw", 6, 5, 6, 5, 7, 6);

        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", "Slytherin", 6, 6, 5, 5, 7, 4, 7);
        Slytherin grahamMontague = new Slytherin("Graham Montague", "Slytherin", 4, 5, 6, 5, 4, 5, 4);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", "Slytherin", 5, 4, 4, 4, 5, 4, 5);

        System.out.println(zachariahSmith);
        System.out.println();
        harryPotter.printStudent(); //метод описания студента
        hermioneGranger.printStudent();
        cedricDiggory.printStudent();
        justinFinchFletchley.printStudent();
        zhouChang.printStudent();
        dracoMalfoy.printStudent();
        System.out.println();

        compareFaculty(harryPotter, ronaldWeasley); //сравниваем Гриффиндорцев
        compareFaculty(zachariahSmith, justinFinchFletchley); //сравниваем Пуффендуйцев
        compareFaculty(padmaPatil, marcusBelby); //сравниваем Когтевранцев
        compareFaculty(grahamMontague, gregoryGoyle); //сравниваем Слизеринцев
    }
    //Метод сравнения Гриффендорцев
    public static void compareFaculty(Griffindor object1, Griffindor object2) {
        int score1 = object1.getNobility() + object1.getHonor() + object1.getBravery();
        int score2 = object2.getNobility() + object2.getHonor() + object2.getBravery();
        if (score1 > score2) {
            System.out.println(object1.getName() + " лучший Гриффиндорец, чем " + object2.getName());
        } else System.out.println(object2.getName() + " лучший Гриффиндорец, чем " + object1.getName());
    }

    //Использую перегрузку метода compareFaculty для Hufflepuff
    public static void compareFaculty(Hufflepuff object1, Hufflepuff object2) {
        int score1 = object1.getLabour() + object1.getLoyalty() + object1.getHonesty();
        int score2 = object2.getLabour() + object2.getLoyalty() + object2.getHonesty();
        if (score1 > score2) {
            System.out.println(object1.getName() + " лучший Пуффендуец, чем " + object2.getName());
        } else System.out.println(object2.getName() + " лучший Пуффендуец, чем " + object1.getName());
    }

    //Использую перегрузку метода compareFaculty для Ravenclaw
    public static void compareFaculty(Ravenclaw object1, Ravenclaw object2) {
        int score1 = object1.getMind() + object1.getWisdom() + object1.getWit() + object1.getCreativity();
        int score2 = object2.getMind() + object2.getWisdom() + object2.getWit() + object2.getCreativity();
        if (score1 > score2) {
            System.out.println(object1.getName() + " лучший Когтевранец, чем " + object2.getName());
        } else System.out.println(object2.getName() + " лучший Когтевранец, чем " + object1.getName());
    }

    //Использую перегрузку метода compareFaculty для Slytherin
    public static void compareFaculty(Slytherin object1, Slytherin object2) {
        int score1 = object1.getTrick() + object1.getDetermination() + object1.getAmbition() + object1.getResourcefulness() + object1.getDomineering();
        int score2 = object2.getTrick() + object2.getDetermination() + object2.getAmbition() + object2.getResourcefulness() + object2.getDomineering();
        if (score1 > score2) {
            System.out.println(object1.getName() + " лучший Слизеринец, чем " + object2.getName());
        } else System.out.println(object2.getName() + " лучший Слизеринец, чем " + object1.getName());
    }
        /*Hogwarts[] printedStudents = new Hogwarts[]{
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
                new Slytherin("Gregory Goyle", "Slytherin", 5,4, 4, 4, 5, 4, 5)
        } */


}