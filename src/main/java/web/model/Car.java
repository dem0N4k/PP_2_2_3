package web.model;

public class Car {
    private int id;
    private String model;
    private String series;
    private double weight;

    public Car() {
    }

    public Car(int id, String model, String series, double weight) {
        this.id = id;
        this.model = model;
        this.series = series;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car " + id + ": " + model + " " + series + " " + weight + " kg.";
    }
}
