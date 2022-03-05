package com.examplejayho.cccstudymaterials.Chemistry;

public class ChemistryQuestion7 {
    public String[][] mChoices = {new String[]{"Sorting", "Inserting", "Filtering", "Deleting"}, new String[]{"1048576 Rows & 16384 Columns", "1048576 Rows & 1024 Columns", "16384 Rows & 1048576 Columns", "1024 Rows & 1048576 Columns"}, new String[]{"1024", "1048576", "16384", "None"}, new String[]{"Ctrl + Shift + F", "Ctrl + Shift + S", "Ctrl + F2", "None"}, new String[]{"Cut, Copy, Paste", "Find and Replace", "Select All", "All of these"}, new String[]{"Cell", "Column", "Row", "Sheet"}, new String[]{"Center", "Split Cells", "Split and merge", "Merge and center"}, new String[]{"F2", "Ctrl + Shift + M", "Ctrl + M", "F3"}, new String[]{"Ctrl + 4", "Ctrl + 3", "Ctrl + 2", "Ctrl + 1"}, new String[]{"Bold, Italics, Underline", "Left, Center, Right, Justify", "Font Name, Font Size, Font Color", "None of These"}};
    public String[] mCorrectAnswer = {"Sorting", "1048576 Rows & 1024 Columns", "1024", "Ctrl + Shift + S", "All of these", "Cell", "Split Cells", "F2", "Ctrl + 1", "None of These"};
    public String[] mQuestion = {"What is called to arrange data in order?", "How many rows and columns in LibreOffice Calc?", "How many numbers of columns in LibreOffice Calc?", "Which shortcut key is used for save as in LibreOffice Calc?", "From the following, which options are available in Edit menu?", "What is the matching point of row and column", "What you use to break (Split) a merged Cell in LibreOffice Calc?", "Which key is used to enable editing the cell?", "Which shortcut key is used to open the Cell Format dialog box in LibreOffice Calc?", "Which options are available on Standard toolbar?"};

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
