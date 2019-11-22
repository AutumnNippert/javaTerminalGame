package assets;

public class Player {
    static MyUtil util = new MyUtil();
    public int lvl = 1;
    public int health = 10;
    public int armor = 0;
    public int atk = 0;
    public int xp = 0;
    public String inventory[] = new String[10];

    public Player() {
        setHealth();
        //setArmor();
    }

    public void clearInventory() {
        inventory[0] = "empty";
        inventory[1] = "empty";
        inventory[2] = "empty";
        inventory[3] = "empty";
        inventory[4] = "empty";
        inventory[5] = "empty";
        inventory[6] = "empty";
        inventory[7] = "empty";
        inventory[8] = "empty";
        inventory[9] = "empty";
    }

    public String addToInventory(String item) {
        for (int i = 0; i <= 9; i++) {
            if (inventory[i].equals("empty")) {
                inventory[i] = item;
                return item + " successfully added to inventory";
            }
        }
        return "your inventory is full";
    }

    public String removeFromInventory(String item) {
        for (int i = 0; i <= 9; i++) {
            if (inventory[i] == item) {
                inventory[i] = "empty";
                return item + " successfully removed from inventory";
            }
        }
        return "you do not have this item";
    }

    public String getInventory(int index) {
        return inventory[index];
    }

    public int getHealth() {
        return health;
    }

    public void setHealth() {
        health = 10;
    }

//    public void setAttackDmg() {
//        String item;
//        for (int i = 0; i <= 9; i++) {
//            item = inventory[i];
//            String commandString = util.getNextLine();
//            String[] Item = commandString.split(" ", 4);
//            if (Item[1].equals("sword")
//            ) {
//                String level = Item[3];
//                String sword = Item[0];
//                if (item.equals("master sword")) {
//                    atk = 100 * lvl;
//                    break;
//                }
////                String sword = m.Groups[1].ToString();
////                Regex firstWord = new Regex(@"((?<= lvl ).*$)", RegexOptions.IgnoreCase | RegexOptions.Singleline);
////                Match match = firstWord.Match(item);
////                String level = match.Groups[1].ToString();
//                //Console.WriteLine(level);
//
//                if (sword.equals("beginner")) {
//                    if (level.equals("1")) {
//                        atk = (int) (2 * Math.pow(lvl, 5));
//                    }
//                    if (level.equals("2")) {
//                        atk = (int) (3 * Math.pow(lvl, 5));
//                    }
//                    if (level.equals("3")) {
//                        atk = (int) (5 * Math.pow(lvl, 5));
//                    }
//                } else if (sword.equals("wooden")) {
//                    if (level.equals("1")) {
//                        atk = 8 * lvl;
//                    }
//                    if (level.equals("2")) {
//                        atk = 12 * lvl;
//                    }
//                    if (level.equals("3")) {
//                        atk = 16 * lvl;
//                    }
//                } else if (sword.equals("iron")) {
//                    if (level.equals("1")) {
//                        atk = 20 * lvl;
//                    }
//                    if (level.equals("2")) {
//                        atk = 25 * lvl;
//                    }
//                    if (level.equals("3")) {
//                        atk = 30 * lvl;
//                    }
//                } else if (sword.equals("ancient")) {
//                    if (level.equals("1")) {
//                        atk = 40 * lvl;
//                    }
//                    if (level.equals("2")) {
//                        atk = 50 * lvl;
//                    }
//                    if (level.equals("3")) {
//                        atk = 60 * lvl;
//                    }
//                } else {
//                }
//            }
//        }
//    }
//
//    public void setArmor() {
//        String item;
//        for (int i = 0; i <= 9; i++) {
//            item = inventory[i];
//            String[] Item = item.split(" ", 4);
//            if (Item.length > 1) {
//                if (Item[1].equals("shield")) {
//                    String shield = Item[0];
//                    String level = Item[3];
//
//                    if (shield.equals("beginner")) {
//                        if (level.equals("1")) {
//                            armor = 1;
//                        }
//                        if (level.equals("2")) {
//                            armor = 3;
//                        }
//                        if (level.equals("3")) {
//                            armor = 5;
//                        }
//                    } else if (shield.equals("wooden")) {
//                        if (level.equals("1")) {
//                            armor = 8;
//                        }
//                        if (level.equals("2")) {
//                            armor = 12;
//                        }
//                        if (level.equals("3")) {
//                            armor = 16;
//                        }
//                    } else if (shield.equals("iron")) {
//                        if (level.equals("1")) {
//                            armor = 20;
//                        }
//                        if (level.equals("2")) {
//                            armor = 25;
//                        }
//                        if (level.equals("3")) {
//                            armor = 30;
//                        }
//                    } else if (shield.equals("ancient")) {
//                        if (level.equals("1")) {
//                            armor = 40;
//                        }
//                        if (level.equals("2")) {
//                            armor = 50;
//                        }
//                        if (level.equals("3")) {
//                            armor = 60;
//                        }
//                    }
//                }
//            }
//        }
//    }

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

    //setLvl sets thelevel of the player based on the xp they have aquired
    public void setLvl() {
        lvl = (int) (Math.pow(xp, (1 / 6)));
    }

    public void addXp(int Xp) {
        xp = xp + Xp;
    }
}
