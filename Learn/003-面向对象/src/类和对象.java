public class 类和对象 {

    public static void main(String[] args) {
        Item item1 = new Item();
        item1.name = "血瓶";
        item1.price = 50;

        Item item2 = new Item();
        item2.name = "草鞋";
        item2.price = 300;

        Item item3 = new Item();
        item3.name = "长剑";
        item3.price = 500;

        float hp = item1.getHp();
        System.out.printf("hp is " + hp);
    }

}
class Item {
    String name;
    int price;

    void lengendary() {
        System.out.printf("lengendary!");
    }
    float getHp() {
        return 100.0f;
    }
    float recovery(float blood) {
        return 100 + blood;
    }
}


