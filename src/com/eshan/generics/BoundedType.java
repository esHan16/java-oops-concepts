package com.eshan.generics;

/**
 * extend keyword is used for bounded type
 * @param <K>
 * @param <V>
 */
class BoundedType<K extends String, V extends MainClass> {
    private K key;
    private V value;

    public BoundedType(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public <E extends Character, N extends Number> void display(E element, N number){
        System.out.println("Element : "+element+" Number : "+number);
    }
}

class MainClass {
    public static void main(String[] args) {
        BoundedType<String, MainClass> boundedType = new BoundedType<String, MainClass>("Eshan Verma", new MainClass());
        System.out.println(boundedType.getKey());
        boundedType.display('$',3.4);
        boundedType.display('#',3);
        boundedType.display('%',5.04f);
        boundedType.getValue().testing();
    }
    public void testing(){
        System.out.println("###TESTING###");
    }
}
