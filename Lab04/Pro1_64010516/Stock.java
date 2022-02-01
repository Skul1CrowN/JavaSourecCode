public class Stock {
    public String symbol;
    public String name;
    public double previousClosingPrice;
    public double currentPrice;
    public Stock(String s, String n) {
        this.symbol = s;
        this.name = n;
    }
    public double getChangePercent() {
        return (currentPrice - previousClosingPrice)/previousClosingPrice*100;
    }
}
