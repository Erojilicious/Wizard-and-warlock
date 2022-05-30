public class Src {

    static Wizard Merlin = new Wizard();
    static Warlock Saruman = new Warlock();

    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks\n\n");

        int GreaterHeal = 1200;
        int hpMerlin;
        int hpSaruman;
        int mpMerlin = 100;
        int mpSaruman = 100;
        int criticalChance = 8;

        hpSaruman = Saruman.getHitPoints() - Merlin.getRayOfLight();
        mpSaruman = Saruman.getManaPoints() - mpSaruman; 
        hpMerlin = Merlin.getHitPoints() - (Saruman.getLifeDrain() * criticalChance);
        mpMerlin = Merlin.getManaPoints() - mpMerlin; 

        System.out.println("Merlin casted Ray Of Light to Saruman");
        System.out.println("Saruman Hp Left: " + hpSaruman);
        System.out.println("Saruman casted Life Drain on Merlin, but with a critical chance because of having a high debilitation!");
        System.out.println("Merlin Hp Left: " + hpMerlin);

        if(hpMerlin <= 300) {
            hpMerlin = hpMerlin + GreaterHeal;
            System.out.println("Merlin used the Greater Heal to delay his death with an additional hp and mp");
            System.out.println("Merlin Hp left: "+ hpMerlin);
        }

    }

}
