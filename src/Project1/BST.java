package Project1;

public class BST<Key,Value> {
    private class Node<Key,Value>{
        private Key key;
        private Value value;
        private boolean rotation; // true - right; false - left;
        public Node(Key key, Value value, boolean rotation){
            this.key = key;
            this.value = value;
            this.rotation = rotation;
        }
        public Value getValue() {
            return value;
        }
        public Key getKey() {
            return key;
        }
        public boolean isRotation() {
            return rotation;
        }
    }
    public BST(){}

}
