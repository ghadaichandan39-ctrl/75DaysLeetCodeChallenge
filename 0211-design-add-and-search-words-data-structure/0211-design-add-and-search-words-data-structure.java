class WordNode {
    WordNode[] children = new WordNode[26];
    boolean isEndOfWord = false;
}
class WordDictionary {
    private WordNode root;

    public WordDictionary() {
        root = new WordNode();
    }

    // Standard Trie Insertion
    public void addWord(String word) {
        WordNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new WordNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }

    public boolean search(String word) {
        return searchInNode(word, 0, root);
    }

    private boolean searchInNode(String word, int index, WordNode node) {
        // Base case: if we've reached the end of the string
        if (index == word.length()) {
            return node.isEndOfWord;
        }

        char c = word.charAt(index);

        if (c == '.') {
            // Wildcard: Try all 26 possible children
            for (int i = 0; i < 26; i++) {
                if (node.children[i] != null) {
                    if (searchInNode(word, index + 1, node.children[i])) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            // Specific character: move to that specific child
            int idx = c - 'a';
            WordNode child = node.children[idx];
            if (child == null) return false;
            return searchInNode(word, index + 1, child);
        }
    }
}
// class Word{
//   public Word[] children;
//   public boolean isEndOfWord=false;
// }

// class WordDictionary {
//     public Word root;

//     public WordDictionary() {
//         root=new Word();
//     }
//     public void addWord(String word) {
//        Word node =root;
//        for( int i=0;i<word.length();i++){
//         int idx=word.charAt(i)-'a';
//         if(node.children[idx]==null){
//             node.children[idx]=new Word();
//         }else{
//             node=node.children[idx];
//         }
//        }
//        node.isEndOfWord = true;
//     }
    
//     public boolean search(String word) {
//         return searchInNode(word, 0, root);
//     }
//     private boolean searchInNode(String word, int index, Word node) {
//         if (node == null) return false;
//         if (index == word.length()) return node.isEndOfWord;

//         char c = word.charAt(index);
//         if (c == '.') {
//             for (int i = 0; i < 26; i++) {
//                 if (node.children[i] != null && searchInNode(word, index + 1, node.children[i])) {
//                     return true;
//                 }
//             }
//             return false;
//         } else {
//             int idx = c - 'a';
//             Word child = node.children[idx];
//             if (child == null) return false;
//             return searchInNode(word, index + 1, child);
//         }
//     }
// }

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */