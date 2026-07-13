package Filehandling;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class filehandling {
    
    public static void main(String[] args) throws IOException{
        
        // TO CREATE FILE
        File f = new File("Vedd.txt");
          if (f.createNewFile()) {
            System.out.println("file created");
        } else {
            System.out.println("file already exist..!");
        } 



        // TO DISPLAY FILE INFORMATION
        if(f.exists()){
            System.out.println("file name : " + f.getName());
            System.out.println("file Locattion : " + f.getAbsolutePath());
            System.out.println("is file writeable : " + f.canWrite());
            System.out.println("is file readable : " + f.canRead());
            System.out.println("file size : " + f.length());
            System.out.println("remove file : " + f.delete());

        } else{
            System.out.println("file does not exist");
        }



        // write into a file
        try {
            FileWriter f = new FileWriter("anushka.txt");
            try{
                f.write("LOVE YOU ANUSHKA...!💘💘💘");
            } finally {
                f.close();
            }
            System.out.println("succesfully proposed🦅🦅 in file");
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println(e);
        }

        // buffered writer
        FileWriter fw = new FileWriter("anushka.txt");
        

        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("hello");
        bw.newLine();
        bw.write("java backend");
        bw.close();


        // Print writer
        PrintWriter pw = new PrintWriter("anushka.txt");
        pw.println("Hello");
        pw.println("Hello");
        pw.println("Hello");
        pw.close();



        // read file
        try {
            FileReader r = new FileReader("anushka.txt");
            try{
                int i;
                while ((i=r.read()) != -1) {
                    System.out.print((char)i);
                }
            }finally{
                r.close();
            }
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Exception handeled..!");
        }
    }



        // read by buffer reader class

    try {
            BufferedReader br = new BufferedReader(new FileReader("anushka.txt"));
            try {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } finally {
                br.close();
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            System.out.println(e.getMessage());
        }



        // read file by scanner class
        File myfile = new File("anushka.txt");
        Scanner sc = new Scanner(myfile);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();

        // rename a file
        File f = new File("anushka.txt");
        File r = new File("anushkaproposal.txt");

        if (f.exists()) {
            System.out.println(f.renameTo(r));
        } else {
            System.out.println("file does not exist");
        }

        // delete the file using java.io.File (FileWriter has no delete() method)
        File file = new File("vedd.txt");
        if (file.delete()) {
            System.out.println("file deleted");
        } else {
            System.out.println("failed to delete file");
        }
        

        
        // copy one file data to another
        FileInputStream r = new FileInputStream("anushka.txt");
        FileOutputStream w = new FileOutputStream("alya.txt");

        int i;
        while ((i=r.read())!=-1) {
            w.write((char)i);
        }
        System.out.println("DATA COPIED SUCCESSFULLY");
        r.close();
        w.close();
}