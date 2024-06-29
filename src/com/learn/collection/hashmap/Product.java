package com.learn.collection.hashmap;

import java.util.*;

public class Product {
    private String pId;
    private String productName;
    private String desc;
    private List<String> tags;
    public Product(String pId,String name, String desc){
        this.pId = pId;
        this.productName = name;
        this.desc = desc;
        this.tags = new ArrayList<>();
    }
    public Product addTagsOfOtherProduct(Product product) {
        this.tags.addAll(product.getTags());
        return this;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
    public List<String> getTags() {
        return this.tags;
    }

    public String getpId() {
        return pId;
    }
    public String toString(){
        return pId+" - "+productName+" - "+tags;
    }

    /*
    Note that hashCode() and equals() need to be overridden
    only for classes that we want to use as map keys,
    not for classes that are only used as values in a map.
     */
    public boolean equals(Object o) {
        if(this == o) return true;
        if(null == o || this.getClass() != o.getClass()) return false;
        Product p = (Product) o;
        return Objects.equals(this.pId,p.getpId());
    }

    public int hashCode(){
        return Objects.hash(this.pId,this.productName,this.desc);
    }
}

class Test{
    public static void main(String[] args) {
        HashMap<String,Product> productMap = new HashMap<>();
        Product eBike = new Product("10001","EBike","Electronic Bike");
        Product roadBike = new Product("10002","Road Bike","Petrol Bike");

        productMap.put(eBike.getpId(),eBike);
        productMap.put(roadBike.getpId(),roadBike);

        //productMap.forEach((k,v)->System.out.println(v));

        for(String key : productMap.keySet()){
            System.out.println(productMap.get(key));
        }

        List<String> productIds = new ArrayList<>(productMap.keySet());
        List<Product> products = new ArrayList<>(productMap.values());

        System.out.println(products);

        Product pTemp = new Product("10003","DreamLight","Chocolates");
        productMap.putIfAbsent("10003",pTemp);
        for(Map.Entry<String,Product> entry : productMap.entrySet()){
            System.out.println(entry.getValue());
        }
        pTemp.getTags().add("Eatable");
        //productMap.merge("10003",pTemp,Product::addTagsOfOtherProduct);
        System.out.println(productMap);
    }
}