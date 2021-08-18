package com.codegym;

public class MyListTest {

    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();
        myList.addElementIndex(0,1);
        System.out.println(myList.get(0));

        MyList<String> stringMyList = new MyList<String>(11);
        stringMyList.addElementIndex(0,"element1");
        stringMyList.addElementIndex(1,"element2");
        stringMyList.addElementIndex(11,"element11");

        stringMyList.remove(0);
        System.out.println(stringMyList.get(0));
        System.out.println(stringMyList.size());

        MyList<Integer> integerMyList = new MyList<>();
        integerMyList.add(1);
        integerMyList.add(2);
        integerMyList.add(3);
        integerMyList.add(4);
        integerMyList.add(1);
        integerMyList.add(2);
        integerMyList.add(3);
        integerMyList.add(4);
        integerMyList.add(1);
        integerMyList.add(2);
        integerMyList.add(2);
        integerMyList.add(3);

        for (Object list : integerMyList.getElements()) {
            System.out.print(list + " ");
        }

        System.out.println("size: " + integerMyList.size());


    }
}
