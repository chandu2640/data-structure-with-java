package trie;

public class TrieImplement {
    private static class TrieNode{
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

    static class Trie{
        TrieNode root;
        Trie(){
            root=new TrieNode('\0');
        }

        void insertUtil(TrieNode root, String word){
            //Base Case
            if(word.length()==0){
                root.isTerminal=true;
                return;
            }

            //Assumption word will be in Capital Letters
            int index=word.charAt(0)-'A';
            TrieNode child;

            //If word is present
            if(root.children[index] != null){
                child=root.children[index];
            }

            //If word is not present
            else{
                child=new TrieNode(word.charAt(0));
                root.children[index]=child;
            }

            //Recursion
            insertUtil(child, word.substring(1));
        }

        void insertWord(String word){
            insertUtil(root, word);
        }

        boolean search(String word) {
            return searchUtil(root,word);
        }

        boolean searchUtil(TrieNode root, String word) {
            //Base case
            if(word.length()==0){
                return root.isTerminal;
            }

            int index=word.charAt(0)-'A';
            TrieNode child;

            //If character is Present
            if(root.children[index] != null){
                child=root.children[index];
            }
            //If character is not present
            else{
                return false;
            }

            return searchUtil(child,word.substring(1));
        }

        void remove(String word){
            removeUtil(root,word);
        }

        void removeUtil(TrieNode root, String word) {
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

    public static void main(String[] args) {
        Trie trie=new Trie();
        trie.insertWord("ARM");
        trie.insertWord("DO");
        trie.insertWord("TIME");


        boolean ans=trie.search("ARM");
        if(ans==true) System.out.println("Present");
        else System.out.println("Absent");

        trie.remove("ARM");
        ans=trie.search("ARM");
        if(ans==true) System.out.println("Present");
        else System.out.println("Absent");
    }
}
