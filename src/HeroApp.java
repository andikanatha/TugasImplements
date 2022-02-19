public class HeroApp {
    public static void main(String[] args) {
        Hero hero = new Hero();
        System.out.println("Macam Macam Character Mobile Legends dengan ability");

        System.out.println("=================================================");

        hero.Layla("Layla");
        hero.Layla("Meriam" , "Destruction Rush" , "Flicker");

        System.out.println("=================================================");

        hero.Zilong("Zilong");
        hero.Zilong("Tombak" , "Supreme Warrior" , "Execute");

        System.out.println("=================================================");

        hero.Clint("Clint");
        hero.Clint("Pistol" , "Howitzer Clint" , "Flicker");

        System.out.println("=================================================");

        hero.Alucard("Alucard");
        hero.Alucard("Pedang" , "Fission Wave" , "Retribution");

        System.out.println("=================================================");

        hero.Hilda("Hilda");
        hero.Hilda("Kapak" , "Power of Wildness" , "Execute");

        System.out.println("=================================================");

        hero.Lesley("Lesley");

        hero.Lesley("Sniper" , "Snipe" , "Flicker");
    }
}
