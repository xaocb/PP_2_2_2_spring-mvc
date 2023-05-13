package web.models;

public class Car {
    private String model;
    private Double engine;
    private Double price;

    public Car(String model, Double engine, Double price) {
        this.model = model;
        this.engine = engine;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getEngine() {
        return engine;
    }

    public void setEngine(Double engine) {
        this.engine = engine;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
