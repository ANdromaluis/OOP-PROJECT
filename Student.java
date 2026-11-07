public class Student extends User {
    private String studentId;

    public Student(String name, String faculty, String contact, String telephone, String studentId) {
        super(name, faculty, contact, telephone);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return getName() + " (Student, " + getFaculty() + ", " + getContact() + ", " + getTelephone()
                + ", ID: " + studentId + ")";
    }
}
