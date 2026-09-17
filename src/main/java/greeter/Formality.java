package greeter;

public class Formality {

    public String getGreeting() {
        return "Hello.";
    }

    public static Formality fromString(String formality) {
        if (formality.equals("formal")) {
            return new Formal();
        } else if (formality.equals("casual")) {
            return new Casual();
        } else if (formality.equals("intimate")) {
            return new Intimate();
        } else {
            return new Formality();
        }
    }
}

class Formal extends Formality {

    @Override
    public String getGreeting() {
        return "Good evening, sir.";
    }
}

class Casual extends Formality {

    @Override
    public String getGreeting() {
        return "Sup bro?";
    }
}

class Intimate extends Formality {

    @Override
    public String getGreeting() {
        return "Hello Darling!";
    }
}
