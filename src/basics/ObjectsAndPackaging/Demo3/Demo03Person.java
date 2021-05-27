package basics.ObjectsAndPackaging.Demo3;

/**
 * @author wlm
 */
public class Demo03Person { 
    public static void main(String[] args) {
        Person person = new Person();
        person.show();
        person.name = "wln";
        person.setAge(10);
        person.show();
    }
}
