package seminar1;

public class Lion extends Animal{
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String numeIngrijitor) {
        System.out.println("Leul "+super.getName()+" in vasta de "+super.getAge()+" ani, a fost hranit de "+numeIngrijitor); //super.get ca sa fie explicit
    }
}
