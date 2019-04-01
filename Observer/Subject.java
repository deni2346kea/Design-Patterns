package Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private String ActualWeather;



    public String getActualWeather() {
        return ActualWeather;
    }


    public void setActualWeather(String ActualWeather) {
        this.ActualWeather = ActualWeather;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}