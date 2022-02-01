public class Pro1_64010516 {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        System.out.println("Symbol: " + stock.symbol);
        System.out.println("Name: " + stock.name);
        stock.previousClosingPrice = 34.5d;
        stock.currentPrice = 34.35d;
        System.out.println("Previous Closing Price: " + 34.5);
        System.out.println("Current Price: " + 34.35);
        System.out.println("Price Change: " + stock.getChangePercent() + "%");
    }
}