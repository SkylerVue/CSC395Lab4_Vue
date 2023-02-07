public class WeatherStation extends Subject {
    public void notifyObservers(){
         for (Observer obs : observers()) {
            WeatherData wData = new WeatherData();
            wData.weatherGenerator();
            obs.update(wData);
         }
    }
    public void run(){
        while (true) {
            notifyObservers();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }


    
}
