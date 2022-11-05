package eoopwithnlayeredapp.dataAccess;

import eoopwithnlayeredapp.entities.Product;

public class HibernateProductDao implements ProductDao{
      public void add(Product product){
  
        System.out.println("Hibernate ile veritabanina eklendi.");
        //implements ile baglanilan implements in kurallarina uymak zorunda
        
    }
}
