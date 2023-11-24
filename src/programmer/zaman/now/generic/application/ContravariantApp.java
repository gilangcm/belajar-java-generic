package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class ContravariantApp {
    public static void main(String[] args) {
    MyData<Object> objectMyData =new MyData<>("Gils");

    objectMyData.setData(1000);

    MyData<? super String> myData = objectMyData;

    process(objectMyData);

        System.out.println(objectMyData.getData());
    }
    public static void process(MyData<? super String> myData){
//        String value = (String) myData.getData(); tidak aman apabila getData begini
        Object value = myData.getData(); // kecuali begini

        System.out.println("process parameter " + value);
        myData.setData("Gilang");
    }
}
