package com.company;

public class Link {
    int Key;
    int item;
    Link nextItm;
    public Link(int Kv,int Itm){
        Key=Kv;
        item=Itm;
    }
    public void DisplayLink(){                    // display linkedList
        System.out.println(" ("+Key+","+item+")");
    }
}
