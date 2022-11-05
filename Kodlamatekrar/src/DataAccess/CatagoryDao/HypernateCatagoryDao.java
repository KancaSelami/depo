package DataAccess.CatagoryDao;

import Entıtıes.Catagory;

public class HypernateCatagoryDao implements ICatagoryDao{
    @Override
    public void add(Catagory catagory) {
        System.out.println("Hypernate üzerinden catagory sisteme kaydedildi.");
    }
}
