public class Cat extends Pet implements Run{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Мяю");
    }

    @Override
    public void petRun() {
        System.out.println("Cat run!");
    }
}
