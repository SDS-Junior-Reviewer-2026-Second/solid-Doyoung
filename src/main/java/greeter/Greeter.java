package greeter;

public class Greeter {

    Formality formality;

    public String greet() {
        return formality.getGreeting();
    }

    public void setFormality(String formalityString) {
        this.formality = Formality.fromString(formalityString);
    }
}
