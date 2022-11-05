package DataAccess.InstrucdorDao;

import Entıtıes.Instructor;

public class JdbcInstructorDao implements IInstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Jdbc üzerinden Ögretmen sisteme kaydedildi.");
    }
}
