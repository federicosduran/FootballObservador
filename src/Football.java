public class Football extends Ball{
    private Position myPosition;


    public Football(Position myPosition) {
        this.myPosition = myPosition;
    }

    public Football() {

    }

    public Position getBallPosition()
    {
        return myPosition;
    }

    public void setBallPosition(Position p) {
        myPosition = p;
        notifyObservers();  // Se notifican a los observadores
    }
}
