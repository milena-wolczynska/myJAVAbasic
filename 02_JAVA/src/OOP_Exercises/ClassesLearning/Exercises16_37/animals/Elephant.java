package OOP_Exercises.ClassesLearning.Exercises16_37.animals;

public class Elephant {
    public static final String SOUND = "TRRR!";
    private long id;
    private int weight;
    private int trunkNumber;
    private int earsNumber;
    private boolean isHealthy;
    private boolean isMammal;
    private boolean isHerbivore;
    public String animalName;
    private String playBeautiful;

    public Elephant(long id, int weight, int trunkNumber, int earsNumber, boolean isHealthy, boolean isMammal, boolean isHerbivore,
                    String animalName, String playBeautiful) {
        this.id = id;
        this.weight = weight;
        this.trunkNumber = trunkNumber;
        this.earsNumber = earsNumber;
        this.isHealthy = isHealthy;
        this.isMammal = isMammal;
        this.isHerbivore = isHerbivore;
        this.animalName = animalName;
        this.playBeautiful = playBeautiful;
    }
    public Elephant(long id, int weight, int trunkNumber, int earsNumber, boolean isHealthy, boolean isMammal, boolean isHerbivore) {
        this.id = id;
        this.weight = weight;
        this.trunkNumber = trunkNumber;
        this.earsNumber = earsNumber;
        this.isHealthy = isHealthy;
        this.isMammal = isMammal;
        this.isHerbivore = isHerbivore;
        this.animalName = "Benjamin";
        this.playBeautiful = SOUND;
    }
    public static void typicalPlayTrunk(){
        System.out.println(SOUND);
    }
    public void playTrunk() {
        System.out.println(this.playBeautiful);
    }
    public void walk(){
        System.out.println("boomboomboom");
    }
    private boolean isCorrectWeight(int weight) {
        return weight < 10000 & weight > 1000;
    }

//    @Override
//    public String toString() {
//        //return super.toString();
//        return "animal id: " + this.id + ",name: " + this.animalName;
//    }


    @Override
    public String toString() {
        return "Elephant{" +
                "id=" + id +
                ", weight=" + weight +
                ", trunkNumber=" + trunkNumber +
                ", earsNumber=" + earsNumber +
                ", isHealthy=" + isHealthy +
                ", isMammal=" + isMammal +
                ", isHerbivore=" + isHerbivore +
                ", animalName='" + animalName + '\'' +
                ", playBeautiful='" + playBeautiful + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        if (isCorrectWeight(weight)) {
            this.weight = weight;
        } else {
            System.out.println("weight of this animal is to large");
            /*int was set on 0
            if (this.weight == null) {
                this.weight = 0;
            }*/
        }
    }
    public int getTrunkNumber() {
        return trunkNumber;
    }
    public int getEarsNumber() {
        return earsNumber;
    }
    public boolean isHealthy() {
        return isHealthy;
    }
    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }
    public boolean isMammal() {
        return isMammal;
    }
    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }
    public boolean isHerbivore() {
        return isHerbivore;
    }
    public void setHerbivore(boolean herbivore) {
        isHerbivore = herbivore;
    }
    public String getPlayBeautiful() {
        return playBeautiful;
    }
    public void setPlayBeautiful(String playBeautiful) {
        this.playBeautiful = playBeautiful;
    }

}
