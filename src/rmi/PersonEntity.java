package rmi;

import java.io.Serializable;

public class PersonEntity implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 1220251437823070804L;
    private int id;
    private String name;
    private int age;

    public void setId(int id) {
    this.id = id;
    }

    public int getId() {
    return id;
    }

    public void setName(String name) {
    this.name = name;
    }

    public String getName() {
    return name;
    }

    public void setAge(int age) {
    this.age = age;
    }

    public int getAge() {
    return age;
    }
}