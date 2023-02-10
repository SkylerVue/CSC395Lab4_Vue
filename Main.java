import java.util.Scanner;
import javax.swing.*;
import java.util.Random;

public class Main {

    static Random random = new Random();

    public static void main(String[] args) {

        // The subjects
        StockMarket stockMarket = new StockMarket();
        WeatherStation weatherStation = new WeatherStation();
        NewsAP theNews = new NewsAP();

        // The observers
        StockWatcher stockWatcher = new StockWatcher(stockMarket);
        NewsFeed newsFeed = new NewsFeed(theNews,weatherStation,stockMarket);
        Database database = new Database(stockMarket);

        // Subjects implement Runnable. Make Thread to run in.
        Thread stockThread = new Thread(stockMarket);
        Thread weatherThread = new Thread(weatherStation);
        Thread newsThread = new Thread(theNews);

        // Start all threads
        stockThread.start();
        weatherThread.start();
        newsThread.start();
        
        newsFeed.start();
        stockWatcher.start();
        database.start();
           // Subject thread that controls the scrolling headline

        while (true) {
        }
    }
}
