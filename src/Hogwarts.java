public class Hogwarts {
    private String name;
    private String faculty;
    private int powerMagic;
    private int transgresDist;

    public Hogwarts(String name, String faculty, int powerMagic, int transgresDist) {
        this.name = name;
        this.faculty = faculty;
        this.powerMagic = powerMagic;
        this.transgresDist = transgresDist;
    }

    public void printStudent() {
        System.out.println(name + " " + faculty + " " + powerMagic + " " + transgresDist + " ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public void setPowerMagic(int powerMagic) {
        this.powerMagic = powerMagic;
    }

    public int getTransgresDist() {
        return transgresDist;
    }

    public void setTransgresDist(int transgresDist) {
        this.transgresDist = transgresDist;
    }

    @Override
    public String toString() {
        return "Hogwarts {" + name + " " + '\'' + faculty + '\'' +
                ", powerMagic=" + powerMagic +
                ", transgresDist=" + transgresDist +
                '}';
    }
}
