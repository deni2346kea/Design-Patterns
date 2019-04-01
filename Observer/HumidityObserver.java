package Observer;

public class HumidityObserver extends Observer{

    public HumidityObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        //System.out.println( "Observing humidity" );


        String hum = subject.getActualWeather();
        if(hum=="Sunny"){
            System.out.println("Humidity is 20%");
        } else if(hum=="Rainy"){
            System.out.println("Humidity is 83%");
        } else if(hum=="Cloudy"){
            System.out.println("Humidity is 68%");
        }
    }
}