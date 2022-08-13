public class Programer extends Person{
    private String companyName;
    private String coding;

    public Programer(String a, String b, String c, String d, String e,String f) {
        super(a, b, c, d,e);
        this.coding = e;
        this.companyName=f;
    }

    @Override
    public String toString() {
        return  super.toString()+"Programer{" +
                "companyName='" + companyName + '\'' +
                ", coding='" + coding + '\'' +
                "}";
    }
}
