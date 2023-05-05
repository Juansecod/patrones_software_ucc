public class SoccerBallFactory implements BallFactory {
    public Ball createBall() {
        return new SoccerBall();
    }
}           