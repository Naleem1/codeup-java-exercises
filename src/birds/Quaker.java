package birds;

public class Quaker extends Bird {
    public void makeNoise(){
        System.out.println(this.getName() + " goes ack-squeek");
    }

    public Quaker(){
        super("Quaker");
        System.out.println("New quaker created!");
    }
}
