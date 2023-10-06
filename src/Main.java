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

        compareFaculty(harryPotter, ronaldWeasley); //сравниваем двух Гриффиндорцев
        compareFaculty(zachariahSmith, justinFinchFletchley); //сравниваем двух Пуффендуйцев
        compareFaculty(padmaPatil, marcusBelby); //сравниваем двух Когтевранцев
        compareFaculty(grahamMontague, gregoryGoyle); //сравниваем двух Слизеринцев

        System.out.println();
        compareStudent(hermioneGranger, dracoMalfoy); //сравниваем двух студентов
        compareStudent(zhouChang, marcusBelby); //сравниваем двух студентов
    }

    //Метод сравнения Гриффендорцев
    public static void compareFaculty(Griffindor griffindorStudent1, Griffindor griffindorStudent2) {
        int score1 = griffindorStudent1.getNobility() + griffindorStudent1.getHonor() + griffindorStudent1.getBravery();
        int score2 = griffindorStudent2.getNobility() + griffindorStudent2.getHonor() + griffindorStudent2.getBravery();
        if (score1 > score2) {
            System.out.println(griffindorStudent1.getName() + " лучший Гриффиндорец, чем " + griffindorStudent2.getName());
        } else System.out.println(griffindorStudent2.getName() + " лучший Гриффиндорец, чем " + griffindorStudent1.getName());
    }

    //Использую перегрузку метода compareFaculty для Hufflepuff
    public static void compareFaculty(Hufflepuff hufflepuffStudent1, Hufflepuff hufflepuffStudent2) {
        int score1 = hufflepuffStudent1.getLabour() + hufflepuffStudent1.getLoyalty() + hufflepuffStudent1.getHonesty();
        int score2 = hufflepuffStudent2.getLabour() + hufflepuffStudent2.getLoyalty() + hufflepuffStudent2.getHonesty();
        if (score1 > score2) {
            System.out.println(hufflepuffStudent1.getName() + " лучший Пуффендуец, чем " + hufflepuffStudent2.getName());
        } else System.out.println(hufflepuffStudent2.getName() + " лучший Пуффендуец, чем " + hufflepuffStudent1.getName());
    }

    //Использую перегрузку метода compareFaculty для Ravenclaw
    public static void compareFaculty(Ravenclaw ravenclawStudent1, Ravenclaw ravenclawStudent2) {
        int score1 = ravenclawStudent1.getMind() + ravenclawStudent1.getWisdom() + ravenclawStudent1.getWit() + ravenclawStudent1.getCreativity();
        int score2 = ravenclawStudent2.getMind() + ravenclawStudent2.getWisdom() + ravenclawStudent2.getWit() + ravenclawStudent2.getCreativity();
        if (score1 > score2) {
            System.out.println(ravenclawStudent1.getName() + " лучший Когтевранец, чем " + ravenclawStudent2.getName());
        } else System.out.println(ravenclawStudent2.getName() + " лучший Когтевранец, чем " + ravenclawStudent1.getName());
    }

    //Использую перегрузку метода compareFaculty для Slytherin
    public static void compareFaculty(Slytherin slytherinStudent1, Slytherin slytherinStudent2) {
        int score1 = slytherinStudent1.getTrick() + slytherinStudent1.getDetermination() + slytherinStudent1.getAmbition() + slytherinStudent1.getResourcefulness() + slytherinStudent1.getDomineering();
        int score2 = slytherinStudent2.getTrick() + slytherinStudent2.getDetermination() + slytherinStudent2.getAmbition() + slytherinStudent2.getResourcefulness() + slytherinStudent2.getDomineering();
        if (score1 > score2) {
            System.out.println(slytherinStudent1.getName() + " лучший Слизеринец, чем " + slytherinStudent2.getName());
        } else System.out.println(slytherinStudent2.getName() + " лучший Слизеринец, чем " + slytherinStudent1.getName());
    }

    //compareStudent сравнение студентов по силе магии и трансгрессии
    public static void compareStudent(Hogwarts hogwartsStudent1, Hogwarts hogwartsStudent2) {
        int scorePower1 = hogwartsStudent1.getPowerMagic() + hogwartsStudent1.getTransgresDist(); //сумма очков силаМагии и трансгрессия ;)
        int scorePower2 = hogwartsStudent2.getPowerMagic() + hogwartsStudent2.getTransgresDist();
        System.out.println(hogwartsStudent1.getName() + " обладает бОльшей мощностью магии, чем " + hogwartsStudent2.getName());
    }
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


