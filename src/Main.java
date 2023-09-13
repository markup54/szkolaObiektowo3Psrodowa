public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Osoba osoba1 =new Osoba();
        osoba1.setImie( "Jaś");
        osoba1.setWiek(-12);
        System.out.println(osoba1.getImie());
        System.out.println(osoba1.getWiek());
        Osoba osoba2 = new Osoba("Asia",16);
        System.out.println(osoba2);
        Uczen uczen = new Uczen("Tomek",7,234);
        Uczen uczen1 = new Uczen("Ala",8);
        Uczen uczen2 = new Uczen("Ela",6);
        System.out.println(uczen1);
        System.out.println(uczen2);
        System.out.println(uczen);

    }
}