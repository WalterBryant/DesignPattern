package com.becky.designpattern.observer.weather;

public interface Subject {
    public void registerOberver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
