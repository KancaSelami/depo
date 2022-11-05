
package eoopwithnlayeredapp.business;

import eoopwithnlayeredapp.core.loging.Logger;
import eoopwithnlayeredapp.dataAccess.HibernateProductDao;
import eoopwithnlayeredapp.dataAccess.JdbcProductDao;
import eoopwithnlayeredapp.dataAccess.ProductDao;
import eoopwithnlayeredapp.entities.Product;
import java.util.List;


public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;
    // private List<Logger> loggers ayni sey array ile
    public ProductManager(ProductDao productDao,Logger[] loggers) {
        this.productDao = productDao;
        this.loggers=loggers;
    }
    
    public void add(Product product) throws Exception{
        //buraya is kurallarimiz yazilicak.
        if(product.getUnitPrice()<10){
            throw new Exception("urun fiyati 10 dan kucuk olamaz.");
             //throw exeption sart saglanmiyorsa programin hata vermesi saglanir yanlis veri girdiginde uygulama durur.  
        }
     //   JdbcProductDao productDao = new JdbcProductDao();
      //  productDao.add(product);
        //artik hyper ve jdbc ile veritabanina eklemek cok kolay oldu polimorfizm ile
       // burasida daha guzel bir hale getirilecek ProductDao productDao=new HibernateProductDao();
        //istedigimiz yontemi artik rahatlikla sececbiliyoruz.
        productDao.add(product);
        //simdik tum loglama islemlerini tek seferde for ile kuracagiz.
        for (Logger logger : loggers) {// buradaki ilk gonderilecek log olusturulan siniftaki siralama ile belirlenir.
            
            logger.log(product.getName());
        }
    }
}
