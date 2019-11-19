import assets.*;
import levels.*;

public class Main {

    static Player player = new Player();
    static LevelSelect levelSelect = new LevelSelect();
    static void initGame()
    {
        player.clearInventory();
        player.spawnPlayer();
        levelSelect.initLevelSelect(player);
        player.addToInventory("Baguette");
    }

    public static void main(String[] args) {
        initGame();
    }
}