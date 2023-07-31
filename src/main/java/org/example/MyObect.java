package org.example;

public class MyObect {
    private String name = "";
    private int id ;

    public void Id(int id) {
        this.id = id;
    }

    public int Id() {
        return id;
    }

    private int age = 0;
    private boolean status = false;

    public void Name(String name) {this.name = name;}
    public String Name() {
        return name;
    }
    public int Age() {return age;}
    public void Age(int age) {this.age = age;}
    public boolean Status() {return status;}
    public void Status(boolean status) {this.status = status;}

    public MyObect(String name, int age, boolean status) {
        this.name = name;
        this.age = age;
        this.status = status;
    }
    public MyObect() {}

    public void ShowInConsole(){
        System.out.print("\tName: "+name+
                "\n\tID: "+id+
                "\n\tAge: "+age+
                "\n\tStatus :"+status+"\n");
    }

    @Override
    public  String toString() {
        return String.format("MyObect[name=%s, id=%d, age=%d, status=%b",name,id,age,status);
    }
}
