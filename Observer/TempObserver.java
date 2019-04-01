package Observer;

public class TempObserver extends Observer{

    public TempObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        String temp = subject.getActualWeather();
        if(temp=="Sunny"){
            System.out.println("Temp -  39°C");
        }else if(temp=="Rainy"){
            System.out.println("Temp -  11°C");
        }else if(temp=="Cloudy"){
            System.out.println("Temp -  27°C");
        }
    }
}