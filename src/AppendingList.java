public class AppendingList<Type> {
    private Type[] array;
    private int top;
    public AppendingList(){
        this.array = (Type[]) new Object[10];
    }
    private boolean isFull(){
        if(this.top == this.array.length) return true;
        else return false;
    }
    private void appendSize(){
        Type[] temp = (Type[]) new Object[this.array.length];
        for(int i = 0; i < this.array.length ; i++) temp[i] = this.array[i];
        this.array = (Type[]) new Object[this.array.length*this.array.length/2 + 1];
        for (int i = 0; i < temp.length ; i++) {
            this.array[i] = temp[i];
        }
        temp = null;
    }
    public void add(Type object){
        this.array[top] = object;
        top++;
        if(isFull()) appendSize();
    }
    public Type getObject(int position){
        return this.array[position];
    }
}
