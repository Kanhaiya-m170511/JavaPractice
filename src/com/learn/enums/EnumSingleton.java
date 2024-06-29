package com.learn.enums;

public enum EnumSingleton {
    INSTANCE("This is Singleton Instance");

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    private String info;
    private EnumSingleton(String info){
        this.info = info;
    }
    public EnumSingleton getInstance(){
        return INSTANCE;
    }

}

class Test{
    static {
        synchronized (Test.class){
            System.out.println("Yes");
        }
    }
    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.INSTANCE;
        instance.getInstance();

        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE.getInstance();

        System.out.println(enumSingleton1.getInfo()); //Initial enum info

        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE.getInstance();
        enumSingleton2.setInfo("New enum info");

        System.out.println(enumSingleton1.getInfo()); // New enum info
        System.out.println(enumSingleton2.getInfo()); // New enum info

    }
}