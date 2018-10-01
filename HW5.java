/**
 * Java. Level 1. Lesson 5. HomeWork.
 *
 * @author Sergey Khrenov
 * @version dated 26.09.2018
 */

public class HW5 {
    public static void main(String[] args) {
        Worker[] person = new Worker[5];
        person[0] = new Worker("Grishin A.A", "Driver", "duxa0909@gmail.com",
                "+79092233222", 55000, 44);
        person[1] = new Worker("Ionova E.A. ", "Housemaid", "kat1231@gmail.com",
                "+79268756309", 33000, 18);
        person[2] = new Worker("Tikhomirov K.E.", "Electrik", "kirikpro@gamil.com",
                "+79966538729", 40000, 41);
        person[3] = new Worker("Smirnov N.M.", "Director", "manGer@gmail.com",
                "+74956880213", 100000, 53);
        person[4] = new Worker("Bystrova M.K.", "Student", "DariDarya@gmail.com",
                "+79603983722", 20000, 18);

        for (int i = 0; i < 5; i++) {
            if (person[i].getAge() > 40) {
                System.out.println(person[i]);
            }
        }
    }
}

class Worker {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    Worker(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Full Name: " + name + ", Position: " + position + ", Email: " + email +
                ", PhoneNumber: " + phoneNumber + ", Salary: " + salary + ", Age: " + age;
    }
}