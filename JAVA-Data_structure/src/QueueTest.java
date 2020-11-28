import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/*
* 队列操作：项目需求
*
* 高并发的业务操作，需要同时处理多个用户的请求（抢购系统）
*       问题： 后端的程序不能及时的处理所有的用户请求
*      缓冲操作：将用户的请求排队存放（有顺序的存放），让后台系统逐个处理
*       思考：使用什么样技术实现起来更加有好？
* 可以使用普通集合实现
*       提高效率，使用多线程操作，普通集合存在并发问题需要处理
* 可以使用线程安全的集合
*       使用多线程的情况下，完成高效的操作
*       处理完每个请求之后，需要删除对应的 数据请求
* 可以使用队列操作（线程安全）
*        既能保证多线程情况下的高效率处理
*        能保证每个请求处理之后自动删除
*
*        保存每个抢购请求时 入列操作 offer（url）
*        处理每个请求抢购请求时   出列操作 poll（）
* */
public class QueueTest {
    public static void main(String[] args) {

        //声明一个队列：储存3个数据
        Queue<String> msg = new ArrayBlockingQueue<String>(3);

        msg.add("shy");//Collections集合方法

        msg.offer("加油");

        msg.element();//查询队列首位置的第一个数据：不删除

        msg.poll();//查询并删除队首位置的第一个数据：head/front

        msg.size();//Collections集合的方法，查询队列中的所有数据总数
    }
}
