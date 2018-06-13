package com.company;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) throws ParseException {
        String s = "2018-06-08 21:42:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(s);

        Timer t = new Timer();
        t.schedule(new DeleteFolder(),d);
    }
}

class DeleteFolder extends TimerTask{
    public void run(){
        File folder = new File("/Users/mac/Movies/未命名文件夹");
        deleteFolder(folder);
        System.out.println("任务完成");
    }

    public void deleteFolder(File folder) {
        File[] fileArr = folder.listFiles();
        if(folder != null){
            for(File f: fileArr){
                if(f.isDirectory()){
                    deleteFolder(f);
                }else{
                    f.delete();
                }
            }
            folder.delete();
        }
    }
}
