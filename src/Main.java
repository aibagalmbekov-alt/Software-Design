

public class Main {
    public static void main(String[] args) {
        LaptopDirector director = new LaptopDirector();

        ConcreteLaptopBuilder builder1 = new ConcreteLaptopBuilder();
        director.constructPremiumLaptop(builder1);
        Laptop flagship = builder1.getLaptop();
        System.out.println("Флагманский : " + flagship);

        ConcreteLaptopBuilder builder2 = new ConcreteLaptopBuilder();
        director.constructBudgetLaptop(builder2);
        Laptop budget = builder2.getLaptop();
        System.out.println("Бюджетный   : " + budget);

        Laptop custom = new Laptop();
        custom.setBrand("AIBER");
        custom.setModel("DevPro 15");
        custom.setCpu("AMD Ryzen 7");
        custom.setRam(32);
        custom.setStorage(1024);
        System.out.println("Ручная сборка: " + custom);
    }
}
