package com.leo.hotfix.demo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import com.leo.hotfix.demo.hotfix.FixDexUtil;

import java.io.File;

public class Splash extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        init();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splash.this, MainActivity.class));
                finish();
            }
        }, 3000);
    }

    /**
     * 启动页遍历，是否有更新文件
     */
    private void init() {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        // 遍历所有的修复dex , 因为可能是多个dex修复包
        File fileDir = externalStorageDirectory != null ?
                new File(externalStorageDirectory, "007") ://SD卡存储
                new File(getFilesDir(), FixDexUtil.DEX_DIR);// 内部存储，data/user/0/包名/files/odex（这个可以任意位置）
        if (!fileDir.exists()) {
            fileDir.mkdirs();
        }
        if (FixDexUtil.isGoingToFix(this)) {
            FixDexUtil.loadFixedDex(this, Environment.getExternalStorageDirectory());
//            Toast.makeText(this, "正在修复。。。。", Toast.LENGTH_SHORT).show();
        }
    }
}
