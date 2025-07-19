interface Document{
    void print();
}
class Worddocument implements Document{
     @Override
     public void print(){
        System.err.println("worddocument is ready to print");
    }
}
class PdfDocument implements Document{
    @Override
    public void print(){
        System.out.println("pdfDocument is ready");
    }
}
class Exceldocument implements  Document{
    @Override
    public void print(){
        System.out.println("exceldocument is ready");
    }
}
abstract class Documentfactory{
    public abstract Document createDocument();
}
class Worddocumentfac extends Documentfactory{
    @Override
    public Document  createDocument(){
        return new Worddocument();
    } 
}
class PdfDocumentfac extends Documentfactory{
    @Override
    public Document createDocument(){
        return new PdfDocument();
    }
}
class Excelfac extends Documentfactory{
    @Override
    public Document createDocument(){
        return new Exceldocument();
    }
}
 public class Factorypattern{
   public static void main(String[] args) {
    Documentfactory word = new Worddocumentfac();
    Document word1 = word.createDocument();
    word1.print();

    Documentfactory pdf = new PdfDocumentfac();
    Document pdf2 = pdf.createDocument();
    pdf2.print();

    Documentfactory xl = new Excelfac();
    Document xl2= xl.createDocument();
    xl2.print();
   }

    
}