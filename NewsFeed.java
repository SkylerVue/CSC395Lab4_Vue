public class NewsFeed extends Thread implements Observer {
    NewsDisplay newsDisplay = new NewsDisplay(600, 600, "News Feed");
    private StockData stockData;
    private NewsData newsData;
   
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
        newsDisplay.repaint( newsData.toString());
    }
    private void updateHeadline(NewsData data) {
        newsData.getHeadline();
        newsDisplay.repaint(newsData.toString());
    }
    private void updateWeather(WeatherData data) {

        newsDisplay.repaint(newsData.toString());
    }
    private void updateStocks(StockData data) {
        newsDisplay.repaint(stockData.toString());
    }
    
}
