package Bussiness;

import DateAccess.course.ICourseDao;
import Entities.Catagory;
import Entities.Course;
import Logging.Ilogger;

import java.util.List;

public class CourseManager {
    private ICourseDao iCourseDao;
    private List<Course>courses;
    private Ilogger[] iloggers;

    private Catagory catagory;

    public CourseManager(ICourseDao iCourseDao, List<Course> courses, Ilogger[] iloggers,Catagory catagory) {
        this.iCourseDao = iCourseDao;
        this.courses = courses;
        this.iloggers = iloggers;
        this.catagory=catagory;
    }
    public void add(Course course)throws Exception{
        for(Course crs:courses){
            if(crs.getCourseName().equalsIgnoreCase(course.getCourseName()))
            {
          throw new Exception( "ayni isimde kurs ismi olusturulamaz.");
            }
        }
          for(Ilogger logla:iloggers){
              logla.log(course.getCourseName());
          }
          iCourseDao.add(course);
          courses.add(course);
        System.out.println(course.getCourseName()+" isimli kurs "+catagory.getCatagoryName()+" isimli katagorye yerlestirildi.");
    }
}
