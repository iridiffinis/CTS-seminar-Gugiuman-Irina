package seminar1;

public class Zebra extends Animal{
    public Zebra(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String numeIngrijitor) {
        System.out.println("Zebra "+super.getName()+" in vasta de "+super.getAge()+" ani, a fost hranit de "+numeIngrijitor);
    }
}
