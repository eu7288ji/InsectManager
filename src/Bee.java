public class Bee extends Insect{

    protected String beeColor;
    protected boolean honey;
    protected String favoriteFlower;

    public String getBeeColor() {
        return beeColor;
    }

    public boolean isHoney() {
        return honey;
    }

    public String getFavoriteFlower() {
        return favoriteFlower;
    }

    public void setBeeColor(String beeColor) {
        this.beeColor = beeColor;
    }

    public void setHoney(boolean honey) {
        this.honey = honey;
    }

    public void setFavoriteFlower(String favoriteFlower) {
        this.favoriteFlower = favoriteFlower;
    }

    public Bee(String insectName, int numberOfWings, String beeColor, boolean honey, String favoriteFlower) {
        super(insectName, numberOfWings);
        this.beeColor = beeColor;
        this.honey = honey;
        this.favoriteFlower = favoriteFlower;
    }

    public void printSpeciesData(){

        System.out.println("Insect name: " + getInsectName());
        System.out.println("Insect color: " + getBeeColor());
        System.out.println("Insect number of wings: " + getNumberOfWings());
        System.out.println("Insect number of legs: " + getLegs());
        System.out.println("Insect favorite flower: " + getFavoriteFlower());
        if (honey = true){
            System.out.println("This bee does make honey");
        }
        else{
            System.out.println("This bee does not make honey");
        }
    }
}
