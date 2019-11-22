package assets;

class Item {
    private static int id;
    private static String name;
    private static int armor;
    private static int attack;
    private static int health;
    Item(int ID, String Name, int lvl, int Health, int Armor, int Attack){
        id = ID;
        name = Name;
        health = Health;
        armor = Armor;
        attack = Attack;
    }
    public Item getItemById(int id){
        return ItemList.items[id];
    }
}
class ItemList{
    static Item[] items = {
            //Declaring Shields
            new Item(0, "Beginner Shield",1, 0, 1, 0),
            new Item(1, "Beginner Shield",2, 0, 3, 0),
            new Item(2, "Beginner Shield",3, 0, 5, 0),
            new Item(3, "Wooden Shield",1, 0, 8, 0),
            new Item(4, "Wooden Shield",2, 0, 12, 0),
            new Item(5, "Wooden Shield",3, 0, 16, 0),
            new Item(6, "Iron Shield",1, 0, 20, 0),
            new Item(7, "Iron Shield",2, 0, 25, 0),
            new Item(8, "Iron Shield",3, 0, 30, 0),
            new Item(9, "Ancient Shield",1, 0, 40, 0),
            new Item(10, "Ancient Shield",2, 0, 50, 0),
            new Item(11, "Ancient Shield",3, 0, 60, 0),

            //Declaring Swords
            new Item(12, "Beginner Sword",1, 0, 0, 2),
            new Item(13, "Beginner Sword",2, 0, 0, 0),
            new Item(14, "Beginner Sword",3, 0, 0, 0),
            new Item(15, "Wooden Sword",1, 0, 0, 0),
            new Item(16, "Wooden Sword",2, 0, 0, 0),
            new Item(17, "Wooden Sword",3, 0, 0, 0),
            new Item(18, "Iron Sword",1, 0, 0, 0),
            new Item(19, "Iron Sword",2, 0, 0, 0),
            new Item(20, "Iron Sword",3, 0, 0, 0),
            new Item(21, "Ancient Sword",1, 0, 0, 0),
            new Item(22, "Ancient Sword",2, 0, 0, 0),
            new Item(23, "Ancient Sword",3, 0, 0, 0)

            //Declaring items
    };
}