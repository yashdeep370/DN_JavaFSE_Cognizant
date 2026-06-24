public class ObserverTest {

    public static void main(String[] args) {

        StockMarket stockMarket =
                new StockMarket();

        Observer mobile =
                new MobileApp("Yash");

        Observer web =
                new WebApp("Admin");

        stockMarket.registerObserver(
                mobile);

        stockMarket.registerObserver(
                web);

        stockMarket.setStockPrice(
                "TCS", 4200);

        System.out.println();

        stockMarket.setStockPrice(
                "Infosys", 1800);
    }
}