package com.leo.hotfix.demo.bug;

import android.content.Context;
import android.widget.Toast;

/**
 * Name: BugClass
 * Author: Leo
 * Comment: Bug示例
 * Date: 2019/7/17 14:49
 * Modify:
 */
public class BugClass {
    public BugClass(Context context) {
        Toast.makeText(context, "这是一个优美的bug！", Toast.LENGTH_SHORT).show();
//        Toast.makeText(context,"你很优秀！bug已修复!",Toast.LENGTH_SHORT).show();

        //将class打包dex文件方法
        //1、进入sdk指定目录
        //2、cmd执行dx命令
        //cd h:\AS_DOCUMENT\Sdk\build-tools\27.0.3
        //dx --dex --output=C:\Users\Leo\Desktop\dex\classes2.dex C:\Users\Leo\Desktop\222
        //路径1：这部分为想要存放dex文件的目录
        //路径2：这部分为当前修复了有bug的class的目录（需要带上完整包名，去除多余class和package）
    }
}
