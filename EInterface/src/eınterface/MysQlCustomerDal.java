
package eınterface;


public class MysQlCustomerDal implements ICustomerDal,IRepository{
//bir sinif birden fazla interface i implements edebilir. vesadece bir tane sinifi extends edebilir.
    @Override
    public void add() {
        System.out.println("veri Mysql sistemine kaydedildi.");
    }
    
}
