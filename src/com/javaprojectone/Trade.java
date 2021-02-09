public abstract class Trade {

    private String tradeID;
    private String symbol;
    private Integer quantity;
    private Double price;

    public Trade(<String> tradeID, <String> symbol, <Integer> quantity, <Double> price){
        this.tradeID = tradeID;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;

    }

    public Trade(<String> tradeID, <String> symbol, <Integer> quantity){
        this.tradeID = tradeID;
        this.symbol = symbol;
        this.quantity = quantity;

    }

    public java.lang.String toString() {
        return "Trade{" +
                "tradeID='" + tradeID + '\'' +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(<Double> new_price){
        if(new_price >= 0){
            this.price = new_price
        }
    }


    public Double getTradeValue() {
        return this.quantity * this.price;
    }

    public abstract Double calcDividend();

}