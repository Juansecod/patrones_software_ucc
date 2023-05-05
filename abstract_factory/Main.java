public class Main {
    public static void main(String[] args) {
        Client soccerPlayer = new Client(new SoccerBallFactory());
        soccerPlayer.playWithBall(); 

        Client basketballPlayer = new Client(new BasketballFactory());
        basketballPlayer.playWithBall(); 
    }
}
