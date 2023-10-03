public class Hogwarts {
    private String nameStudent;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String nameStudent, int magicPower, int transgressionDistance) {
        this.nameStudent = nameStudent;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }
}
