import java.util.Arrays;

public class MyArrayList<E>  {
    private Object[] value;
    private int size = 0;

    public MyArrayList() {
        value=new Object[10];
    }
    public void ensureCapacity(){
        if(size==value.length){
             Arrays.copyOf(value, value.length*2);
            }
        }
        //так себе метод - чисто для пустой коллекции
    public void add(E value){
        ensureCapacity();
        this.value[size++]=value;
    }
    public void add(E value, int index){
        ensureCapacity();
        this.value[index]=value;
        size++;
    }
    public void remove(int index) {
        if (index > -1 && index < value.length) {
            value[index] = null;
            size--;
        } else {
            System.out.println("IndexOutOfBounds");
        }
    }
    public void clear(){
        for(Object o:value){
            o=null;
        }
        size=0;
    }
    public int size(){
        return size;
    }
    public E get(int index){
        if (index > -1 && index < value.length) {
            return (E)value[index];
        } else {
            System.out.println("IndexOutOfBounds");
            return null;
        }
    }
    }


