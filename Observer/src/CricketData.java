import java.util.ArrayList;

public class CricketData implements Subject{
    private int runs;
    private int wickets;
    private float overs;
    private ArrayList<Observer> listaObservatorow = new ArrayList<>();


    //I attempted to make the following voids private (as shown on the diagram), but the IDE wouldn't let me

    @Override
    public void registerObserver(Observer observer) {
        listaObservatorow.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        listaObservatorow.remove(observer);
    }

    @Override
    public void notifyObserver(Observer observer) {
        for(Observer obs : listaObservatorow){
            obs.update();
        }
    }

    private static int getLastRuns() {
        return 0;
    }

    private static int getLatestWickets() {
        return 0;
    }

    private static int getLatestOvers() {
        return 0;
    }

}
