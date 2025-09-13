

public class Laptop {
    private String brand;
    private String model;
    private String cpu;
    private int ram;
    private int storage;

    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setCpu(String cpu) { this.cpu = cpu; }
    public void setRam(int ram) { this.ram = ram; }
    public void setStorage(int storage) { this.storage = storage; }

    @Override
    public String toString() {
        return brand + " " + model +
                " | CPU=" + cpu +
                ", RAM=" + ram + "GB" +
                ", SSD=" + storage + "GB";
    }
}
