class Hufflepuff extends Hogwarts {
    private int labour; //труд
    private int loyalty; //верность
    private int honesty; //честность

    public Hufflepuff(String name, String faculty, int powerMagic, int transgresDist, int labour, int loyalty, int honesty) {
        super(name, faculty, powerMagic, transgresDist);
        this.labour = labour;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override  //переопределил родительский метод, для этого установил идентификатор default у полей класса Hogwarts
    public void printStudent() {
        System.out.println(name + " " + faculty + " " + "Power Magic " + powerMagic + " " + "Transgression " + transgresDist + " " + "Hufflepuff {" +
                "labour=" + labour +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}');
    }

    public int getLabour() {
        return labour;
    }

    public void setLabour(int labour) {
        this.labour = labour;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
