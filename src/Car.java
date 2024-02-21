public class Car {
    private String plate;

    private String brand;

    private String model;

    private int engineSize;

    public Car(String plate, String brand, String model, int engineSize) {
        this.plate = plate;
        this.brand = brand;
        this.model = model;
        this.engineSize = engineSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlate() {
        if (this.plate.length() == 7) {
            return plate;
        }
        return "Errore: la targa deve corrispondere a 7 caratteri.";
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }
}
