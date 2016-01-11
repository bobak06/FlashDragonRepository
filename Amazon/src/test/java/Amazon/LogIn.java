package Amazon;

import CommonAPI.Base;
import org.testng.annotations.Test;

/**
 * Created by Bijan Samiyi on 1/4/2016.
 */
public class LogIn extends Base {
    @Test
    public void test(){
        typeByCss("#email", "bsamiyi0@ivc.edu");
    }

}
