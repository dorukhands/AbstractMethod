package pkgabstract;

public abstract class database {
     abstract void ekle();
     abstract void cikar();
    //Abstract class'larda hem gövdeli hem de gövdesiz metodlar oluşturabiliriz.
    //Inheritance ve interface'lerin birleşimi gibi düşünebiliriz. 
     public void guncelle(){
         System.out.println("Guncellendi...");
     }
       public void sil(){
           System.out.println("Silindi...");
       }
   
    
}
