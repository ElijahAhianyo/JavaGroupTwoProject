
public class Client{

    private String firstName;
    private String lastName;
    private Integer tradePoints;
    private Membership membershipType;

    Client(String firstName, String lastName, <MembershipType> membershipType){
        this.firstName = firstName;
        this.lastName = lastName;
        this.tradePoints = tradePoints;
        this.membershipType = membershipType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getTradePoints() {
        return tradePoints;
    }

    public void setTradePoints(Integer points) {
        this.tradePoints = points;
    }

    public Membership getMembershiptype() {
        return membershipType;
    }

    public void setMembershiptype(Membership memtype) {
        this.membershipType = memtype;
    }




}