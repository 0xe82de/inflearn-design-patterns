package me.whiteship.designpatterns._02_structural_patterns._08_composite._02_after;

public class Client {

    public static void main(String[] args) {
        Component doranBlade = new Item("도란검", 450);
        Component healPotion = new Item("도란검", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        Client client = new Client();
        client.printPrice(doranBlade);
        client.printPrice(bag);
    }

    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }
}
