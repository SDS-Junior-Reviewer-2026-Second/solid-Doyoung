package weather;

public class WeatherTracker {

    String currentConditions;
    WeatherNotifier rainyDayNotifier;
    WeatherNotifier sunnyDayNotifier;

    public WeatherTracker() {
        rainyDayNotifier = new Phone();
        sunnyDayNotifier = new Email();
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (weatherDescription == "rainy") {
            String alert = rainyDayNotifier.generateWeatherAlert(
                weatherDescription
            );
            System.out.print(alert);
        }
        if (weatherDescription == "sunny") {
            String alert = sunnyDayNotifier.generateWeatherAlert(
                weatherDescription
            );
            System.out.print(alert);
        }
    }
}
