package Business;

import DataAccess.CourseDao.ICourseDao;
import Entıtıes.Course;
import Logger.Ilogger;

import java.util.List;

public class CourseManager {
    private ICourseDao iCourseDao;
    private Ilogger[] iloggers;
    private List<Course> courses;

    public CourseManager() {
    }

    public CourseManager(ICourseDao iCourseDao, Ilogger[] iloggers, List<Course> courses) {
        this.iCourseDao = iCourseDao;
        this.iloggers = iloggers;
        this.courses = courses;
    }
    public void add(Course course)throws Exception{
        for(Course crs:courses){
            if(course.getCourseName().equalsIgnoreCase(crs.getCourseName())){
                throw  new Exception("ayni isimde 2(iki) kurs ismi olusturulamaz.");

            }
        }
        for(Ilogger logla:iloggers){
            logla.log(course.getCourseName());
        }
        courses.add(course);
        iCourseDao.add(course);

    }
}
