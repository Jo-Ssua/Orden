package org.example.model;

public class Example {


    private Nodo first;
    private Nodo last;
    private int size;

    public Example(){
        first=null;
        last=null;
    }

    public void addNode(int dato){
        Nodo temp = new Nodo(dato);

        if(first == null){
            first = temp;
            last = first;
            first.setPrev(null);
            size++;
        }else{
            temp.setPrev(last);
            last.setNext(temp);
            last = temp;
            last.setNext(null);
            if(first.getNext() == null){
                first.setNext(last);
            }
            size++;

        }



    }

    public void addInfo(){

        for (int i = 10; 0 <=i ; i--) {
            addNode(i);




        }
    }

    public void order(){
        Nodo current = first;
        Nodo comparator = first.getNext();

            while (current.getNext() != null && comparator != null){

                    while (current.getDato() < comparator.getDato() ){
                        comparator = comparator.getNext();


                    }
                    if (current.getDato() > comparator.getDato()){
                        Nodo temp = comparator;
                        comparator.setPrev(current.getPrev());
                        current.setNext(comparator.getNext());
                        comparator.setNext(current);
                        current.setPrev(comparator);
                        current.getNext().setPrev(current);

                        System.out.println(current.getDato());


                    }
                    comparator = comparator.getNext();


                current = current.getNext();

            }






    }

    public void printList(){
        Nodo current =first;
        while (current!= null){
            System.out.print("["+current.getDato()+"]");
            current = current.getNext();
        }
    }


}
