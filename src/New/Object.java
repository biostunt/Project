package New;
//This is an object which will be putting in MyList -> It has key and value;
public class Object<Key, Value> {
    private Key key;
    private Value value;
    public Object(Key key, Value value){
        this.key = key;
        this.value = value;
    }

    public Key getKey() {
        return key;
    }

    public Value getValue() {
        return value;
    }
    public String toString(){
        return "Key:: " + this.key + " Value:: " + this.value;
    }
}
