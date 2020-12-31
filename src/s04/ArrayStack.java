package s04;

/**
 * @Author Y.Z.Y
 * @Date 2020/12/4 14:30
 * @Description 利用数组实现栈操作。
 *
 */
public class ArrayStack {

    int top;
    int[] stack;

    public ArrayStack(int initialCapacity) {
        if (initialCapacity < 1) {
            throw new IllegalArgumentException("initialCapacity must be > 1.");
        }

        stack = new int[initialCapacity];
        top = -1;
    }

    public static void main(String[] args) {

        ArrayStack arrayStack = new ArrayStack(6);

        int[] a = new int[6];
        int sum = 0;

        a[0] = 2;
        a[1] = 3;

        arrayStack.push(a[0]);
        arrayStack.push(a[1]);

        for (int n=2; n<=5; n++) {
            a[n] = 5*a[n-1] + 3*a[n-2];
            arrayStack.push(a[n]);
        }

        for (int n=5; n>=0; n--) {
            if (n==5){
                int aa = arrayStack.pop();
                System.out.println("a5 的值是： " + aa);
                sum = aa;
            }else {
                int arr = arrayStack.pop();
                sum += arr;
            }
        }

        System.out.println("s5 的值是： " + sum);

    }

    private int pop() {
        if (empty()){
            System.out.println("此栈为空，不能出栈！");
        }
        int topElement = stack[top];
        top--;
        return topElement;
    }

    private boolean empty() {
        return top == -1;
    }

    private void push(int theElement) {
        if (top == stack.length - 1) {
            System.out.println("栈满！");
        }
        stack[++top] = theElement;
        System.out.println("top: " + top);
    }


}
