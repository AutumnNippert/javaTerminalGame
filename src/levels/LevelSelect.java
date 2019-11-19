package levels;

import assets.*;


public class LevelSelect {
    MyUtil util = new MyUtil();
    public void initLevelSelect(Player player)
    {
        boolean lvlSelect = true;
        while (lvlSelect == true)
        {
            player.setLvl();
            System.out.print("\n>>> ");
            String command = util.getNextLine();
            System.out.println(command);
            String[] words = command.split(" " ,4);
            if (words.length < 2)
            {
                if (command == "start")
                {
                    util.clearScreen();
                    Tutorial tutorial = new Tutorial();
                    tutorial.InitTutorial(player);
                }
                if (command == "xp")
                {
                    System.out.println(player.xp + "\n");
                }
                if (command == "RandomLevel")
                {
                    LevelCreator level = new LevelCreator();
                    level.initLevel(3, player);
                }
//                if (command == "save")
//                {
//                    util.saveGame(player);
//                }
//                if (command == "load")
//                {
//                    util.load(player);
//                }
            }
            else if (words.length >= 2)
            {
                if (words[0] == "drop")
                {
                    String itemCheck = "";
                    for (int i = 0; i <= 9; i++)
                    {
                        itemCheck = player.getInventory(i);
                        if (itemCheck == words[1])
                        {
                            System.out.print("Are you sure you want to drop " + words[1] + "?\n>>> ");
                            String dropTrue = util.getNextLine();
                            if (dropTrue == "yes" || dropTrue == "y")
                            {
                                player.removeFromInventory(words[1]);
                                break;
                            }
                            else
                            {
                                break;
                            }
                        }
                    }
                    if (itemCheck != words[1])
                    {
                        System.out.println("You do not have that item");
                    }
                }
                if (words[0] == "eat")
                {
                    String itemCheck = "";
                    for (int i = 0; i <= 9; i++)
                    {
                        itemCheck = player.getInventory(i);
                        if (itemCheck == words[1])
                        {
                            player.removeFromInventory(words[1]);
                            break;
                        }
                    }
                    if (itemCheck != words[1])
                    {
                        System.out.println("You do not have that item");
                    }
                }
                if (words[0] == "view")
                {
                    if (words[1] == "inventory")
                    {
                        System.out.println("\n");
                        for (int i = 0; i <= 9; i++)
                        {
                            System.out.println("[" + i + "] " + player.getInventory(i) + "\n");
                        }
                    }
                }
            }
            else
            {
                System.out.println("Unknown command");
            }
        }
    }
}
