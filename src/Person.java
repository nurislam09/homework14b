public class Person {
    private String name;
    private String designation;
    private String learn;
    private String walk;
    private String eat;

    public Person(String a,String b,String c, String d,String e) {
        this.name=a;
        this.designation = b;
        this.learn=c;
        this.walk=d;
        this.eat=e;

    }

    @Override
    public String toString() {

        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", learn='" + learn + '\'' +
                ", walk='" + walk + '\'' +
                ", eat='" + eat + '\'' +
                '}';
    }
}
