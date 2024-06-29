package com.learn.cloning;

import java.util.List;

public class ShallowCloningEx {
    public static void main(String[] args) {
        Temp temp = new Temp(2,3,List.of("Hiii","Hello","Yes"));
        System.out.println(temp+" :: "+temp.hashCode());
        Temp temp1 = temp;
        System.out.println(temp1+" :: "+temp1.hashCode());

        //System.out.println(temp1.);

    }
}

class Temp{
    private int x;
    private Integer y;
    private List<String> list;
    public Temp(int x, Integer y, List<String> list){
        this.list =list;
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return x+ "-" + y + " " + list;
    }

}