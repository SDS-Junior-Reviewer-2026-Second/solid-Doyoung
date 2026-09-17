package greeter;

public class Greeter {

    private Formality formality = new Formality();

    public String greet() {
        return formality.getGreeting();
    }

    public void setFormality(String formalityString) {
        this.formality = Formality.fromString(formalityString);
    }
}
