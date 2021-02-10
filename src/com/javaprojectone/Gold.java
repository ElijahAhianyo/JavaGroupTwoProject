public class Gold extends MembershipType{


    protected Gold(Integer points){

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