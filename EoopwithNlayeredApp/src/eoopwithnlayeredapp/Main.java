package eoopwithnlayeredapp;

import eoopwithnlayeredapp.business.ProductManager;
import eoopwithnlayeredapp.core.loging.DataBaseLogger;
import eoopwithnlayeredapp.core.loging.EmailLogger;
import eoopwithnlayeredapp.core.loging.FileLogger;
import eoopwithnlayeredapp.core.loging.Logger;
import eoopwithnlayeredapp.dataAccess.HibernateProductDao;
import eoopwithnlayeredapp.dataAccess.JdbcProductDao;
import eoopwithnlayeredapp.entities.Product;

public class Main {

    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "Iphone Xr", 10000);
        //asagida nerelere loglanacagi sirasi ile seciliyor istersek hepsini silersek loglama yapmaz birini secersek oraya loglar.

        Logger[] loggers = new Logger[]{new DataBaseLogger(), new FileLogger(), new EmailLogger()};
        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
        //suan istedigimiz veri tabanini cok kolay kulanabiliyoruz.
        productManager.add(product1);
    }

}
