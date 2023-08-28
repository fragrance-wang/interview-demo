package com.atws.zgtt;

public class Man extends Person {

    public static void main(String[] args) {
        Man man = new Man();
        man.setA("男");
        man.setName("小山");
        man.setAge(18);
        man.print();
    }

    public Man() {
        System.out.println("man构造器初始化");
    }

    private String a;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Override
    public void print() {
        System.out.println("a: "+a);
        super.print();
    }
}
