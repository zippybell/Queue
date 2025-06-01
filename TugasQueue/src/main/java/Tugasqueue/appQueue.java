
package Tugasqueue;

import java.util.Scanner;
public class appQueue {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        int pilih=0;
        int pemasukkan= 0;
        do{
            System.out.println("Antrian Pembelian");
            System.out.println("1. Enqueue \n2. Dequeue");
            System.out.println("3.View \n4.Exit");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            int totalharga=0;
            switch(pilih){
                case 1:
                    sc.nextLine();
                    System.out.print("Nama Barang\t= ");
                    String n = sc.nextLine();
                    System.out.print("harga\t= ");
                    int h = sc.nextInt();
                    barang b = new barang(n,h);
                    q.enqueue(b);
                    int total=0;
                    for(barang t=q.front; t!=null; t=t.prev){
                        total+=t.harga;
                    }
                    System.out.println("Total Transaksi: "+total);
                    break;
                case 2:
                    barang t = q.dequeue();
                    if (t != null){
                    System.out.println("Check out "+ t.nama);
                    pemasukkan += t.harga;
                    }
                    else{
                        System.out.println("Queue Kosong!");
                    }
                    break;
                case 3:
                    q.lihat();
                    int total2=0;
                    for(barang temp=q.front; temp!=null; temp=temp.prev){
                        total2=total2+temp.harga;
                    }
                    System.out.println("Total Transaksi: "+total2);
                    break;
                case 4:
                    System.out.println("Thanks...");
                    break;
            }
        }while (pilih!=4);
    }
    
}
