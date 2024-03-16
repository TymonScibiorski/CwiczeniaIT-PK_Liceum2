public class AverageScoreDisplay implements Observer{
    private int predictedScore;
    private float runRate;

    public void update() {
        System.out.println("The score has changed");
    }

    public void display() {
        System.out.println("The current average score is... ");
    }
}
