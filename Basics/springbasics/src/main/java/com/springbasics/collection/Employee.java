package com.springbasics.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {

    private String name;
    private List<String> phones;
    private List<String> addresses;
    private Map<String, String> courses;
    private Set<String> skills;
    private Properties props;

    
    public Properties getProps() {
        return props;
    }


    public void setProps(Properties props) {
        this.props = props;
    }


    public Set<String> getSkills() {
        return skills;
    }


    public void setSkills(Set<String> skills) {
        this.skills = skills;
    }


    public Employee(String name, List<String> phones, List<String> addresses, Map<String, String> courses, Set<String> skills, Properties props) {
        this.name = name;
        this.phones = phones;
        this.addresses = addresses;
        this.courses = courses;
        this.skills = skills;
        this.props = props;
    }

    
    @Override
    public String toString() {
        return "Employee [name=" + name + "\n" + " phones=" + phones + "\n" + "addresses=" + addresses + "\n" + " courses=" + courses + "\n" + "skills" + skills + "\n" + "props=" + props + "]";
    }

    

    public Employee() {
        super();
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<String> getPhones() {
        return phones;
    }
    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
    public List<String> getAddresses() {
        return addresses;
    }
    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }
    public Map<String, String> getCourses() {
        return courses;
    }
    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    
}
