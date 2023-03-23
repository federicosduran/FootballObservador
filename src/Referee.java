public class Referee implements ObservadorI {
    private Position ballPosition;
    private Football ball;
    private String number;

    public Referee(Football ball, String number) {
        this.ball = ball;
        this.number = number;

    }

    @Override
    public void update() {
        ballPosition= ball.getBallPosition();
        System.out.println("El arbitro " + number + " ha visto la pelota en " + ballPosition.toString());
    }
}
