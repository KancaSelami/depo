package Business;

import DataAccess.InstrucdorDao.IInstructorDao;
import Entıtıes.Instructor;
import Logger.Ilogger;

import java.util.List;

public class InstructorManager {
    private IInstructorDao instructorDao;
    private Ilogger[] iloggers;
    private List<Instructor>instructors;

    public InstructorManager(IInstructorDao instructorDao, Ilogger[] iloggers, List<Instructor> instructors) {
        this.instructorDao = instructorDao;
        this.iloggers = iloggers;
        this.instructors = instructors;
    }
    public void add(Instructor instructor) throws Exception{
        for(Instructor ins:instructors){
            if(instructor.getName().equalsIgnoreCase(ins.getName())&&instructor.getLastName().equalsIgnoreCase(ins.getLastName())){
                throw new Exception("ayni isim ve soyisimde egitmek sisteme eklenemez:"+ ins.getName()+" "+ins.getLastName() );
            }

        }
         for(Ilogger logla:iloggers){
             logla.log(instructor.getName() +" "+ instructor.getLastName());

         }
         instructorDao.add(instructor);
         instructors.add(instructor);

    }
}
