package secion07;

// everything we pass between "(components...)" is called - record header
public record LPAStudent(String id, String name, String dateOfBirth, String classList) {
    /**
     * Implicitly created when we declare Record, for each item in the header Java generates:
     * 1. A field with the same name and declared type as record component (id typed String);
     * 2. The field is declared private and final - it can't be modified;
     * 3. The field is sometimes referred to as a component (field)
     * Java generates a public accessor method for each component (doesn't have any kind of special prefix (like get or set));
     *
     * !! If you want to modify data on your class, you won't be using Record!! (POJO)
     * But if we are reading a lot of records from a database of file source and simply passing data around, then the Record is a big improvement.
     */
}
