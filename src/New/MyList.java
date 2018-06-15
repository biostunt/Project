package New;

public class MyList<Key,Value> {
    private Object[] Container = new Object[10];
    private int top = 0;
    private Key searchKey;
    private Value searchValue;
    private int Sorting;
    public MyList(int sorting){
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
        Object[] tempContainer = new Object[this.Container.length];
        if(this.Sorting != 0) Sort();
        System.arraycopy(this.Container,0,tempContainer,0,this.Container.length);
        this.Container = new Object[this.Container.length + this.Container.length/2 + 1];
        System.arraycopy(tempContainer,0,this.Container,0,tempContainer.length);
        tempContainer = null;
    }
    public void addObject(Object object){
        // this method will be add element into Container
        this.Container[this.top] = object;
        this.top++;
        if(isFull()) changeSize();
    }
    public Object deleteObject(Key key){
        for (int i = 0; i < this.Container.length ; i++) {
            if(this.Container[i].getKey() == key){
                shift(i);
                return this.Container[i];
            }
        }
        return new Object<String,String>("--no--","--no--");
    }
    public int getSize(){ return this.top;}
    private void shift(int index){
        for (int i = index; i < this.Container.length -1 ; i++) {
            this.Container[i] = this.Container[i+1];
        }
    }
    private void Sort(){
        for (int i = 0; i < this.Container.length/2 ; i++) {
            if(this.Sorting == 1){
                for (int j = i; j <this.Container.length - i ; j++) {
                    if(this.Container[i].getKeySize() >= this.Container[j].getKeySize()){
                        Object temp = this.Container[i];
                        this.Container[i] = this.Container[j];
                        this.Container[j] = temp;
                    }
                    if(this.Container[this.Container.length - i - 1].getKeySize() <= this.Container[j].getKeySize()){
                        Object temp = this.Container[this.Container.length - i - 1];
                        this.Container[this.Container.length - i - 1] = this.Container[j];
                        this.Container[j] = temp;
                    }
                }
            }
            if(this.Sorting == -1){
                for (int j = i; j <this.Container.length - i ; j++) {
                    if(this.Container[i].getKeySize() <= this.Container[j].getKeySize()){
                        Object temp = this.Container[i];
                        this.Container[i] = this.Container[j];
                        this.Container[j] = temp;
                    }
                    if(this.Container[this.Container.length - i - 1].getKeySize() >= this.Container[j].getKeySize()){
                        Object temp = this.Container[this.Container.length - i - 1];
                        this.Container[this.Container.length - i - 1] = this.Container[j];
                        this.Container[j] = temp;
                    }
                }
            }
        }
    }


}
