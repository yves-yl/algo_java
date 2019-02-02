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

    public boolean contains(E e){
        for(int i = 0; i < size; ++i){
            if(e == data[i])
                return true;
        }

        return  false;
    }

    public int find(E e){

        for(int i = 0; i < size; ++i){
            if(e == data[i])
                return i;
        }

        return  -1;

    }

    public E remove(int index){

        if(index < 0 || index >= size)
            throw  new IllegalArgumentException("Array::remove failed,index is illegal");

        E e = data[index];
        for (int i = index; i < size-1; ++i){

            data[i] = data[i+1];
        }

        --size;
        if ( size == data.length/4 && size/2 != 0){
            resize(size/2);
        }
        return e;
    }

    public E removeFirst(){

        return remove(0);

    }
    public E removeLast(){

        return remove(size-1);

    }

    public void removeElement(E e){

        int index = find(e);
        if(-1 != index)
            remove(index);



    }

    public E get(int index){

        if(index < 0 || index >= size)
            throw  new IllegalArgumentException("Array::get failed,index is illegal");

        return data[index];
    }

    public void set(int index,E e){

        if(index < 0 || index >= size)
            throw  new IllegalArgumentException("Array::get failed,index is illegal");

         data[index] = e;
    }


    private void resize(int newCap){

        E[] newData = (E[]) (new Object[newCap]);
        for(int i =0;i< size;++i){
            newData[i] = data[i];
        }

        data = newData;

    }

    public void add(int index, E e){


        if(index < 0 || index > data.length)
            throw  new IllegalArgumentException("Array::add failed,index is illegal");
        if(size == data.length){

            resize(2 * data.length);
        }

        for(int i = size-1;i >= index;--i){

            data[i+1] = data[i];

        }
        ++size;
        data[index] = e;

    }
    public void addFirst(E e){

        add(0,e);

    }

    public void addLast(E e){

        add(size,e);

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
