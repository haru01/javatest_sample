import static net.sourceforge.jwebunit.junit.JWebUnit.*;

import org.junit.Test;
import org.junit.Before;

public class HatenaSearchUITest {

    @Before
    public void prepare() {
        setBaseUrl("http://www.hatena.ne.jp/");
    }

    @Test
    public void 検索できること() throws Exception {
        beginAt("/");
        setTextField("q", "Ruby");
        submit();
        Thread.sleep(1000);
        assertTextPresent("まつもとゆきひろ氏");
    }
}
