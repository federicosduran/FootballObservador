public class main {
    public static void main(String[] args) {
        Football ball = new Football();

        Player j1 = new Player(ball,"1");
        Player j2 = new Player(ball,"2");
        Player j3 = new Player(ball,"3");
        Player j4 = new Player(ball,"4");
        Player j5 = new Player(ball,"5");

        Referee a1 = new Referee(ball,"1");
        Referee a2 = new Referee(ball,"2");

        ball.attachObserver(j1);
        ball.attachObserver(j2);
        ball.attachObserver(j3);
        ball.attachObserver(j4);
        ball.attachObserver(j5);

        ball.attachObserver(a1);
        ball.attachObserver(a2);

        ball.setBallPosition(new Position(0,0,0));
        System.out.println();
        ball.setBallPosition(new Position(2,2,0));
        System.out.println();
        ball.setBallPosition(new Position(0,4,4));

    }
}
