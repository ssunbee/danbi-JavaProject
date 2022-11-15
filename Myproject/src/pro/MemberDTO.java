package pro;

public class MemberDTO {

    //번호 이름 나이 주소
    private int id;
    private String name;
    private int age;
    private String address;

    // 기본생성자
    public MemberDTO() {

    }
    public MemberDTO(int id, String name, int age, String address) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //getter, setter
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public void setAgesetAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    // toString
    public String toString () {
        return " "+ id + "\t" + name + "\t" + age+"\t"+ address;
    }


    public void setAge(int age) {
    }
}