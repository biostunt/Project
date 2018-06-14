public class Object<Key, Value>{
    private Key key;
    private Value value;
    public Object(Key key, Value value){
        this.key = key;
        this.value = value;
    }
    public Key getKey(){
        return this.key;
    }
    public Value getValue(){
        return this.value;
    }
    public String toString(){ return "Key: " + this.key + "  Value: " + this.value; }
}