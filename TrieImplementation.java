
// import java.util.* ;
// import java.io.*; 
public class TrieImplementation {

    static class Node{
        Node[] links ;
        int ew ;
        int cp ;
        Node(){
            links = new Node[26];
            ew =0;
            cp  =0;
        }

        boolean containsKey(char ch){
            return links[ch- 'a'] != null;
        }
        Node get(char ch){
            return links[ch- 'a'];
        }
        void put(char ch , Node node){
          links[ch- 'a'] = node;
            
        }
        void increaseEnd(){
           ew++;
        }
        void increasePrefix(){
            cp++;
        }
        void deleteEnd(){
            ew--;
        }
        void reducePrefix(){
            cp--;
        }
    }
    private Node root ;
    public TrieImplementation() {
        // Write your code here.
        root = new Node();
    }

    public void insert(String word) {
        // Write your code here.
        Node node = root ;
        for(int i=0 ;i<word.length();i++){
            if(!node.containsKey(word.charAt(i))){
                node.put(word.charAt(i) , new Node());
            }
            node = node.get(word.charAt(i));
            node.increasePrefix();
        }
        node.increaseEnd();
    }

    public int countWordsEqualTo(String word) {
        // Write your code here.
        Node node = root ;
        for(int i=0 ;i<word.length();i++){
            if(node.containsKey(word.charAt(i))){
                node = node.get(word.charAt(i));
            }else{
                return 0;
            }
        }
        return node.ew;
    }

    public int countWordsStartingWith(String word) {
        // Write your code here.
        Node node = root ;
        for(int i=0 ;i<word.length();i++){
            if(node.containsKey(word.charAt(i))){
                node = node.get(word.charAt(i));
            }
            else {
                return 0 ;
            }
        }
        return node.cp;

    }

    public void erase(String word) {
        // Write your code here.
        Node node = root;
        for(int i=0 ;i< word.length() ;i++){
            if(node.containsKey(word.charAt(i))){
                node = node.get(word.charAt(i));
                node.reducePrefix();
            }
            else {
                return ;
            }
        }
        node.deleteEnd();
    }

}
