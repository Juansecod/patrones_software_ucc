public class Client {
    private BallFactory factory;

    public Client(BallFactory factory) {
        this.factory = factory;
    }

    public void playWithBall() {
        Ball ball = factory.createBall();
        ball.play();
    }
}
