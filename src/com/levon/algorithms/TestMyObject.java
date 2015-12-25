package com.levon.algorithms;

public class TestMyObject {

    public static void main(String[] args) {
        TestMyObject testObj = new TestMyObject();
    	MyObject obj =  testObj.new MyObject();
        obj.set(4);
        System.out.println(obj.get());
        testObj.test(obj);
        System.out.println(obj.get());
    }

    public void test(MyObject obj) {
        obj = new MyObject();
        obj.set(5);
    }

    class MyObject {

        public MyObject() {
            _value = 0;
        }

        public void set(int value) {
            _value += value;
        }

        public int get() {
            return _value;
        }

        private int _value;
    }
}
