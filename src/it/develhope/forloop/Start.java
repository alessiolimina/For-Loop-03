package it.develhope.forloop;

public class Start {
    public static void main(String[] args) {

        System.out.println("------------Starting--------------");

        String[] arr = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0)
                {System.out.println(arr[i].toUpperCase());}
                else {System.out.println(arr[i]);}}

        System.out.println("------------------------------------");

    }
}
