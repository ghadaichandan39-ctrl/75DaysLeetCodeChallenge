
class TrieNode {
    // Array to store children (a-z)
    public TrieNode[] children;
    public boolean isEndOfWord;

    public TrieNode() {
        children = new TrieNode[26];
        isEndOfWord = false;
    }
}

class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie
    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a'; // Map 'a' to 0, 'b' to 1, etc.
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }

    // Returns true if the word is in the trie
    public boolean search(String word) {
        TrieNode node = find(word);
        return node != null && node.isEndOfWord;
    }

    // Returns true if there is any word in the trie that starts with the given prefix
    public boolean startsWith(String prefix) {
        return find(prefix) != null;
    }

    // Helper method to navigate to the end of a string path
    private TrieNode find(String str) {
        TrieNode node = root;
        for (char c : str.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                return null;
            }
            node = node.children[index];
        }
        return node;
    }
}// class TrieNode {
//     // Array to store children (a-z)
//     public TrieNode[] children;
//     public boolean isEndOfWord;

//     public TrieNode() {
//         children = new TrieNode[26];
//         isEndOfWord = false;
//     }
// }
// class Trie {
//     private TrieNode root;
//         // TrieNode children[]=new TrieNode[26];
//         // boolean endOfWord=false;
//     public Trie() {
//         root = new TrieNode();
//     //         for(int i=0;i<children.length;i++){
//     //             children[i]=null;
//     //         }
//     // }
// }
//     // class Trie{
//     // public TrieNode root;
      
//     //   public Trie(){
//     //     root=new TrieNode();
      
//     //   }
//     public void insert(String word) {
//          TrieNode node = root;
//         for (char c : word.toCharArray()) {
//             int index = c - 'a'; 
//             if (node.children[index] == null) {
//                 node.children[index] = new TrieNode();
//             }
//             node = node.children[index];
//         }
//         node.isEndOfWord = true;
//     //     TrieNode curr=root;
//     //     for(int level=0;level<word.length();level++){
//     //         int idx=word.charAt(level)-'a';
//     //         if(curr.children[idx]==null){
//     //             curr.children[idx]=new TrieNode();
//     //         }
//     //         else{
//     //             curr=curr.children[idx];
//     //         }
//     //     }
//     //    curr.endOfWord=true;
//     // }
    
//     public boolean search(String word) {
//         TrieNode node = find(word);
//         return node != null && node.isEndOfWord;
       
//         // TrieNode curr=root;
//         // for(int level=0;level<word.length();level++){
//         //     int idx=word.charAt(level)-'a';
//         //     if(curr.children[idx]==null){
//         //         return false;
//         //     }else{
//         //         curr=curr.children[idx];
//         //     }
//         // }
//         // return curr.endOfWord==true;
//     }
    
//     public boolean startsWith(String prefix) {
       
//        return find(prefix) != null;
//         // TrieNode curr=root;
//         // for(int level=0;level<prefix.length();level++){
//         //     int idx=prefix.charAt(level)-'a';
//         //     if(curr.children[idx]==null){
//         //         return false;
//         //     }else{
//         //         curr=curr.children[idx];
//         //     }
//         // }
//         // return true;
//     }
//     private TrieNode find(String str) {
//         TrieNode node = root;
//         for (char c : str.toCharArray()) {
//             int index = c - 'a';
//             if (node.children[index] == null) {
//                 return null;
//             }
//             node = node.children[index];
//         }
//         return node;
//     }
// }

// /**
//  * Your Trie object will be instantiated and called as such:
//  * Trie obj = new Trie();
//  * obj.insert(word);
//  * boolean param_2 = obj.search(word);
//  * boolean param_3 = obj.startsWith(prefix);
//  */