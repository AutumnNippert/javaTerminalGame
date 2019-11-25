package assets;

public class Item {
    public static int id;
    public static String name;
    public static int armor;
    public static int attack;
    public static int health;
    Item(int ID, String Name, int lvl, int Health, int Armor, int Attack){
        id = ID;
        name = Name;
        health = Health;
        armor = Armor;
        attack = Attack;
    }
    public static Item getItemById(int id){
        return ItemList.items[id];
    }
}
class ItemList{
    static Item[] items = {

            //Declaring Empty Item
            new Item(0, "Empty", 0, 0,0, 0),

            //Declaring Shields
            new Item(1, "Beginner Shield",1, 0, 1, 0),
            new Item(2, "Beginner Shield",2, 0, 3, 0),
            new Item(3, "Beginner Shield",3, 0, 5, 0),
            new Item(4, "Wooden Shield",1, 0, 8, 0),
            new Item(5, "Wooden Shield",2, 0, 12, 0),
            new Item(6, "Wooden Shield",3, 0, 16, 0),
            new Item(7, "Iron Shield",1, 0, 20, 0),
            new Item(8, "Iron Shield",2, 0, 25, 0),
            new Item(9, "Iron Shield",3, 0, 30, 0),
            new Item(10, "Ancient Shield",1, 0, 40, 0),
            new Item(11, "Ancient Shield",2, 0, 50, 0),
            new Item(12, "Ancient Shield",3, 0, 60, 0),

            //Declaring Swords
            new Item(13, "Beginner Sword",1, 0, 0, 2),
            new Item(14, "Beginner Sword",2, 0, 0, 0),
            new Item(15, "Beginner Sword",3, 0, 0, 0),
            new Item(16, "Wooden Sword",1, 0, 0, 0),
            new Item(17, "Wooden Sword",2, 0, 0, 0),
            new Item(18, "Wooden Sword",3, 0, 0, 0),
            new Item(19, "Iron Sword",1, 0, 0, 0),
            new Item(20, "Iron Sword",2, 0, 0, 0),
            new Item(21, "Iron Sword",3, 0, 0, 0),
            new Item(22, "Ancient Sword",1, 0, 0, 0),
            new Item(23, "Ancient Sword",2, 0, 0, 0),
            new Item(24, "Ancient Sword",3, 0, 0, 0)
    };
}