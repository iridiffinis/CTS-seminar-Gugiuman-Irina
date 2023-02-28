package seminar1;

public class Main {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper("Ana");
        Zoo zoo = new Zoo("Zoo",zooKeeper);

        zoo.adaugaAnimal(new Lion("Miau",3));
        zoo.adaugaAnimal(new Zebra("Vergy",5));

        zoo.feedAllAnimals();

        zoo.adaugaAnimal(new Lion("Simba",4));
        zoo.feedAllAnimals();

        zoo.adaugaAnimal(new Papagal("Paco",2));
        zoo.feedAllAnimals();
    }
}