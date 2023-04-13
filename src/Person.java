public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello my name is " + name);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Najee");
        Person person2 = new Person("Haneef");
        System.out.println(person2.getName() + " Looks at " + person1.getName());
    }
}
