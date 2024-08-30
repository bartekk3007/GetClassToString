public class FamilyMember extends Person
{
    String familyName;
    public FamilyMember(String name, String surname, String familyName)
    {
        super(name, surname);
        this.familyName = familyName;
    }

    @Override
    public String toString()
    {
        return super.toString()
                + "[familyName=" + familyName
                + "]";
    }
}
