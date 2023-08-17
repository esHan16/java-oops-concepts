package com.eshan.oops.interfaces.nestedInterfaces;

public class B implements A.NestedInterface {

    @Override
    public void oddOrEven() {
        System.out.println("find odd or even");
    }
}
