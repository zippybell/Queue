
package Tugasqueue;


 class barang {
   
    String nama;
    int harga;
    barang prev, next;
    barang(String n, int h){
        nama=n;
        harga=h;
        
        
        System.out.println(nama+ " dibuat...");
    } 
} 

