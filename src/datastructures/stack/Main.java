package datastructures.stack;

public class Main {
    public static void main(String[] args) {

        Stack st = new Stack(9);

        st.getTop();
        st.printStack();

        System.out.println("--------------push-------");
        st.push(12);
        st.push(14);
        st.printStack();

        System.out.println("--------------pop-------");
        System.out.println(st.pop().value);
        System.out.println(st.pop().value);
        st.printStack();
    }
}
