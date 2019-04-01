package Observer;

public class WindObserver extends Observer{

    public WindObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        //System.out.println( "Observing wind conditions" );


        String wind = subject.getActualWeather();
        if(wind=="Sunny"){
            System.out.println("Wind -  WNW 10 mph" + "\n");
        }else if(wind=="Rainy"){
            System.out.println("Wind -  WNW 76 mph"+ "\n");
        }else if(wind=="Cloudy"){
            System.out.println("Wind -  WNW 53 mph"+ "\n");
        }
    }
}
