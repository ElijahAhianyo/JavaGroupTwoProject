public class Funds extends Trade{

    private Double final percentage = 0.4;

    Funds(<String> tradeID, <String> symbol, <Integer> quantity, <Double> price) {
        super(<String> tradeID, <String> symbol, <Integer> quantity, <Double> price);
        this.dividend = dividend;

    }

    public double Double calcDividend(){
        return super.getPrice() * this.percentage;
    }


}