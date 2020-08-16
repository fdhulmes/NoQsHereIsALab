import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class testIndex {

    private Index index;

    @Before
    public void Setup(){
        this.index = new Index();
    }

    @Test
    public void testNewIndex(){
        assertNotNull(this.index.getIndex());
    }

    @Test
    public void testStemming(){
        Integer expected = 15;
        this.index.addToIndex("birds", expected);

        Node node = this.index.getNode("bird");

        assertEquals(expected, node.getOffsets().get(0));
    }
}
