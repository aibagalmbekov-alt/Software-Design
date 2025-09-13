

public class LaptopDirector {
    public void constructPremiumLaptop(LaptopBuilder builder) {
        builder.setBrand();
        builder.setModel();
        builder.setCpu();
        builder.setRam();
        builder.setStorage();
    }

    public void constructBudgetLaptop(LaptopBuilder builder) {
        builder.setBrand();
        builder.setModel();
        builder.setCpu();
        ((ConcreteLaptopBuilder) builder).getLaptop().setRam(8);
        ((ConcreteLaptopBuilder) builder).getLaptop().setStorage(256);
    }
}
