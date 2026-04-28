public class Dog extends Pet implements Run{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Гав");
    }

    @Override
    public void petRun() {
        System.out.println("Dog run!");
    }
}
