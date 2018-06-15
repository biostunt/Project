package New;
//This is an object which will be putting in MyList -> It has key and value;
public class Object<Key, Value>{
    private Key key;
    private int keySize;
    private Value value;
    public Object(Key key, Value value){
        this.key = key;
        this.value = value;
        setKeySize();
    }
    private void setKeySize(){
        char[] temp = this.key.toString().toCharArray();
        int size = 0;
        for(char c : temp){
            size+= (int) c;
        }
        this.keySize = size;
    }
    public Key getKey() {
        return key;
    }
    public Value getValue() {
        return value;
    }
    public int getKeySize(){
        return this.keySize;
    }
    public String toString(){
        if(this.key == "--no--" && this.value == "--no--") return "There is no Element with the same key/value";
        else return "Key:: " + this.key + " Value:: " + this.value;
    }
}
