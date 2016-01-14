package Stock;



import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import org.dom4j.io.XMLWriter;



/**
 * Created by Нюта on 14.01.2016.
 */
public class Stock {


        private Document d;

        public Stock() {

            d = DocumentHelper.createDocument();
            //d.add(root);

        }



    public Element addElement(Element node) {
           return null;
        }

        public void createDocument() throws IOException {

            Element root = d.addElement("products");
            Element p1 = root.addElement("product").
                    addElement("type").
                    addAttribute("producttype", "orange").
                    addElement("organs");
            addOrgan("Апельсин", 3, p1);
            printDocument(this.d);
           //System.out.println(d.asXML());
        }
    public void addOrgan(String name, int Quantity, Element e) {
            e.addElement("organ").
                    addElement("property").
                    addAttribute("name", name).
                    addAttribute("Quantity", String.valueOf(Quantity));
        }

    public void printDocument(Document d) throws IOException {
        OutputFormat format = OutputFormat.createPrettyPrint();
        XMLWriter writer;
        writer = new XMLWriter(System.out, format);
        writer.write(d);
    }

}
