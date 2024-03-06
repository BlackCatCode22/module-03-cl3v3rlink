public class app {
    public static void main(String[] args) {
        // creating a yugi deck using deckstats
        Deckstats newdeck = new Deckstats();
        newdeck.ATKandDEF = "1550/2000";
        newdeck.attribute = "light";
        newdeck.level = "6";
        newdeck.TypeandmonsterCategory = "Dragon/ritural";


        Deckstats newdeck2 = new Deckstats();
        newdeck2.ATKandDEF = "3000/2000";
        newdeck2.attribute = "dark";
        newdeck2.level = "8";
        newdeck2.TypeandmonsterCategory = "Spellcaster/effect";

        System.out.println(newdeck.ATKandDEF);
        System.out.println(newdeck.level);
        System.out.println(newdeck.attribute);
        System.out.println(newdeck.TypeandmonsterCategory);
        System.out.println(newdeck2.ATKandDEF);
        System.out.println(newdeck2.level);
        System.out.println(newdeck2.attribute);
        System.out.println(newdeck2.TypeandmonsterCategory);
    }
}