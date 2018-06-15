package New;

public class API<Key, Value> {
//API will be connect MyList and Client Class;
    private MyList<Key,Value> list;
    public API(){
        list = new MyList<Key,Value>(0);
    }
    public API(int isSort){
        list = new MyList<Key,Value>(isSort);
    }
    public void add(Key key,Value value){
        Object<Key,Value> obj = new Object<Key,Value>(key,value);
        this.list.addObject(obj);
    }
    public Object delete(Key key){
        return list.deleteObject(key);
    }
    public int size(){
        return list.getSize();
    }
}
