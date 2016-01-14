package App;


import org.dom4j.Document;
import org.dom4j.DocumentHelper;

import org.dom4j.Element;



/**
 * Created by IT_School on 11.01.2016.
 */
public class DocumentExample {
    private Document d;
    public DocumentExample (){
        d = DocumentHelper.createDocument();
    }
    public Element addElement (Element node){
        return null;
    }
    public void createDocument (){
        Element root = d.addElement("pets");
        Element p1 = root.addElement("pet").
                addElement("type").
                addAttribute("pettype", "cat").
                addElement("organs");
        addOrgan("Hajabaja", 10, p1 );
        System.out.println(d.asXML());
    }

    public void addOrgan(String name, int Quantity, Element e ){
        e.addElement("organ").
                addElement("property").
                addAttribute("name", name).
                addAttribute("Quantity",String.valueOf(Quantity));
    }
}
