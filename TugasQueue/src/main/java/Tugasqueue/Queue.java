
package Tugasqueue;


class Queue {
   barang front,rear;
     Queue(){front=rear=null;}
     void enqueue(barang b){
        if(rear== null){
         front=rear=b;   
        }
        else{
            rear.prev=b;
            b.next=rear;
            rear=b;
        }
        System.out.println("enqueue sukses..");
        
        
    }
      barang dequeue(){
        
         barang t=null;
        if(front==null){
            System.out.println("queue kosong!");
        }
        else if(front.prev==null){
            t=front;
            front=rear=null;
        }
        else{
           barang  temp=front.prev;
            front.prev=null;
            temp.next=null;
            front=temp;
            System.out.println("dequeue sukses..");
        }
        return t;
     }
      void lihat(){
        System.out.println("Isi Queue: ");
        for (barang t=rear; t!=null; t=t.next){
            System.out.print(t.nama+" ["+t.harga+"] ");
        }
        System.out.println("");
    } 
}
