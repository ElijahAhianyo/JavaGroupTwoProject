public  class Trader {

    private String name;
    private Account MellaAccount;

    public Trader(<String>name, <Account>MellaAccount) {
        this.name = name;
        this.MellaAccount = MellaAccount;
    }

    public void addTrade(<Trade> new_trade){
        Double newTradeVal = new_trade.getTradeValue();
        MellaAccount.setTotalTrade(MellaAccount.getTotalTrade() + newTradeVal);
    }
}