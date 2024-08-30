public class Child extends FamilyMember
{
    String hobby;
    public Child(String name, String surname, String familyName, String hobby)
    {
        super(name, surname, familyName);
        this.hobby = hobby;
    }

    @Override
    public String toString()
    {
        return super.toString()
                + "[hobby=" + hobby
                + "]";
    }
}
