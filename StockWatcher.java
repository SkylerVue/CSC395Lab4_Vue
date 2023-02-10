public class StockWatcher extends Thread implements Observer{
    private StockData stockData;

    NewsDisplay stockDisplay = new NewsDisplay(600, 600, "Stocks");

    public StockWatcher(StockMarket stockMarket) {
    }
    public void updateStocks(StockData data){
        stockDisplay.repaint(stockData.toString());

    }
    

    @Override
    public void update(Object newData) {
        if(newData instanceof StockData){
            updateStocks((StockData) newData);
        }   
    }
}
