public class Main
{
    public static void main(String[] args)
    {
        Person p1 = new Person("Bartek", "Kołakowski");
        System.out.println(p1);
        FamilyMember f1 = new FamilyMember("Andrzej", "Kowalski", "Szlacheccy");
        System.out.println(f1);
        Child c1 = new Child("Dariusz", "Nowak", "Zamojscy", "Granie");
        System.out.println(c1);
    }
}