package pkgabstract;

public class MySql extends database {

    @Override
    void ekle() {
        System.out.println("MySql eklendi...");
    }

    @Override
    void cikar() {
        System.out.println("MySql cikarildi...");
    }
    
    
}
