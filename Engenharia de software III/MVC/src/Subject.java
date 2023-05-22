public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();

    void setMeasurements(String temperature, String humidity, String pressure);
}