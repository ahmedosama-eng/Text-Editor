
package text_editor_project;

public class node {
    String line;
    node next;
    
    node(String l , node n)
    {
        this.line = l;
        this.next = n;
    }
}
