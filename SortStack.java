package stack;

public class SortStack {

    public Object[] data;   // 数组表示栈内元素
    public int maxSize;     // 栈空间大小
    public int top;         // 栈顶指针(指向栈顶元素)

    /**
     * 初始化栈的长度
     * @param initialSize
     */
    public SortStack(int initialSize){
        if(initialSize>=0){
            this.data=new Object[initialSize];
            this.maxSize=initialSize;
            this.top=-1;
        }
        else{
            System.out.println("栈初始化失败!");
        }
    }

    /**
     * 判断栈是否为空
     * @return
     */
    public boolean isEmpty(){
        return top == -1 ? true : false;
    }

    /**
     * 判断是否栈满
     * @return
     */
    public boolean isFull(){
        return top == maxSize-1 ? true : false;
    }

    /**
     * 入栈操作
     * 先判断是否栈满
     * @param value
     */
    public void push(Object value){
        if(!isFull()){
            System.out.print(value+"入栈   ");
            data[++top]=value;
        }
        else{
            System.out.println("满栈，无法进行入栈操作!");
        }
    }

    /**
     * 出栈操作
     * 先判断是否为空栈
     * @return
     */
    public Object pop(){
        Object num=null;
        if(!isEmpty()){
            num = data[top--];
            return num;
        }
        else{
            return "空栈，无法进行出栈操作!";
        }

    }

    /**
     * 获取栈顶元素
     * @return
     */
    public Object getPeek(){
        if(top>=0){
            return data[top];
        }
        else{
            return "栈顶指针为空，无栈顶元素!";
        }
    }

    /**
     * 打印栈内元素
     */
    public void displayStack(){

        // 栈顶指针不为—1，栈内有元素，进行打印
        if(top>=0){
            for(int i=top;i>=0;i--){
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
        else{
            System.out.println("栈内元素为空！");
        }       
    }

    /**
     * 获取栈顶指针为n的栈内元素
     * @param n
     * @return
     */
    public Object getPeekN(int n){
        if(n<top){
            return data[n];
        }
        else{
            return "error";
        }
    }


}
