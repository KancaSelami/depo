package DataAccess.CourseDao;

import Entıtıes.Course;

public class HypernateCourseDao implements ICourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Hypernate üzerinden kurs olusturuldu.");
    }
}
