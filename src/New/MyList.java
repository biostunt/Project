package New;

public class MyList<Type,Key,Value> {
    private Type[] Container = (Type[]) new Object[10];
    private int top = 0;
    private Key searchKey;
    private Value searchValue;
    private boolean Sorting;
    public MyList(boolean sorting){
        this.Sorting = sorting;
    }
    private boolean isFull(){
        // Checking on full-sized;
        return this.top == this.Container.length ? true:false;
    }
    private boolean isEempty(){
        //checking on empty;
        return this.top == 0 ? true:false;
    }
    private void changeSize(){
        //Changing size of main Container which include all elements
        Type[] tempContainer = (Type[]) new Object[this.Container.length];
        System.arraycopy(this.Container,0,tempContainer,0,this.Container.length);
        this.Container = (Type[]) new Object[this.Container.length + this.Container.length/2 + 1];
        System.arraycopy(tempContainer,0,this.Container,0,tempContainer.length);
        tempContainer = null;
    }
    public void addObject(Type object){
        // this method will be add element into Container
        this.Container[this.top] = object;
        this.top++;
        if(isFull()) changeSize();
    }
    public void sink(){
    //This will be Sorting while MyList trying to insert element
    }
    public void swim(){
        //This will be Sorting while MyList will delete any element
    }
}
