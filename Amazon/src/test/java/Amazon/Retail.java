package Amazon;
        import CommonAPI.Base;
        import org.openqa.selenium.By;
        import org.openqa.selenium.Keys;
        import org.testng.annotations.Test;



/**
 * Created by Bijan Samiyi on 12/30/2015.
 */

public class Retail extends Base {
    @Test
    public void home(){
        typeByCss("#twotabsearchtextbox", "Dominique o'Brien");
    }
}



