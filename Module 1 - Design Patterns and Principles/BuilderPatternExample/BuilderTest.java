public class BuilderTest {

    public static void main(String[] args) {

        Computer gamingPC = new Computer.Builder()
                .setCpu("Intel i9")
                .setRam("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("RTX 4080")
                .setOperatingSystem("Windows 11")
                .build();

        gamingPC.display();
    }
}