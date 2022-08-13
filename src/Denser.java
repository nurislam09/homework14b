public class Denser extends Person{
    private String groupName;
    private String dancing;



    public Denser(String a, String b, String c, String d,String e, String f, String g) {
        super(a, b, c, d,e);
        this.dancing = f;
        this.groupName=g;

    }

    @Override
    public String toString() {

        return super.toString()+ "Denser{" +
                "groupName='" + groupName + '\'' +
                ", dancing='" + dancing + '\'' +
                "} " ;
    }
}