package Business;

import DataAccess.CatagoryDao.ICatagoryDao;
import Entıtıes.Catagory;
import Logger.Ilogger;

import java.util.List;

public class CatagoryManager {

    private ICatagoryDao catagoryDao;
    private Ilogger[] iloggers;
    private List<Catagory>catagories;

    public CatagoryManager(ICatagoryDao catagoryDao, Ilogger[] iloggers, List<Catagory> catagories) {
        this.catagoryDao = catagoryDao;
        this.iloggers = iloggers;
        this.catagories = catagories;
    }
    public void add(Catagory catagory) throws Exception{
    for(Catagory ct:catagories){
        if (catagory.getName().equalsIgnoreCase(ct.getName())){
            throw new Exception("Ayni isimde 2(iki) adet kategori olusturulamaz.");
        }
    }
    for(Ilogger logla:iloggers){

        logla.log(catagory.getName());
    }
    catagories.add(catagory);
    catagoryDao.add(catagory);
    }
}
