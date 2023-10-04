class Ravenclaw extends Hogwarts {
    private int mind; //ум
    private int wisdom; //мудрость
    private int wit; //остроумие
    private int creativity; //творчество
    public Ravenclaw(String name, String faculty, int powerMagic, int transgresDist, int mind, int wisdom, int wit, int creativity) {
        super(name, faculty, powerMagic, transgresDist);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
}
