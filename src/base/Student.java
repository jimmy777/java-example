package base;

/**
 * @Author Y.Z.Y
 * @Date 2020/12/3 9:08
 * @Description 测试类。
 *
 */
public class Student implements Cloneable {
    private String id;
    private String name;

    public Student() {
        this("", "");
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean equals(Student s) {
        return id.equals(s.id) && name.equals(s.name);
    }

    public Student clone() {
        return new Student(id, name);
    }
}
