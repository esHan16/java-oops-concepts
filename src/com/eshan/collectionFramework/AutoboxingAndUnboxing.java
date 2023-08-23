package com.eshan.collectionFramework;

import java.util.ArrayList;

class IntWrapper {
    int intValue;

    public IntWrapper(int intValue) {
        this.intValue = intValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }
}
public class AutoboxingAndUnboxing {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(25); /** Autoboxing */
        System.out.println(list.get(0));

        ArrayList<IntWrapper> intWrappersObj = new ArrayList<>();
        intWrappersObj.add(new IntWrapper(16)); /** Boxing */
        System.out.println(intWrappersObj.get(0).getIntValue());  /** Unboxing */

        ArrayList<Double> doubleArrayList = new ArrayList<>();
//        doubleArrayList.add(23.0);
//        doubleArrayList.add(new Double(23.4));
        doubleArrayList.add(Double.valueOf(23.4)); // Internally this is how value is stored inside ArrayList (autoboxing)
        System.out.println(doubleArrayList.get(0));
        System.out.println(doubleArrayList.get(0).doubleValue()); // Internally this is how we get the stored value inside ArrayList while unboxing
    }
}
