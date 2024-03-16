public class Main {
    public static void main(String[] args) {

        CricketData c = new CricketData();

        CurrentScore score = new CurrentScore();
        AverageScoreDisplay averageScore = new AverageScoreDisplay();

        c.registerObserver(score);
        c.registerObserver(averageScore);

        score.update();
        score.display();

        averageScore.update();
        averageScore.display();
    }
}