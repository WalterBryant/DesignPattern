package com.becky.designpattern.observer.weather;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
