import java.util.ArrayList;

public class HashMap<Key,Value> {
    private AppendingList<Object> appendingList = new AppendingList<Object>();
    public HashMap(){ }
    public void add(Key key, Value value){
        Object<Key, Value> object = new Object<Key,Value>(key, value);
        appendingList.add(object);
    }
    public Object get(int position){
        return appendingList.getObject(position);
    }

}
