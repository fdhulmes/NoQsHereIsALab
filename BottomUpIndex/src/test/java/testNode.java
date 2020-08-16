import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class testNode {

    @Test
    public void testNodeConstructor(){
        String expectedWord = "word";
        Integer expectedOcc = 1;
        Node node = new Node(expectedWord);

        assertEquals(node.getWord(), expectedWord);
        assertEquals(node.getNumOccurences(), expectedOcc);
    }

    @Test
    public void testAddOffset(){
        Integer expectedOffset = 15;
        Node node = new Node("word");

        node.addOffset(11);
        node.addOffset(expectedOffset);

        ArrayList<Integer> output = node.getOffsets();

        assertEquals(output.get(1), expectedOffset);
    }
}
