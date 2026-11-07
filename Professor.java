public class Professor extends User {
    public Professor(String name, String faculty, String contact,String telephone) {
        super(name, faculty, contact, telephone);
    }

    @Override
    public String toString() {
        return getName() + " (Professor, " + getFaculty() + ", " + getContact() + ")" + " Tel: " + getTelephone();
    }
}
