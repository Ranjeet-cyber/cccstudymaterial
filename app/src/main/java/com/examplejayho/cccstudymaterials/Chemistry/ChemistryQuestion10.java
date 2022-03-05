package com.examplejayho.cccstudymaterials.Chemistry;

public class ChemistryQuestion10 {
    public String[][] mChoices = {new String[]{"200", "300", "00", "2.75"}, new String[]{"Ctrl + C", "Ctrl + M", "Ctrl + Shift + M", "None"}, new String[]{"Relative address", "Absolute address", "Mixed address", "Dynamic address"}, new String[]{"Sorting", "Searching", "Filtering", "Validating"}, new String[]{"400", "6.25", "7", "500"}, new String[]{"Format", "Style", "Sheet", "Edit"}, new String[]{"Ctrl + Shift + B", "Ctrl + Shift + P", "Ctrl + Shift + +", "None of these"}, new String[]{"Chart", "Object", "Shape", "Pie"}, new String[]{"15", "3", "4", "5"}, new String[]{"1", "2", "3", "4"}};
    public String[] mCorrectAnswer = {"300", "Ctrl + M", "Relative address", "Filtering", "400", "Format", "Ctrl + Shift + P", "Shape", "3", "2"};
    public String[] mQuestion = {"Value of ROUND (275, -2) ......?", "In LibreOffice Calc or Writer, specify the shortcut key for Clear Format?", "If the cell address changes after copying the formula, the address is known as ____?", "Which mechanism is used to filter out unnecessary data in Calc LibreOffice?", "What will be the value of = 10 * 20/4 * 8 in LibreOffice Calc?", "In which menu the Merge Cells command found in LibreOffice Calc?", "What is the shortcut key to superscript in LibreOffice Calc?", "Where are the options like line, curve, Polygon are available?", "What will be the result of the formula = COUNT (B1: B3)? Where B1 = 5, B2 = 4, B3 = 6", "How many types of cell references in LibreOffice Calc?"};

    public String getQuestion(int i) {
        return this.mQuestion[i];
    }

    public String getChoice1(int i) {
        return this.mChoices[i][0];
    }

    public String getChoice2(int i) {
        return this.mChoices[i][1];
    }

    public String getChoice3(int i) {
        return this.mChoices[i][2];
    }

    public String getChoice4(int i) {
        return this.mChoices[i][3];
    }

    public String getCorrectAnswer(int i) {
        return this.mCorrectAnswer[i];
    }
}
