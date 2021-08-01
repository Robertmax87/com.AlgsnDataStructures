package Tries;

public class Triee {
    private TriNode root;
    //constructor
    public Triee(){
        this.root = new TriNode('/');

    }
    public void insert(String word){
        /** for any linked list or any data structure that has a 'next' we need to start from the beginning
         * so we initialize the current Node we're looking at as the root;
         */
        TriNode curr = root;
        /**we then iterate over the characters in the word;
         * BUUUUUUT...---->
         */
        for(int i = 0; i < word.length(); i++){
            //---> We need to instantiate a variable here to iterate with, charAt(i);
            char index = word.charAt(i);
            /**here we are checking to see if the character is already there.., if it isn't and the character is
             * equal to null then we know that we need to insert the character there so we do
             * hence new TriNode(character/ index);
             */
            if(curr.next[index - 'a'] == null) {
                curr.next[index - 'a'] = new TriNode(index);
            }
            // here we continue moving
                curr = curr.next[index - 'a'];
            }
        // we are finished and set the end of word to True;
        curr.endOfWord = true;
        }
        //return the very last Node in the word we are looking for
        public TriNode returnNode(String word){
        TriNode curr = root;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(curr.next[c - 'a'] == null){
                return null;
            }
            curr = curr.next[c - 'a'];
        }
       // if (curr.endOfWord){
            return curr;

        }
        public boolean search(String word){
        TriNode got = returnNode(word);
        return got != null && got.endOfWord;
        }
        public boolean preFix(String prefix){
        return returnNode(prefix) != null;
        }
    }

