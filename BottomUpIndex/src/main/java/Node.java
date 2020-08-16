import java.util.ArrayList;

public class Node {

    private String word;
    private Integer numOccurences;
    private ArrayList<Integer> offsets;

    public Node(){};

    public Node(String word){
        this.word = word;
        this.numOccurences = 0;
        this.offsets = new ArrayList<Integer>();
    }

    public ArrayList<Integer> getOffsets() {
        return offsets;
    }

    public Integer getNumOccurences() {
        return numOccurences;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void incrementOccurences(){
        this.numOccurences++;
    }

    public void addOffset(Integer offset){
        this.offsets.add(offset);
    }
}
