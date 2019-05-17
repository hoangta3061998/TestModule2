public class Student {
    private int id;
    private String name;
    private int age;
    private String address;
    private double gpa;
    public Student(int id,String name, String address, int age , double gpa){
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.gpa = gpa;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getAge(){
        return age;
    }
    public double getGpa(){
        return gpa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
