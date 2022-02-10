package Files;

import Collections.Fish;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class main {
    public static void main(String[] args) {

        /*String fileName = "test.txt";
        String fullName = "";
        String dirName = System.getProperty("user.dir");
        fullName = dirName + File.separator + fileName;
        System.out.println("File path: " + fullName);
        File file = new File(fullName);

        if(!file.exists()) {
            try {
                if(file.createNewFile()) {
                    System.out.println("File created");
                }
                else {
                    System.out.println("smth wrong");
                }
            } catch (IOException e) {
                e.printStackTrace();
               // Logger.getLogger(Filetest.class.getName()).
               //         log(Level.SEVERE, null, e);
            }
        }
        else {
            System.out.println("File already exists!");
        }

        String dirname = dirName + "/tmp/user/java/bin";
        File d = new File(dirname);
        d.mkdirs();
        d.deleteOnExit();
        d.getFreeSpace();
        d.getTotalSpace();
        d.setReadOnly();*/



        /*InputStream in = null;
        OutputStream out = null;

        byte[] buffer = null;

        try{
            in = new FileInputStream(new File("test.txt"));
            buffer = new byte[in.available()];
            in.read(buffer);

            File file = new File("outputFile.tmp");
            out = new FileOutputStream(file);
            out.write(buffer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/



        /*try(InputStream in = new FileInputStream("test.txt");
            OutputStream out = new FileOutputStream("output.txt")) {
                byte[] buffer = new byte[in.available()];
                var readBytes = in.read(buffer);
            System.out.println("Read bytes: " + readBytes);
            out.write(buffer);
            }catch (IOException e) {
            e.printStackTrace();
        }*/

       /* FileOutputStream fout = null;
        ObjectOutputStream oout = null;
        try {
            fout = new FileOutputStream("fish.txt");
            Fish fish = new Fish("salmon", 2.5, 180);
            ...
        }*/

        /*String text = "This lines of text should be written in file";
        try(FileInputStream out = new FileInputStream("notes.txt")
            BufferOutputStream bos = new BufferedOutputStream(out)
            ){
                byte[] buffer = text.getBytes();
                bos.write*/



    }
}
