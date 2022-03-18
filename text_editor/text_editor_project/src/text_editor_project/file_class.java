
package text_editor_project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;


public class file_class {
    FileWriter fw;
    private Scanner x;
    BufferedReader br;
 
    public file_class() {
    }
    public void open_file()
    {
    try
    {
         x=new Scanner(new File("text.txt")); 
    }
    catch(Exception e)
    {
            JOptionPane.showMessageDialog(null, e.getMessage());
    }
    
    
    }
    void write_text(String txt)
    {
        try{
            fw = new FileWriter("text.txt" , true);
            fw.write(txt + '\n');
            fw.close();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    void add_in_pos(int pos , String txt)
    {
        try{
            
            
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    String show_file()
    {
        String line=null;
        
        try{
            x=new Scanner(new File("text.txt")); 
            while(x.hasNext())
            {
                line=line+x.nextLine();
                
                 
               //System.out.print("asasa\n");
             
            }
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

      return line;
      
    }

}
