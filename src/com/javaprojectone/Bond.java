public class Bond extends Trade{

    private Double final dividend = 45;

    Bond(<String> tradeID, <String> symbol, <Integer> quantity, <Double> price) {
        super(<String> tradeID, <String> symbol, <Integer> quantity, <Double> price);
        this.dividend = dividend;

    }

    public double Double calcDividend(){
        return this.dividend;
    }


}