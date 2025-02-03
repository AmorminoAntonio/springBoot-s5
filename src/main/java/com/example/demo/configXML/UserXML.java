package com.example.demo.configXML;

public class UserXML {

    private String name;
    private String surname;

    public UserXML(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "UserXML : { " + "\n" +
                "name➡️ '" + name + '\n' +
                "surname➡️ '" + surname + '\n'
                + " }";
    }
}
