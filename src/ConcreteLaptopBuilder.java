
public class ConcreteLaptopBuilder implements LaptopBuilder {
    private Laptop laptop = new Laptop();

    @Override
    public void setBrand() { laptop.setBrand("AIBER"); }

    @Override
    public void setModel() { laptop.setModel("Feather 14"); }

    @Override
    public void setCpu() { laptop.setCpu("Intel Core i7"); }

    @Override
    public void setRam() { laptop.setRam(16); }

    @Override
    public void setStorage() { laptop.setStorage(512); }

    @Override
    public Laptop getLaptop() { return laptop; }
}
