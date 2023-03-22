public class Player extends IObserver{
    private Position ballPosition;
    private Football ball;
    private String number;

    public Player(Football ball, String number) {
        this.ball = ball;
        this.number = number;

    }

    @Override
    public void update() {
        ballPosition= ball.getBallPosition();
        System.out.println("El jugador " + number + " ha visto la pelota en " + ballPosition.toString());
    }
}
