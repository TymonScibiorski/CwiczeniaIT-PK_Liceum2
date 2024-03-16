public class CurrentScore implements Observer {

    private int runs;
    private int wickets;
    private float overs;

    @Override
    public void update() {
        System.out.println("The score has changed");
    }

    public void display() {
        System.out.println("The current score is... ");
    }
}
