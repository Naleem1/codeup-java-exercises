package animals;

public class DoggiePark {

    public static void main(String[] args) {
        Dog dog = new Dog("Grinch", Quote.randomQuote());
        System.out.println(dog.makeNoise());
    }
}
