package seminar1;

public class ZooKeeper {
    private String name;

    public ZooKeeper(String name) {
        this.name = name;
    }

    public void feedAnimal(Animal a)
    {
        a.eat(name);
    }
}
