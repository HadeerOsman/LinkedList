package com.company;

public class List {
    private Link first;

     public List(){
        first=null;
    }
    public Boolean isEmpty(){
         return (first==null);
    }
    public void insert(int Kv,int Itm){  // insert items with keys
         Link NewLink=new Link(Kv,Itm);
         NewLink.nextItm=first;
         first=NewLink;
    }
    public Link FindSpecfLink(int K){       //find a specific key
         Link currentlink=first;
         while (currentlink.Key!=K){

             if (currentlink.nextItm==null){
                return null;
             }
             else{
                 currentlink=currentlink.nextItm;
             }

         }
        return currentlink;
    }

    public Link deleteLink(int K) {      // Delet specific key
        Link current = first;
        Link Prev = first;
        while (current.Key != K) {
            if (current.nextItm == null)
                return null;
            else {
                Prev = current;
                current = current.nextItm;
            }
        }


        if (current==first){
            first=first.nextItm;
        }
        else {
            Prev.nextItm=current.nextItm;
        }
        return current;
    }
    public void DisplayList(){
         Link current=first;
         while (current!=null){
             current.DisplayLink();
             current=current.nextItm;
         }
        System.out.println(" ");
    }


}
