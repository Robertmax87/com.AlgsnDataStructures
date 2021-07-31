package Tries;

public class Trie {
    public TrieNode root;

    public Trie(){
        this.root = new TrieNode();

    }
    public void insertRoot(String word){
        //Starting from the rootNode
        TrieNode curr =root;
        //iterating over the entire length of the word
        for(int i = 0; i < word.length(); i++){
            //instantiating a variable
            char ch = word.charAt(i);
            //get the characters
            TrieNode node = curr.children.get(ch);
            /**get the keys(characters), if the key's node is null(Nodes hold references to next nodes), insert...
            when we find the null TrieNode we make a new trieNode and then put the character and a reference to a new
            trieNode that has no character instantiated yet.**/
            if(node == null){
                node = new TrieNode();
                curr.children.put(ch, node);
            }
            //the current node is now the node we added
            curr = node;
        }
        //this is the current end of the word
        curr.end = true;
    }
    public void insert(String word){
        TrieNode curr = root;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            //getting the children one after one iterating through the characters in the map
            TrieNode nextNode = curr.children.get(c);
            /**the nextNode is the reference to the nextNode; we are getting the character's children
             * if the child is null, we are making a reference to a new Node and the child of curr will be
             * the (new character,new Node(which is null))
             */
            if (nextNode == null){
                nextNode = new TrieNode();
                curr.children.put(c,nextNode);
            }
            curr = nextNode;
        }
        curr.end = true;

    }
}
