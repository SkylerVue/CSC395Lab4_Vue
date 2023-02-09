public class WeatherStation extends Subject {
    public void notifyObservers(){
         for (Observer obs : observers()) {
            WeatherData wData = new WeatherData();
            wData.weatherGenerator();
            obs.update(new WeatherData(wData));//sends a copy of the data
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
