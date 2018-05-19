/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfe;
import java.io.FileOutputStream;
import java.util.Date;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


/**
 *
 * @author info
 */
public class printin {
     private static String FILE = "c:/temp/Certificat thaltha.pdf";
    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
            Font.BOLD);
    private static Font redFont = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.NORMAL, BaseColor.RED);
    private static Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 16,
            Font.BOLD);
    private static Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12,
            Font.BOLD);

    public static void main(String[] args) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(FILE));
            document.open();
            addMetaData(document);
            addTitlePage(document);
            
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // iText allows to add metadata to the PDF which can be viewed in your Adobe
    // Reader
    // under File -> Properties
    private static void addMetaData(Document document) {
        document.addTitle("Certificat rab3a ");
        document.addSubject("Using iText");
        document.addKeywords("Java, PDF, iText");
        document.addAuthor("Dr Zac ");
        document.addCreator(" a wedi goulna eee tbib zachary");
    }

    private static void addTitlePage(Document document)
            throws DocumentException {
        Paragraph preface = new Paragraph();
        // We add one empty line
        addEmptyLine(preface, 1);
        preface.add(new Paragraph("                                                                                                           Date:" + new Date(), smallBold));
        preface.add(new Paragraph("Dr : Mme Marref                                                                                     nom du Patient:", smallBold));
        preface.add(new Paragraph("le code du Dr:                                                                                   Prénom du patient: ", smallBold));
        preface.add(new Paragraph("                                                                                                           Age du Patient:",smallBold)); 
        addEmptyLine(preface, 2);
        // Lets write a big header
        preface.add(new Paragraph("          ______________________________________________________________________________________          ",smallBold));
        preface.add(new Paragraph("                                        _Certificat de                       _                               ",catFont));
        addEmptyLine(preface, 3);
        //contenu Du Certificat 
        preface.add(new Paragraph("a wedi Zac hada rahou basss, kherjouh men Fezdisssss ",smallBold));
        addEmptyLine(preface, 8);

        document.add(preface);
        // Start a new page
        document.newPage();
    }

   
    private static void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }
    
}
