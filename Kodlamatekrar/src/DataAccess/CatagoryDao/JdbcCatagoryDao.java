package DataAccess.CatagoryDao;

import Entıtıes.Catagory;

public class JdbcCatagoryDao implements ICatagoryDao{
    @Override
    public void add(Catagory catagory) {
        System.out.println("Jdbc üzerinden katagory sisteme kaydedildi.");
    }
}
