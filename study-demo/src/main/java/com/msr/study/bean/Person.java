package com.msr.study.bean;

/**
 * @author MaiShuRen
 * @site https://www.maishuren.top
 * @since 2022-05-03 16:57
 **/
public class Person {

    private Integer age;
    private String name;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Person() {
    }

    public Person(Integer age, String name, String description) {
        this.age = age;
        this.name = name;
        this.description = description;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append('}');
        return sb.toString();
    }
}
