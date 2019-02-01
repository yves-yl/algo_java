public class Array<E> {

    private  E[] data;
    private int size ;
    public Array(int cap){

        data = (E[]) (new Object[cap]);
        size = 0;

    }
    public Array(){

        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCap() {
        return data.length;
    }

    public boolean isEmpty(){

        return size == 0;

    }


    public void addLast(E e){

        if(size == data.length)
            throw  new IllegalArgumentException("Array::addLast failed,Array is full");

        data[size] =e;
        ++size;

    }

    public void add(int index, E e){

        if(size == data.length)
            throw  new IllegalArgumentException("Array::add failed,Array is full");
        if(index < 0 || index > data.length)
            throw  new IllegalArgumentException("Array::add failed,index is illegal");


        for(int i = size-1;i >= index;--i){

            data[i+1] = data[i];

        }
        ++size;
        data[index] = e;



    }


    @Override
    public String toString(){

        StringBuilder buf = new StringBuilder();
        buf.append(String.format("Array size = %d, cap = %d\n",size,data.length));
        buf.append("[");
        for(int i = 0 ;i <size; ++i){
            buf.append(data[i]);
            if(i != (size - 1))
                buf.append(",");
        }
        buf.append("]");
        return buf.toString();
    }

}
