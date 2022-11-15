package pro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileClass {

    private File file;
    private String dir;
    private String fileName;

    public FileClass() {
        file = new File("d:\\");
    }

    public FileClass(String dir,String fileName) {
        file = new File("d:\\" + dir + "\\" + fileName+".txt");
        this.dir = "d:\\" + dir;
        this.fileName = fileName +".txt";
    }



    // 파일명이 있는지 확인하기
    public boolean check(File file) {
        if(file.exists()) {
            return true;
        }
        return false;
    }

    // creat
    public void create() throws Exception{
        boolean exist = check(file);
        if(exist) {
            file.delete();
            file.createNewFile();
        }
        else {
            file = new File(dir);
            file.mkdirs();
            file = new File(dir+"\\" + fileName);
            file.createNewFile();
        }
    }



    // read
    public void read() throws Exception{
        boolean exist = check(file);
        if(exist) {
            FileReader fr = new FileReader(file);
            BufferedReader bw = new BufferedReader(fr);
            String str;
            while((str = bw.readLine()) != null ){
                System.out.println(str);
            }
            bw.close();
        }else {
            System.out.println("읽을 파일이 없습니다.");
        }

    }


    // write

    public void write(String str) throws Exception{
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(str);
        fw.close();

    }

}

// memberDAO 랑 연결해서 사용하기

// 만들 메소드
// creatfile
// read
// write