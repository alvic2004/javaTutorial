package hw_arrayList;

public class Ex_arrayList<T> implements List<T> {

    private Object[] arr;
    //private int size;
    private int curPos;

    public Ex_arrayList(int initLength) {
        if (initLength < 0) throw new ArrayIndexOutOfBoundsException("Invalid size of array: " + initLength);
        this.arr = new Object[initLength];
        //this.size = arr.length;
        this.curPos = 0;
    }

    // Метод для расширения массива
    private void extend() {
        Object[] newArr = new Object[2 * arr.length];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }

    @Override
    public void add(T value) {
        if (curPos == arr.length) {
            extend(); // увеличиваем массив в 2 раза
        }
        arr[curPos] = value;
        curPos = curPos + 1;

    }

    @Override
    public void add(T value, int index) {
        if (curPos == arr.length)
            extend(); // увеличиваем массив в 2 раза
        System.arraycopy(arr, index, arr, index + 1, arr.length - (index + 1));
        arr[index] = value;
        curPos = curPos + 1;
    }

    @Override
    public void addAll(List<T> list) {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public void set(T value, int index) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public T remove(T t) {
        return null;
    }


}
