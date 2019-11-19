package assets;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MyUtil {
    public String generateSmallLootItem()
    {
        String items[] = new String[20];
        items[0] = "acorn";
        items[1] = "acorn";
        items[2] = "acorn";
        items[3] = "acorn";
        items[4] = "acorn";
        items[5] = "acorn";
        items[6] = "acorn";
        items[7] = "acorn";
        items[8] = "acorn";
        items[9] = "beginner sword lvl 2";
        items[10] = "beginner shield lvl 2";
        items[11] = "beginner shield lvl 2";
        items[12] = "beginner shield lvl 2";
        items[13] = "baguette";
        items[14] = "baguette";
        items[15] = "baguette";
        items[16] = "baguette";
        items[17] = "baguette";
        items[18] = "baguette";
        items[19] = "baguette";

        int number = RandomNumber(0, 19);
        String item = items[number];
        return item;

    }
    public int RandomNumber(int min, int max)
    {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
    public String repeatForLoop(String s, int n)
    {
        var result = s;

        for (var i = 0; i < n - 1; i++)
        {
            result += s;
        }

        return result;
    }
    public String randName()
    {
        String[] names = new String[] { "Jankster", "Borgoth", "Grayhound", "Grandorth", "Trogorth", "Nangrome", "Gormund", "Zormud", "Scrafe", "Progrint" };
        int num = RandomNumber(0, names.length);
        return names[num];
    }
    public void stringLetterByLetter(String string){
        try {
            for(char c : string.toCharArray())
            {
                System.out.print(c);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static String getNextLine(){
        Scanner in = new Scanner(System.in);
        try {
            String out = in.nextLine().toLowerCase();
            return out;
        } finally {
            in.close();
            System.out.println("closed");
        }
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
//    public void saveGame(Player player)
//    {
//        int lvl;
//        int health;
//        int armor;
//        int atk;
//        int xp;
//        String[] inventory;
//        try
//        {
//            Save save = new Save()
//            {
//                lvl = player.lvl,
//                health = player.health,
//                armor = player.armor,
//                atk = player.atk,
//                xp = player.xp,
//                inventory = player.inventory
//            };
//            String strResultJSON = JsonConvert.SerializeObject(save);
//            File.WriteAllText(@"save.json", strResultJSON);
//        }
//        catch
//        {
//
//        }
//    }
//    public void load(Player player)
//    {
//        StreamReader file = File.OpenText("save.json");
//        Save o1 = JsonConvert.DeserializeObject<Save>(file.ReadToEnd());
//        player.lvl = o1.lvl;
//        player.health = o1.health;
//        player.armor = o1.armor;
//        player.atk = o1.atk;
//        player.xp = o1.xp;
//        for(int x = 0; x < player.inventory.Length; x++){
//
//            player.inventory[x] = o1.inventory[x];
//        }
//    }
}
