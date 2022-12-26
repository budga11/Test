
import java.util.*;
public class Test3 {
    public void string(){
        String write = "Quality Choice of today";
        char[] strArr = write.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < strArr.length; i++) {
            if ((strArr[i] != ' ') && (strArr[i] != '\t')) {
                sb.append(strArr[i]);
            }
        }
        String noSpaceStr2 = sb.toString();
        System.out.println(noSpaceStr2);

    }

   public static void main(String[] args) {
       Test3 t=new Test3();
       t.string();


    }
}