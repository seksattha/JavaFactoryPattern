public class Latte extends Coffee {
    public static  int coffeeGround = 30;
    public static int milk = 20;
    @Override
    public void getDescription() {
        System.out.println("Espresso " + "Coffee =>" + coffeeGround +  "Milk =>" + milk);

    }
}
