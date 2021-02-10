
public class Bronze extends MembershipType{


    protected  Bronze(int tradeList){
        super(tradeList);
    }

    public void addMember(Client newClient){
        if (newClient.getTradePoints() > 0 && newClient.getTradePoints() < 10) {
            newClient.setMembershiptype(silver);
        }
    }

    public removeMember(Client theClient){
        if(theClient.getTradePoints() > 9){
            theClient.setMembershiptype(sliver)
        }
    }

}