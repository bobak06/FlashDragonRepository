package Amazon;

import CommonAPI.Base;
import org.testng.annotations.Test;

/**
 * Created by Bijan Samiyi on 12/30/2015.
 */
public class Home extends Base {
    @Test
    public void home(){

        typeByCss("#twotabsearchtextbox","trump");
    }
}
