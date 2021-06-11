class Trie {
    Node root;
   
    /** Initialize your data structure here. */
    public Trie() {
        root = new Node();
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        if(word == null) return;
        Node node = root;
        for(char c : word.toCharArray()){
            if(node.children[c-'a'] == null) node.children[c-'a'] = new Node();
            node = node.children[c-'a'];
        }
        node.isEnd = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        if(word == null) return true;
        Node node = root;
        for(char c : word.toCharArray()){
            if(node.children[c-'a'] == null) return false;
            node = node.children[c-'a'];
        }
       return  node.isEnd;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
         if(prefix == null) return true;
        Node node = root;
        for(char c : prefix.toCharArray()){
            if(node.children[c-'a'] == null) return false;
            node = node.children[c-'a'];
        }
       return  true;
    }
}

class Node{
    boolean isEnd;
    Node[] children;
    /** Initialize your data structure here. */
    public Node() {
        children = new Node[26];
    }
}
/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */