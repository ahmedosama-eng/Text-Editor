
package text_editor_project;

import javax.swing.JOptionPane;

public class linked_list{
    file_class f = new file_class();
    node head;
    node last;
    int length ;
    public linked_list(node h) {
        // This is Peshawar on the first ingredient
        this.head = h ;
        this.last = h;
        length = -1;
    }
    
    public void push(node newnode)
    {
        if(length == -1)
        {
            head = last = newnode;
            newnode.next = null;
        }
        else
        {
            last.next = newnode;
            last = newnode;
            newnode.next = null;
        }
        f.write_text(newnode.line);
        length = length + 1;
    }
    
    public void push_at_position(int pos , node newnode)
    {
        node cur = head;
        node pre = null;
        int i=0;
        while(i!=pos)
        {
            pre = cur;
            i++;
            cur = cur.next;
        }
        pre.next = newnode;
        newnode.next = cur;
    }
    
    public String getline(int pos)
    {
        node cur = head;
        int i=0;
        while(i!=pos)
        {
            i++;
            cur = cur.next;
        }
        return cur.line;
    }
     public String get_last_line()
    {
        node cur = last;
        
        return cur.line;
    }
    
    
    public void delete(int position)
    {
        node cur = head;
        node pre = null;
        int i=0;
        while(i!=position)
        {
            pre = cur;
            i++;
            cur = cur.next;
        }
        pre.next = cur.next;
    }
    
    public void update(int p , String newline )
    {
        node cur = head;
        int i=0;
        while(i!=p)
        {
            i++;
            cur = cur.next;
        }
        cur.line = newline;
    }
    
    public void search_words(String word)
    {
        //find all
        try{
            node cur = head;
            while(true)
            {
                if(cur.line.contains(word))   
                {
                    System.out.println( word +  " is Exist in line " + cur.line);
                }
                else if(cur == null)
                    break;
                cur = cur.next;
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        // Notice :::::---->>>>>   This Function word but show error after print lines which contain on word..
    }
    
    public void find_replace(String old_word , String new_word)
    {
        
    }
    
    public void show()
    {
        node n = head;
        while(n!=null)
        {
            System.out.println(n.line);
            n = n.next;
        }
    }
    
}
