public class NewsAP extends Subject {
    NewsData NewsData;

    public void notifyObservers() {
        for (Observer obs : observers()) {
            NewsData nData = new NewsData();
            nData.headlineGenerator();
            obs.update(nData);
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
