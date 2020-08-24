public class PersonBuilder {

    private String name;
    private String surname;
    private int age = Person.UNDEFINED_AGE;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age < 0) throw new IllegalArgumentException("Field \"age\" cannot be negative!");
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() throws IllegalArgumentException {
        String notSetFields = "";
        if (name == null || name.length() == 0) {
            notSetFields = "\"name\"";
        }
        if (surname == null || surname.length() == 0) {
            notSetFields += (notSetFields.length() > 0 ? ", ":"") + "\"surname\"";
        }
        if (notSetFields.length() > 0)
            throw new IllegalArgumentException("Field(s) " + notSetFields + " was not set!");
        Person person = new Person(name, surname, age);
        if (address != null && address.length() > 0)
            person.setAddress(address);
        return person;
    }
}
