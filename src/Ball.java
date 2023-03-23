import java.util.ArrayList;

public class Ball {
    private ArrayList<ObservadorI> observers;

    public Ball() {
        observers= new ArrayList<>();
    }

    public void attachObserver(ObservadorI obj)
    {
        observers.add(obj);
    }

    public void detachObserver(ObservadorI obj)
    {
        observers.remove(obj);
    }

    public void notifyObservers()
    {
        for (ObservadorI obs: observers)
        {
            obs.update();
        }
    }
}
