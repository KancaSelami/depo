import Business.CatagoryManager;
import Business.CourseManager;
import Business.InstructorManager;
import DataAccess.CatagoryDao.HypernateCatagoryDao;
import DataAccess.CourseDao.JdbcCourseDao;
import DataAccess.InstrucdorDao.JdbcInstructorDao;
import Entıtıes.Catagory;
import Entıtıes.Course;
import Entıtıes.Instructor;
import Logger.DatabaseLogger;
import Logger.FileLogger;
import Logger.Ilogger;
import Logger.Maillogger;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        //katagorileri olusturalim.
        Catagory catagory = new Catagory(1, "Spor");
        Catagory catagory1 = new Catagory(2, "El sanatlari");
        //   Catagory catagory2=new Catagory(3,"El sanatlari");
        //ayni isimde 2 kategori olusturmaya calistik hatamizi aldik.
        List<Catagory> catagories = new ArrayList<>();
        Ilogger[] ilogger = {new DatabaseLogger(), new Maillogger(), new FileLogger()};
        CatagoryManager catagoryManager = new CatagoryManager(new HypernateCatagoryDao(), ilogger, catagories);
        catagoryManager.add(catagory);
        catagoryManager.add(catagory1);
        // catagoryManager.add(catagory2);

        //siniflari olusturlarim.
        Course course = new Course(11, "Basketbol", catagory);
        Course course1 = new Course(12, "Futbol", catagory);
        //ayni isimde 2 kurs olusturmaya calistik hatamizi aldik.
        //   Course course2=new Course(21,"futbol",catagory1);
        List<Course> courses = new ArrayList<>();
        CourseManager courseManager = new CourseManager(new JdbcCourseDao(), ilogger, courses);
        courseManager.add(course);
        courseManager.add(course1);
        // courseManager.add(course2);


        //simdik egitmenleri olusturalim.
        Instructor instructor = new Instructor(111, "Selami", "Kanca");
        Instructor instructor1 = new Instructor(112, "Esma", "Kanca");
        //ayni isim soyisimde ogretmen eklenemez hatamizi aldik.
        //   Instructor instructor2=new Instructor(113,"esma","kanca");
        List<Instructor> instructors = new ArrayList<>();
        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), ilogger, instructors);
        instructorManager.add(instructor);
        instructorManager.add(instructor1);
      //  instructorManager.add(instructor2);

    }
}