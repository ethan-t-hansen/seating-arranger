package com.seatarr;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataParser {

    public DataParser() {};

    private Object getCellValue(Cell cell) {

        switch (cell.getCellType()) {

            case STRING:
                return cell.getStringCellValue();

            case BOOLEAN:
                return cell.getBooleanCellValue();

            case NUMERIC:
                return cell.getNumericCellValue();
        }

        return null;
    }

    public HashSet<Person> readDataFromExcelFile(String excelFilePath)
            throws IOException {

        HashSet<Person> attendees = new HashSet<Person>();

        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

        Workbook workbook = new XSSFWorkbook(inputStream);

        Sheet firstSheet = workbook.getSheetAt(0);

        Iterator<Row> iterator = firstSheet.iterator();

        iterator.next();

        while (iterator.hasNext()) {

            Row nextRow = iterator.next();

            Iterator<Cell> cellIterator = nextRow.cellIterator();

            Person p = new Person();

            while (cellIterator.hasNext()) {
                Cell nextCell = cellIterator.next();
                int columnIndex = nextCell.getColumnIndex();

                // Switch-case
                switch (columnIndex) {

                    // Case 1 - Full name column
                    case 2:
                        p.setName((String) getCellValue(nextCell));
                        break;

                    // Case 2 - Likes column
                    case 3:
                        p.setLikes((String) getCellValue(nextCell));
                        break;

                    // Case 3 - Dislikes column
                    case 4:
                        p.setDislikes((String) getCellValue(nextCell));
                        break;
                }
            }
            attendees.add(p);
        }

        workbook.close();
        inputStream.close();

        return attendees;
    }

}