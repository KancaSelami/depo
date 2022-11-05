package DataAccess.CourseDao;

import Entıtıes.Course;

public class JdbcCourseDao implements ICourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Jdbc üzerinden kurs olusturuldu.");
    }
}
