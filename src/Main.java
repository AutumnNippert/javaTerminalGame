import assets.*;
import levels.*;

public class Main {

    static Player player = new Player();
    static LevelSelect levelSelect = new LevelSelect();
    static void initGame()
    {
        player.clearInventory();
        levelSelect.initLevelSelect(player);
        player.addToInventory("baguette");
        player.addToInventory("wooden sword level 1");
        player.addToInventory("wooden shield level 1");
    }

    public static void main(String[] args) {
        initGame();
    }
}