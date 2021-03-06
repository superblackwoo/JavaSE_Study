package mySet;

public class Student_Overwreite_eq_hash implements Comparable<Student_Overwreite_eq_hash> {
    //学号
    private String sid;
    //姓名
    private String name;
    //年纪
    private int age;
    //地址
    private String address;

    public Student_Overwreite_eq_hash() {
    }

    public Student_Overwreite_eq_hash(String sid, String name, int age, String address) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student_Overwreite_eq_hash that = (Student_Overwreite_eq_hash) o;

        if (age != that.age) return false;
        if (sid != null ? !sid.equals(that.sid) : that.sid != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return address != null ? address.equals(that.address) : that.address == null;
    }

    @Override
    public int hashCode() {
        int result = sid != null ? sid.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Student_Overwreite_eq_hash o) {
        int num = this.age - o.age ;
        int num2 = num == 0 ? this.name.compareTo(o.name) : num;
        return num2;
    }

    @Override
    public String toString() {
        return "Student_Overwreite_eq_hash{" +
                "sid='" + sid + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
