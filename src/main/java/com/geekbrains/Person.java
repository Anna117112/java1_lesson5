package com.geekbrains;

public class Person {

    private String fullName;
    private String position;
    private String email;
    private String telephone;
    private double pay;
    private int ags;

    public Person(){

    }
    
        public Person(String fullName, String position, String email, String telephone, double pay, int ags){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.pay = pay;
        this.ags = ags;
    }
    public  void print(){
        System.out.println("ФИО: " +fullName + ". Должность: " +position + ". email: "+email+". телефон: " +telephone+ ". зарплата: "+pay+". возрвст: "+ags);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public int getAgs() {
        if (ags>40)
            print();



        return ags;

    }

    public void setAgs(int ags) {
        this.ags = ags;
    }
}

