package pkgabstract;

public class Abstract {

    public static void main(String[] args) {
    database  database1=new MySql();
    database1.cikar();
    database1.ekle();
    database database2=new MongoDB();
    database2.cikar();
    database2.ekle();
    database2.guncelle();
    }
    
}
