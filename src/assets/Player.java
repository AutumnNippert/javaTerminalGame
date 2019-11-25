package assets;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class Player {
    static MyUtil util = new MyUtil();
    public int lvl = 1;
    public int health = 10;
    public int armor = 0;
    public int atk = 0;
    public int xp = 0;
    public Item inventory[] = new Item[10];

    public void spawnPlayer() {
        setHealth();
        setArmor();
    }

    public void clearInventory(Player player) {
        for (int i = 0; i < player.inventory.length; i++) {
            player.inventory[i] = Item.getItemById(24);
        }
    }

    public String addToInventory(Item item) {
        for (int i = 0; i <= 9; i++) {
            if (inventory[i].name.equals("empty")) {
                inventory[i] = item;
                return item.name + " successfully added to inventory";
            }
        }
        return "your inventory is full";
    }

    public String removeFromInventory(Player player, Item item) {
        for (int i = 0; i <= 9; i++) {
            if (inventory[i] == item) {
                player.inventory[i] = Item.getItemById(0);
                return item.name + " successfully removed from inventory";
            }
        }
        return "you do not have this item";
    }

    public Item getInventory(int index) {
        return inventory[index];
    }

    public int getHealth() {
        return health;
    }

    public void setHealth() {
        health = 10;
    }

    public void setAttackDamage() {
        for (int i = 0; i <= 9; i++) {
            Item invItem = inventory[i];
            for(int a = 0; a < ItemList.items.length; a++){
                Item item = Item.getItemById(a);
                if(invItem == item){
                    atk = item.attack;
                }
            }
        }
    }
    public void setArmor() {
        for (int i = 0; i <= 9; i++) {
            Item invItem = inventory[i];
            for(int a = 0; a < ItemList.items.length; a++){
                Item item = Item.getItemById(a);
                if(invItem == item){
                    armor = item.armor;
                }
            }
        }
    }

    public int getArmor() {
        return armor;
    }

    public void attack(Enemy enemy) {
        int atkDmg = 0;

        do {
            atkDmg = util.RandomNumber(atk - (5 * lvl), atk + (5 * lvl));
        }
        while (atkDmg <= 0);
        if (atkDmg <= 0) {
            attack(enemy);
        }
        if (enemy.armor > 0) {
            enemy.armor = enemy.armor - atkDmg;
        } else if (enemy.health > 0) {
            enemy.health = enemy.health - atkDmg;
        }
        if (enemy.armor < 0) {
            enemy.armor = 0;
        }
        if (enemy.health < 0) {
            enemy.health = 0;
        }
    }

    //setLvl sets the level of the player based on the xp they have aquired
    public void setLvl() {
        lvl = (int) (Math.pow(xp, (1 / 6)));
    }

    public void addXp(int Xp) {
        xp = xp + Xp;
    }
}
