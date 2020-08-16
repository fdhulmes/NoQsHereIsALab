import opennlp.tools.stemmer.PorterStemmer;

import java.util.HashMap;

public class Index {

    private HashMap<String, Node> index;

    public Index(){
        this.index = new HashMap<String, Node>();
    }

    public void addToIndex(String input, Integer offset){
        String word = new PorterStemmer().stem(input);
        if(index.containsKey(word)){
            index.get(word).incrementOccurences();
            index.get(word).addOffset(offset);
        }
        else{
            Node newNode = new Node(word);
            newNode.addOffset(offset);
            index.put(word, newNode);
        }
    }

    public HashMap<String, Node> getIndex() {
        return index;
    }

    public Node getNode(String key){
        return index.get(key);
    }
}
