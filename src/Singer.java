public class Singer extends Person {
    private String bandName;
    private String singing;
    private  boolean playGitar;

    public Singer(String a, String b, String c, String d, String e ,String f,String g,boolean h) {
        super(a, b, c, d,e);
        this.bandName = f;
        this.singing=g;
        this.playGitar=h;
    }

    @Override
    public String toString() {
        return super.toString()+"Singer{" +
                "bandName='" + bandName + '\'' +
                ", singing='" + singing + '\'' +
                ", playGitar=" + playGitar +
                "}" ;
    }
}
