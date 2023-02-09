public class StockWatcher implements Observer{
    private StockData stockData;

    NewsDisplay stockDisplay = new NewsDisplay(600, 600);

    public StockWatcher(StockMarket stockMarket) {
    }

    public void updateStocks(StockData data){
        stockDisplay.stockRedraw(stockData.toString());

    }

    @Override
    public void update(Object newData) {
        if(newData instanceof StockData){
            updateStocks((StockData) newData);
        }   
    }
}
