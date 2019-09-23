package hw_arrayList;

public class Test_ex_arr_list {
    public static void main(String[] args) {

        List<String> ex_arr = new Ex_arrayList<>(10);

        for (int i = 0; i < 25; i++) {
            ex_arr.add("A");

        }


        ex_arr.add("B", 12);

    }
}
