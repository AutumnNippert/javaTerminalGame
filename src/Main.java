import assets.*;
import levels.*;
import org.json.simple.ItemList;

public class Main {

    static Player player = new Player();
    static LevelSelect levelSelect = new LevelSelect();
    static void initGame()
    {
        player.spawnPlayer();
        player.clearInventory(player);
        player.addToInventory(Item.getItemById(0));
        player.addToInventory(Item.getItemById(12));
        levelSelect.initLevelSelect(player);
    }

    public static void main(String[] args) {
        initGame();
    }
}