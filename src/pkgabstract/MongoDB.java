
package pkgabstract;

public class MongoDB extends database {

    @Override
    void ekle() {
        System.out.println("Mongo eklendi");
    }

    @Override
    void cikar() {
        System.out.println("Cikarildi");
    }
    
}
