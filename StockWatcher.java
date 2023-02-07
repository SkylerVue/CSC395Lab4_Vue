public class StockWatcher implements Observer{

    public StockWatcher(StockMarket stockMarket) {
    }

    public void updateStocks(StockData data){

    }

    @Override
    public void update(Object newData) {
        if(newData instanceof StockData){
            updateStocks((StockData) newData);
        }   
    }
}
