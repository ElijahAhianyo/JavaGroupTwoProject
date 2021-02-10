public class Silver extends MembershipType{


    protected Silver(Integer tar){
        super();
    }

    public void addMember(Client newClient){
        if (newClient.getTradePoints() > 10 && newClient.getTradePoints() < 19) {
            newClient.setMembershiptype(silver);
        }
    }

    public removeMember(Client theClient){
        if(theClient.getTradePoints() <= 10){
            theClient.setMembershiptype(sliver)
        }
    }

}