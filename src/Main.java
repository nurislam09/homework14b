public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
       /** БУЛ ТАПШЫРМАДА PERSON ДЕГЕН КЛАСС ТУЗОСУЗДОР.
        ПОЛЕЛЕРИН ЖАНА МЕТОДТОРУН СУРОТТО КОРСОТУЛГОНДОЙ
        КЫЛЫП  ТУЗОСУЗДОР.
        АЛ КЛАССТЫ 3 БАШКА КЛАСС МУРАСТАШЫ  КЕРЕК.
        АЛ 3 КЛАССТЫН ОЗДОРУНУН УНИКАЛДУУ ПОЛЕЛЕРИ ЖАНА
        МЕТОДТОРУ БАР СУРОТТОГУДОЙ.
                КОНСТРУКТОР ТУЗОСУЗДОР ЖАНА ОЗДОРУНУН УНИКАЛДУУ МЕТОДТОРУН ДА ТУЗОСУЗДОР.
                МЕЙН МЕТОДКО 3 КЛАССТЫН ОБЪЕКТИЛЕРИН ТУЗОСУЗДОР, ПОЛЕЛЕРИНЕ КОНСТРУКТОР МЕНЕН МААНИ БЕРИП,
        КОНСОЛГО TOSTRING() МЕТОДУН КОЛДОНУП МААЛЫМАТТАРЫН  ЧЫГАРЫНЫЗДАР.
        */

       Person person = new Person("Nurislam","nothing","nothing","nothing","nothing");
       Denser denser = new Denser("Bakai","Denser","Dence","Gym","Plov","Hiphop","Java7");
       Singer singer = new Singer("Argen","Singer","Sing","label","Samsa","Java7","POP",true);
       Programer programer=new Programer("Samarbek","Programer","Programing","Picsoft house","Java",
               "Samarbek comparation ");
        System.out.println(person);
        System.out.println(denser);
        System.out.println(singer);
        System.out.println(programer);
    }
}