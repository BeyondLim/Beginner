package Homework;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.*;
public class IntArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> listOfInteger = new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)

        {
            int m = sc.nextInt();
            listOfInteger.add(m);

        }
        System.out.println(listOfInteger);
    }
}
