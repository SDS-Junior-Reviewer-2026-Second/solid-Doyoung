package birds;

public class Bird {

    int numberOfFeathers;

    public Bird(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    public void molt() {
        numberOfFeathers--;
    }
}
