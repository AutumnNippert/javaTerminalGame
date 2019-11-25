package assets;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.util.Iterator;
import org.json.simple.*;
import org.json.simple.parser.*;

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
        String out = "";
        if(in.hasNext() || in.next().contains("\n")){
            out = in.next().toLowerCase();
        }
        return out;
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public void saveGame(Player player)
    {
        JSONObject save = new JSONObject();

        save.put("lvl",player.lvl);
        save.put("health",player.health);
        save.put("armor",player.armor);
        save.put("atk",player.atk);
        save.put("xp",player.xp);
        save.put("inventory", player.inventory);

        StringWriter out = new StringWriter();
        try {
            save.writeJSONString(out);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String jsonText = out.toString();
        try (FileWriter file = new FileWriter("save.json")) {
            file.write(jsonText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void load(Player player)
    {
        JSONParser parser = new JSONParser();

        try (Reader reader = new FileReader("save.json")) {

            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            System.out.println(jsonObject);

            int lvl = (int) jsonObject.get("lvl");
            int health = (int) jsonObject.get("health");
            int armor = (int) jsonObject.get("armor");
            int atk = (int) jsonObject.get("atk");
            int xp = (int) jsonObject.get("xp");
            Item[] inventory = (Item[]) jsonObject.get("inventory");

            // loop array
            JSONArray msg = (JSONArray) jsonObject.get("messages");
            Iterator<String> iterator = msg.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

            player.lvl = lvl;
            player.health = health;
            player.armor = armor;
            player.atk = atk;
            player.xp = xp;
            for(int x = 0; x < player.inventory.length; x++){

                player.inventory[x] = inventory[x];
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
