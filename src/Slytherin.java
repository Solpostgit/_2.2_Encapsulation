class Slytherin extends Hogwarts {
    private int trick; //хитрость
    private int determination; //решительность
    private int ambition; //амбициозность
    private int resourcefulness; //находчивость
    private int domineering; //жажда власти
    public Slytherin(String name, String faculty, int powerMagic, int transgresDist, int trick, int determination, int ambition, int resourcefulness, int domineering) {
        super(name, faculty, powerMagic, transgresDist);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.domineering = domineering;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getDomineering() {
        return domineering;
    }

    public void setDomineering(int domineering) {
        this.domineering = domineering;
    }
}
