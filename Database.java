public class Database implements Observer {
    StockData stocks;
    StockMarket stockMarket;

    public Database(StockMarket data){
       
    }

    private void updateStocks(StockData data) {
    }

    public void update(Object newData) {
        if (newData instanceof StockData) {
            updateStocks((StockData) newData);
        }
        
    }

}
