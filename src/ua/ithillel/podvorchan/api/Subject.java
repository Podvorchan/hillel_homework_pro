package ua.ithillel.podvorchan.api;

public interface Subject {

  public void addSubscriber(Observer observer);

  public void removeSubscriber(Observer observer);

  public void notifySubscribers(String message);


}
