import java.io.*;
class FileHandling1 {
	public static void main(String args[])throws Exception {   
        int ch, totalChars = 0, words = 1, lines = 1;
        File f1 = new File("abc.txt");
        FileReader fr = new FileReader(f1);
        FileWriter fw = new FileWriter("copyfile.txt");
        while((ch = fr.read()) != -1) {
            if(ch == ' '){
                words++;
            }
            else if(ch == '\n') {
                lines++;
                words++;
                totalChars--;    
            } 
            else {
                totalChars++;
            }
	    fw.write(ch);
	}
        System.out.println("No of Characters: "+totalChars);
		System.out.println("No of Words: "+(words));
		System.out.println("No of Lines: "+(lines));
		fr.close();
		fw.close();
	}
}