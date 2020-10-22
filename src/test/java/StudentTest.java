import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testCreateStudentInstance(){
        Student fer = new Student(1L, "Fer");
        Student doug = new Student(2L, "Doug");
        assertNotNull(fer);
        assertNotNull(doug);

    }

    @Test
    public void testStudentFields(){
        Student fer = new Student(1L, "Fer");
        assertEquals("Fer", fer.getName());
        assertEquals(1L, fer.getId());
    }


    @Test
    public void testToAddGradeAndGetGrades(){
        Student fer = new Student(1L, "Fer");
        fer.addGrade(100);
        assertEquals(100, (int)fer.getGrades().get(0));
    }


    @Test
    public void testToGetDoubleGetGradeAverage(){
        Student fer = new Student(1L, "Fer");
        fer.addGrade(100);
        fer.addGrade(80);
        assertEquals(90.0, fer.getGradeAverage(), 0);
    }
}
