import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void AreaWithinTest() {

        //expeted 219.1260838
        assertEquals(1, SkillDemo.RectangleArea(10, 5));
    }
}