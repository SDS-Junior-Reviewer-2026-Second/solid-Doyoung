package weather;

public class WeatherNotifierFactory {

    public WeatherNotifier createNotifier(String weatherDescription) {
        if (weatherDescription == "rainy") {
            return new Phone();
        }

        if (weatherDescription == "sunny") {
            return new Email();
        }

        return null;
    }
}
