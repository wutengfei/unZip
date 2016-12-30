package cn.cnu.unZip;

import android.os.Environment;
import android.test.AndroidTestCase;

import java.io.File;
import java.io.IOException;

/**
 * Created by dell on 2016/9/20.
 */
public class Test extends AndroidTestCase {
    public void test() {
        File file=new File(Environment.getExternalStorageDirectory()+"/1.zip");
        String path=Environment.getExternalStorageDirectory()+"/test";
        try {
            ZipUtils.upZipFile(file, path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
