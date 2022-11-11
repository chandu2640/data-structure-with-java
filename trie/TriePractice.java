package trie;

import javax.swing.tree.TreeNode;


class Trie{
    class TrieNode{
        char val;
        TrieNode[] children=new TrieNode[26];
        boolean isTerminal;

        TrieNode(char val){
            this.val=val;
            for (int i = 0; i < 26; i++) {
                children[i]=null;
            }
            isTerminal=false;
        }
    }
    TrieNode root;
    Trie(){
        root=new TrieNode('\0');
    }

    void insert(String word){
        insertUtil(root,word);
    }

    private void insertUtil(TrieNode root, String word) {
        if(word.length()==0){
            root.isTerminal=true;
            return;
        }
        int index=word.charAt(0)-'A';
        TrieNode child;

        if(root.children[index] != null){
            child=root.children[index];
        }
        else{
            child=new TrieNode(word.charAt(0));
            root.children[index]=child;
        }

        insertUtil(child,word.substring(1));
    }

    boolean search(String word){
        return searchUtil(root,word);
    }

    private boolean searchUtil(TrieNode root, String word) {
        if(word.length()==0){
            return root.isTerminal;
        }
        int index=word.charAt(0)-'A';
        TrieNode child;

        if(root.children[index] != null){
            child=root.children[index];
        }
        else return false;

        return searchUtil(child,word.substring(1));
    }

    void remove(String word){
        removeUtil(root,word);
    }

    private void removeUtil(TrieNode root, String word) {
        if(word.length()==0){
            root.isTerminal=false;
            return;
        }

        int index=word.charAt(0)-'A';
        TrieNode child;

        if(root.children[index] != null){
            child=root.children[index];
        }
        else return;

        removeUtil(child,word.substring(1));
    }


}

public class TriePractice {
    public static void main(String[] args) {
        Trie trie=new Trie();
        trie.insert("ARM");
        trie.insert("DONE");
        trie.insert("ARMSTRONG");
        trie.insert("TIMER");

        System.out.println(trie.search("ARM"));
        System.out.println(trie.search("ARMSTRONG"));
        System.out.println(trie.search("TIME"));
        System.out.println(trie.search("TIMER"));
        System.out.println(trie.search("DON"));
        System.out.println("______________________________");

        trie.remove("ARMSTRONG");
        trie.remove("ARM");
        trie.remove("TIMER");
        System.out.println(trie.search("ARM"));
        System.out.println(trie.search("ARMSTRONG"));
        System.out.println(trie.search("TIME"));
        System.out.println(trie.search("TIMER"));
        System.out.println(trie.search("DON"));
    }
}
