public class Butterfly extends Insect{

    protected String wingColor;
    protected String favoriteFlower;

    public String getWingColor() {
        return wingColor;
    }

    public String getFavoriteFlower() {
        return favoriteFlower;
    }

    public void setWingColor(String wingColor) {
        this.wingColor = wingColor;
    }

    public void setFavoriteFlower(String favoriteFlower) {
        this.favoriteFlower = favoriteFlower;
    }

    public Butterfly(String insectName, int numberOfWings, String wingColor, String favoriteFlower) {
        super(insectName, numberOfWings);
        this.wingColor = wingColor;
        this.favoriteFlower = favoriteFlower;
    }

    public void printSpeciesData(){

        System.out.println("Insect name: " + getInsectName());
        System.out.println("Insect wing color: " + getWingColor());
        System.out.println("Insect number of wings: " + getNumberOfWings());
        System.out.println("Insect number of legs: " + getLegs());
        System.out.println("Insect favorite flower: " + getFavoriteFlower());

    }
}
