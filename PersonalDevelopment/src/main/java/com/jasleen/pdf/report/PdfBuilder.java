package com.jasleen.pdf.report;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfWriter;

public class PdfBuilder extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> arg0, Document arg1, PdfWriter arg2, HttpServletRequest arg3,
			HttpServletResponse arg4) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
/*
private static PdfPTable headerTable_Main() throws DocumentException {
    PdfPTable table = new PdfPTable(7);
    table.setWidthPercentage(100);
    table.setWidths(new int[] { 20, 40, 10, 10, 10, 10, 10 });
    PdfPCell cell = new PdfPCell();
    for (int tblrow = 1; tblrow <= 3; tblrow++) {
        StringMethods cellHead1 = "";
        StringMethods cellHead2 = "";
        StringMethods cellHead3 = "";
        StringMethods cellHead4 = "";
        StringMethods cellHead5 = "";
        StringMethods cellHead6 = "";
        StringMethods cellHead7 = "";
        if (tblrow == 1) {
            cellHead1 = "Project : ACE";
            cellHead2 = "";
            cellHead3 = "Legend:";
            cellHead4 = "AB = Absent";
            cellHead5 = "R = Rest Day";
            cellHead6 = "O = Off Day";
            cellHead7 = "H = Holi Day";
        } else if (tblrow == 2) {
            cellHead1 = "CLIENT : DOPMO";
            cellHead2 = "";
            cellHead3 = "";
            cellHead4 = "AL = Annual Leave";
            cellHead5 = "EL = Emg Leave";
            cellHead6 = "L1 = ";
            cellHead7 = "L2 = ";
        } else {
            cellHead1 = "Period : ";
            cellHead2 = "";
            cellHead3 = "";
            cellHead4 = "";
            cellHead5 = "";
            cellHead6 = "";
            cellHead7 = "";
        }

        for (int i = 1; i <= 7; i++) {
            if (i == 1) {
                cell = new PdfPCell(new Phrase(cellHead1, headerBold));
                cell.setHorizontalAlignment(Element.ALIGN_LEFT);
            } else if (i == 2) {
                cell = new PdfPCell(new Phrase(cellHead2, headerBold));
                cell.setHorizontalAlignment(Element.ALIGN_LEFT);
            } else if (i == 3) {
                cell = new PdfPCell(new Phrase(cellHead3, headerBold));
                cell.setHorizontalAlignment(Element.ALIGN_LEFT);
            } else if (i == 4) {
                cell = new PdfPCell(new Phrase(cellHead4, headerBold));
                cell.setHorizontalAlignment(Element.ALIGN_LEFT);
            } else if (i == 5) {
                cell = new PdfPCell(new Phrase(cellHead5, headerBold));
                cell.setHorizontalAlignment(Element.ALIGN_LEFT);
            } else if (i == 6) {
                cell = new PdfPCell(new Phrase(cellHead6, headerBold));
                cell.setHorizontalAlignment(Element.ALIGN_LEFT);
            } else {
                cell = new PdfPCell(new Phrase(cellHead7, headerBold));
                cell.setHorizontalAlignment(Element.ALIGN_LEFT);
            }
            if (i <= 3 || tblrow == 3) {
                cell.setBorderWidthRight(0);
                cell.setBorderWidthLeft(0);
                cell.setBorderWidthTop(0);
                cell.setBorderWidthBottom(0);
                cell.setBorderColorBottom(BaseColor.WHITE);
                cell.setBorderColorLeft(BaseColor.WHITE);
                cell.setBorderColorRight(BaseColor.WHITE);
                cell.setBorderColorTop(BaseColor.WHITE);
            }
            cell.setBackgroundColor(BaseColor.WHITE);
            cell.setFixedHeight(8);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setUseAscender(true);
            table.addCell(cell);
        }
    }

    return table;
}*/