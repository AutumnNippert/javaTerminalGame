package levels;

import assets.*;


public class LevelCreator {
    static MyUtil util = new MyUtil();
    static Fight fight = new Fight();
    public void initLevel(int numberOfEnemies, Player player)
    {
        int playerLevel = player.lvl;

        for (int x = 0; x <= numberOfEnemies; x++)
        {
            String monsterName = util.randName();
            Enemy enemy = new Enemy();
            enemy.spawnEnemy(player.lvl * util.RandomNumber(2, 3),
                    player.lvl * util.RandomNumber(2, 5),
                    player.lvl * util.RandomNumber(2, 4),
                    //Convert.ToInt32(Math.Pow(5, playerLevel)),
                    //Convert.ToInt32(Math.Pow(2, playerLevel)),
                    //Convert.ToInt32(Math.Pow(5, playerLevel)),
                    playerLevel,
                    monsterName);
            fight.initFight(player, enemy);





            //dummy.spwanEnemy(5, 5, 0, 0);
            //fight.initFight(player, dummy);
            //Console.WriteLine("\ndummy health is " + dummy.health);
            //Console.WriteLine("dummy armor is " + dummy.armor + "\n");
            //Console.WriteLine("player health is " + player.health);
            //Console.WriteLine("player armor is " + player.armor + "\n");
            //Console.Write(">>> ok");
            //Console.ReadLine();
        }
    }
}
