package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a[] = {2,5,7,9,12,14,16,17,19,20,24};
        int item=16;
        int li=0;
        int hi=a.length-1;
        int mi=(li+hi)/2;

        while(li<=hi){
            if(a[mi]==item){
                System.out.println("Element is at "+mi+"th position");
                break;
            }
            else if(a[mi]<item){
                li=mi+1;
            }
            else{
                hi=mi-1;
            }
            mi=(li+hi)/2;
        }
        if(li>hi){
            System.out.println("Element not found");
        }
    }
}
