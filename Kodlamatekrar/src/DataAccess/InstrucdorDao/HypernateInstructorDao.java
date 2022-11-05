package DataAccess.InstrucdorDao;

import Entıtıes.Instructor;

public class HypernateInstructorDao implements IInstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Hypernate üzerinden Ögretmen sisteme kaydedildi .");
    }
}
