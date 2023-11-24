package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class GenericClassApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<String>("Gils");
        MyData<Integer> integerMyData = new MyData<Integer>(10);


        Integer integervalue = integerMyData.getData();
        String stringvalue = stringMyData.getData();
        System.out.println(integervalue);
        System.out.println(stringvalue);
    }
}
