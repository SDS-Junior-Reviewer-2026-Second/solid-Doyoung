package weather;

public class WeatherTracker {

    String currentConditions;
    WeatherNotifierFactory weatherNotifierFactory =
        new WeatherNotifierFactory();

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;

        WeatherNotifier notifier = weatherNotifierFactory.createNotifier(
            weatherDescription
        );

        System.out.print(notifier.generateWeatherAlert(weatherDescription));
    }
}
