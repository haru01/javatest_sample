import static net.sourceforge.jwebunit.junit.JWebUnit.*;

import org.junit.Test;
import org.junit.Before;

public class GradleHelloUITest {

    @Before
    public void prepare() {
        setBaseUrl("http://localhost:9000/javatest_sample/");
    }

    @Test
    public void servletのページに遷移できること() throws Exception {
        beginAt("/");
        clickLinkWithText("servlet");
        assertTextPresent("db.databasename:");
    }
}
