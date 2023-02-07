public class NewsFeed extends Thread implements Observer {

   
    public NewsFeed( NewsAP theNews, WeatherStation weatherStation, StockMarket stockMarket){

    }
    public void update(Object data) {
        if (data instanceof StockData) {
            updateStocks((StockData) data);
        } else if (data instanceof WeatherData) {
            updateWeather((WeatherData) data);
        } else if (data instanceof NewsData) {
            updateHeadline((NewsData) data);
        } else {
            // throw an exception is the appropriate thing to do here
        }
    }
    private void updateHeadline(NewsData data) {
    }
    private void updateWeather(WeatherData data) {
    }
    private void updateStocks(StockData data) {
    }
    
}
