package Observer;

public class ObserverPattern {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HumidityObserver(subject);
        new TempObserver(subject);
        new WindObserver(subject);


        System.out.println("Notice, the weather changed: Rainy");
        subject.setActualWeather("Rainy");


        System.out.println("Notice, the weather changed: Sunny");
        subject.setActualWeather("Sunny");

        System.out.println("Notice, the weather changed: Cloudy");
        subject.setActualWeather("Cloudy");
    }
}