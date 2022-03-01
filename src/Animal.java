public class Animal {
    private int body;
    private int legs;

    public Animal(int body, int legs) {
        this.body = body;
        this.legs = legs;
    }

    public int getBody() {
        return body;
    }

    public int getLegs() {
        return legs;
    }

    public void eat() {
        System.out.println("Animal.eat called. I am eating");
    }
}
