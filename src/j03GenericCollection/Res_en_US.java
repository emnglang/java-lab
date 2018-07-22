package j03GenericCollection;

/**
 * File name: Res_en_US.java
 * Author: Jack, at http://bbs.whnet.edu.cn, Java discuss board.
 * Email: greatjava@sina.com
 * Description: Resource file for i18nDemo.java
 */

import java.util.*;

public class Res_en_US extends java.util.ListResourceBundle {
    static final Object[][] contents = new String[][]{
            {"OKText", "OK"},
            {"FontName", "Dialoginput"},
            {"FileMenuText", "File"},
            {"FileExitMenuText", "Exit"},
            {"DialogTitle", "Demo Dialog"}};

    public Object[][] getContents() {
        return contents;
    }
}

class Res_zh_CN extends java.util.ListResourceBundle {
    static final Object[][] contents = new String[][]{
            {"OKText", "确定"},
            {"FontName", "MS Song"},
            {"FileMenuText", "文件"},
            {"FileExitMenuText", "退出"},
            {"DialogTitle", "演示对话框"}};

    public Object[][] getContents() {
        return contents;
    }
}