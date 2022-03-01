public class Dog extends Animal{
    private String name;

    public Dog(int legs, String name) {
        super(1, legs);
        this.name = name;
    }

    @Override
    public void eat() {
        //super.eat();
        System.out.println("Dog.eat called " + this.name);
    }
}
