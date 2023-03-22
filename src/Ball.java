import java.util.ArrayList;

public class Ball {
    private ArrayList<IObserver> observers;

    public Ball() {
        observers= new ArrayList<>();
    }

    public void attachObserver(IObserver obj)
    {
        observers.add(obj);
    }

    public void detachObserver(IObserver obj)
    {
        observers.remove(obj);
    }

    public void notifyObservers()
    {
        for (IObserver obs: observers)
        {
            obs.update();
        }
    }
}
