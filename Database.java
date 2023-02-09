public class Database implements Observer {
    private StockData stockData;
    StockMarket stockMarket;
    NewsDisplay dataDisplay = new NewsDisplay(600, 600);


    public Database(StockMarket database){
       
    }

    private void updateStocks(StockData data) {
        dataDisplay.stockRedraw(stockData.toString());
    }

    public void update(Object newData) {
        if (newData instanceof StockData) {
            updateStocks((StockData) newData);
        }
        
    }

}
