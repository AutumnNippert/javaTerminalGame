package assets;

public class Fight {
    MyUtil util = new MyUtil();
    public void initFight(Player player, Enemy enemy)
    {
        util.clearScreen();
        System.out.println("assets.Fight\n");
        player.setArmor();
        player.setAttackDamage();
        while (player.health > 0 && enemy.health > 0)
        {
            displayBattleStats(player, enemy.name, enemy);
            player.attack(enemy);
            enemy.attack(player);
            System.out.println("Press enter to continue...\n");
            util.getNextLine();
        }
        displayBattleStats(player, enemy.name, enemy);
        player.attack(enemy);
        enemy.attack(player);
        System.out.println("Press enter to continue...\n");
        util.getNextLine();
        player.addXp((int)(Math.pow(enemy.health, 1/6)));
    }

    public void displayBattleStats(Player player, String enemyName, Enemy enemy)
    {
        System.out.println("\n" + enemyName + "'s health now at " + enemy.health);
        System.out.println(enemyName + "'s armor now at " + enemy.armor + "\n");
        System.out.println("assets.Player health now at " + player.health);
        System.out.println("assets.Player armor now at " + player.armor + "\n");
    }
}
