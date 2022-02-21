public class Hello {
    public static void main(String[] args) {
        Car ferrari = new Car();
        Car porsche = new Car();
        ferrari.setModel("Ivory");
        porsche.setModel("Apricot");
        System.out.println("Your car model is this: " + ferrari.getModel());
        System.out.println("Your car model is this: " + porsche.getModel());
    }

}


