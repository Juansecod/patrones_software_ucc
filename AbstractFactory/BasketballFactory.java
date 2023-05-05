public class BasketballFactory implements BallFactory {
    public Ball createBall() {
        return new Basketball();
    }
}