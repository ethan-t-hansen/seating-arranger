package com.seatarr;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
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

    public HashMap<String, Preference> readDataFromExcelFile(String excelFilePath)
            throws IOException {

        HashMap<String, Preference> attendees = new HashMap<String, Preference>();

        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

        Workbook workbook = new XSSFWorkbook(inputStream);

        Sheet firstSheet = workbook.getSheetAt(0);

        Iterator<Row> iterator = firstSheet.iterator();

        iterator.next();

        while (iterator.hasNext()) {

            Row nextRow = iterator.next();

            Iterator<Cell> cellIterator = nextRow.cellIterator();

            String name = "";
            ArrayList<String> likes = new ArrayList<>();
            ArrayList<String> dislikes = new ArrayList<>();

            while (cellIterator.hasNext()) {
                Cell nextCell = cellIterator.next();
                int columnIndex = nextCell.getColumnIndex();

                // Switch-case
                switch (columnIndex) {

                    // Case 1 - Full name column
                    case 2:
                        name = (String) getCellValue(nextCell);
                        break;

                    // Case 2 - Likes column
                    case 3:
                        likes = stringToArrayList((String) getCellValue(nextCell));
                        break;

                    // Case 3 - Dislikes column
                    case 4:
                        dislikes = stringToArrayList((String) getCellValue(nextCell));
                        break;
                }
            }
            Preference p = new Preference(likes, dislikes);
            attendees.put(name, p);
        }

        workbook.close();
        inputStream.close();

        return attendees;
    }

    public ArrayList<String> stringToArrayList(String list) {
        
        List<String> asList = Arrays.asList(list.split("\\s*,\\s*"));

        ArrayList<String> arrlist = new ArrayList<String>(asList);

        return arrlist;
        
    }

}