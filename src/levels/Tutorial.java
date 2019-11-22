package levels;

import assets.*;


public class Tutorial {
    static MyUtil util = new MyUtil();
    static Fight fight = new Fight();

    public void InitTutorial(Player player)
    {
        String text = (
                "   Hey player, im your personal AI named Ai, so convenient right?\n" +
                        "Yeah, my programmer wasn't exactly very goo-- OH SHIT, THERE'S\n" +
                        "A DUMMY THAT JUST APPEARED RIGHT IN FRONT OF YOU oh shit\n" +
                        "it was just me haha XD. Don't worry, it's just a simulated entity\n" +
                        "so he can't hurt you.\n\n" +
                        "   This is a test so you can get grips with the fighting mechanics of \n" +
                        "this game. Give it a shot! Trust me, murdering is easier than you think!\n" +
                        "(also, usually, there will be some dialouge like now that you\n" +
                        "will respond to, so just press enter lol)\n");
        util.stringLetterByLetter(text);
        System.out.print(">>> oh ok");
        util.getNextLine();
        System.out.println("You have pissed off the dummy! He wanna fight!");
        Enemy dummy = new Enemy(5, 5, 0, 0, "dummy");
        //System.out.println("\ndummy health is " + dummy.health);
        //System.out.println("dummy armor is " + dummy.armor + "\n");
        //System.out.println("player health is " + player.health);
        //System.out.println("player armor is " + player.armor + "\n");
        System.out.print(">>> ok");
        fight.initFight(player, dummy);
        util.getNextLine();
        while (player.health > 0 && dummy.health > 0)
        {
            player.attack(dummy);
            dummy.attack(player);
            fight.displayBattleStats(player,"The Dummy",  dummy);
            System.out.println("Press enter to continue...\n");
            util.getNextLine();
        }
        util.clearScreen();
        System.out.println("Pretty easy right?");
        System.out.print(">>> Yeah!");
        util.getNextLine();
        System.out.print("Now i'll tell you about lo--");
        String lessDashes = "-------------";
        String dashes = (util.repeatForLoop("!2qS4es5eXDX6tcYGyv9hub)J)Bijnok)OjioimOKOplpkijOITCCbvxfdAREWQroiuIKJV,nbBVDSYTE2433YUTOIU69764$%@treryu(&6oiyYFgxNBvmnkhDTReytOIUGKJddSVCxcJKTO^oipyIUTu6345!@wqerEYUitoLKjnmCNSHRety", 50));
        try {
            for(char c : lessDashes.toCharArray())
            {
                System.out.print(c);
                Thread.sleep(util.RandomNumber(50, 500));
            }
            for(char c : dashes.toCharArray())
            {
                System.out.print(c);
                Thread.sleep(util.RandomNumber(0, 1));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        util.clearScreen();
        System.out.println("You have pissed off the wrong dummy! He gonna kill you!");
        System.out.print(">>> shit!");
        util.getNextLine();
        Enemy wrongDummy = new Enemy(99999999, 99999999, 1, 1, "wrong Dummy");
        System.out.println("dummy health now at " + wrongDummy.health);
        System.out.println("dummy armor now at " + wrongDummy.armor + "\n");
        System.out.println("player health now at 1");
        System.out.println("player armor now at -99999999");
        System.out.print("Press enter to-o-ooo-o----");
        util.getNextLine();
        util.clearScreen();
        String ting = (
                "--oting.\n" +
                        "The dummy you killed dropped you some loot you can\n" +
                        "use for the next levels Lets see what he dropped!\n"
        );
        util.stringLetterByLetter(ting);
        System.out.print(">>> What just happened?");
        util.getNextLine();
        String item = util.generateSmallLootItem();
        String dialogue = (
                "\nlooks like he dropped a " + item + "!\n" +
                        "Each time you complete a level, you have the chance\n" +
                        "to take the item, but only if your inventory has space.\n\n" +
                        "Now you're back at the level selection where you can view\n" +
                        "your inventory and other things.\n"
        );
        util.stringLetterByLetter(dialogue);
        player.addToInventory(item);
        System.out.print(">>> Welp, ok then");
        util.getNextLine();
    }
}