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
    public boolean checkString(String word){
        /**if the full word is not completed in the trie; all we have to do for this is iterate
         *over the word checking always if it is the word and the trie have the same ending point for the word
         * if so, we return true, otherwise we return false;
         */
    TrieNode curr = root;
    for(int i = 0; i < word.length(); i++){
        char c = word.charAt(i);
        TrieNode node = curr.children.get(c);
        if(node ==null){
            return false;
        }
        /**we are setting the current Node in our trie to the last character that we iterated over
         * before we exit the loop
         */
        curr = node;
    }
        /** if the current end is true.... after we've iterated through the word, so here we are exiting the loop...
         * then we can return true...
         */
    if (curr.end == true){
        return true;
    } else{
        System.out.print("Preface");
        return false;
    }
    }
    private boolean deleteNode(TrieNode parent, String word, int index){
        //We start at the current index which is zero;
        char c = word.charAt(index);
        //Our current Node is the first node, the index
        TrieNode curr = parent.children.get(c);
        //We instantiate a boolean variable..
        boolean canDelete;
        //If we are not close to the bottom of the tree; the node we're dealing with has more than one child
        if (curr.children.size() > 1){
            //if so, increment the index and then recursively call the method;
            deleteNode(curr,word,index + 1);
        }
        //second, the string we want to delete is a prefix of the string we are looking at;
        if(index == word.length() - 1){
            if (curr.children.size() >= 1){
                //the end is not found and
                curr.end = false;
                return false;
            } else{

                return true;
            }
        }
        //it is the end of the string that we want to delete
        if (curr.end == true){
           // call delete with an added index
            deleteNode(curr, word, index + 1);
             return false;

        }
        //if
        canDelete = deleteNode(curr, word, index + 1);
        if(canDelete == true){
            parent.children.remove(c);
            return true;
        } else{
            return false;
        }
    }
    public void delete(String word){
        if (checkString(word) == true){
            deleteNode(root, word, 0);
        }
    }
}
