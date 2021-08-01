package Tries;

import java.util.ArrayList;

public class TriNode {
    public char c;
    public boolean endOfWord;
    public TriNode[]  next;

    public TriNode(char character){
        //26 letters in the alphabet
        this.next = new TriNode[26];
        this.endOfWord = false;
        this.c = character;
    }
}
