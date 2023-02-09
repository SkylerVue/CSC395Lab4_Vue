public class StockMarket extends Subject {

    @Override
    public void notifyObservers() {
        StockData genStockData = new StockData();
        for (Observer obs : observers()) {
            genStockData.stockGenerator();
            obs.update(new StockData(genStockData));//sends a copy of the data
        }

    }

    public void run() {
        while (true) {
            notifyObservers();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

        }
    }

}
