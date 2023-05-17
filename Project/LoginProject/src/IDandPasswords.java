import java.util.HashMap;
import java.util.stream.Stream;

public class IDandPasswords {
    HashMap<String,String> logininfo=new HashMap<String,String>();
    IDandPasswords(){
        logininfo.put("nirendra","nirendra");
        logininfo.put("nnirendra","123456");
        logininfo.put("niru","niren");

    }
    protected HashMap getLoginInfo(){
        return logininfo;
    }

}
