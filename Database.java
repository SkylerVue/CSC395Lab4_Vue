public class Database extends Thread implements Observer {
    private StockData stockData;
    StockMarket stockMarket;
    NewsDisplay dataDisplay = new NewsDisplay(600, 600, "Data Display");


    public Database(StockMarket database){
       
    }

    private void updateStocks(StockData data) {
        dataDisplay.repaint(stockData.toString());
    }

    public void update(Object newData) {
        if (newData instanceof StockData) {
            updateStocks((StockData) newData);
        }
        
    }

}
