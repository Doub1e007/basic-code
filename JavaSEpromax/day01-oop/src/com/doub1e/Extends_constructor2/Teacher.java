package com.doub1e.Extends_constructor2;

public class Teacher extends People {
    private String skill;
    public Teacher() {

    }
    public Teacher(String name, int age, String skill) {
        super(name, age);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
