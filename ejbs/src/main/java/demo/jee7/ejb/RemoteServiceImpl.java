package demo.jee7.ejb;

/**
 * Created by li on 28.06.2015.
 */
public class RemoteServiceImpl implements RemoteService {
    public int addition(int op1, int op2) {
        return op1 + op2;
    }
}
