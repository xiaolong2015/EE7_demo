package demo.jee7.ejb;

import javax.ejb.Remote;

/**
 * Created by li on 28.06.2015.
 */
@Remote
public interface RemoteService {
    public int addition(int op1, int op2);
}
