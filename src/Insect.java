public abstract class Insect {

private String insectName;
private int numberOfWings;
private final int legs = 6;

    public String getInsectName() {
        return insectName;
    }

    public int getNumberOfWings() {
        return numberOfWings;
    }

    public int getLegs(){
        return legs;
    }

    public void setInsectName(String insectName) {
        this.insectName = insectName;
    }

    public void setNumberOfWings(int numberOfWings) {
        this.numberOfWings = numberOfWings;
    }

    public Insect(String insectName, int numberOfWings) {
        this.insectName = insectName;
        this.numberOfWings = numberOfWings;
    }

    public abstract void printSpeciesData();
}
