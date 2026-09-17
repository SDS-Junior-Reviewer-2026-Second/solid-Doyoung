package house;

abstract class Apartment {

    int squareFootage;
    int numberOfBedrooms;

    public abstract void setSquareFootage(int sqft);

    public void upgrade() {
        squareFootage += 40;
    }
}
