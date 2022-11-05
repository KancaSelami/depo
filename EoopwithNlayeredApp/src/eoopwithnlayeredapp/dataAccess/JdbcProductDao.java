
package eoopwithnlayeredapp.dataAccess;

import eoopwithnlayeredapp.entities.Product;

public class JdbcProductDao implements ProductDao{
    public void add(Product product){
    // sadece db erisim kodlari buraya yazilir 
    //bunun icinde SQL bilmek gerekir.
        System.out.println("Jdbc ile veritabanina eklendi.");
        
    }
    
}
