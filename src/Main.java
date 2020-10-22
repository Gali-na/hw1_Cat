public class Main {
    public static void main(String[] args) {
        Cat myrzic= new Cat();
        Cat ymka= new Cat("Ymka",8, "black",9);
        myrzic.setAge(2);
        myrzic.setColor("white");
        myrzic.setName("Myrzic");
        myrzic.setWeight(6);
        myrzic.talk();
        myrzic.prig_prig();
        System.out.println(myrzic.toString());
        System.out.println(ymka.toString());
        ymka.prig_prig();
        ymka.talk();
    }
}
