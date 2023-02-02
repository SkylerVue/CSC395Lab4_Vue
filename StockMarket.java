public class StockMarket extends Subject {

    @Override
    public void notifyObservers() {
        // TODO Auto-generated method stub
        
    }

    public void run(){
        while(true){
            notifyObservers();
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
            }
            
        }
    }
    
}
