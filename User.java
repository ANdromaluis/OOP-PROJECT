public class User {
    private String name;
    private String faculty;
    private String contact;
    private String telephone;

    public User(String name, String faculty, String contact, String telephone) {
        this.name = name;
        this.faculty = faculty;
        this.contact = contact;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getContact() {
        return contact;
    }

    public String getUserType() {
        return "User";
    }

    public String getTelephone() {
        return telephone;
    }

    @Override
    public String toString() {
        return name + " (" + faculty + ", " + contact + ")" + " Tel: " + telephone;
    }
}
