package com.examplejayho.cccstudymaterials.Chemistry;

public class ChemistryQuestion6 {
    public String[][] mChoices = {new String[]{"Chart wizard", "Pie wizard", "Object", "Shap"}, new String[]{"1024", "1048576", "16384", "None of These"}, new String[]{"Calculating result", "Sorting on result", "Filtering on result", "All of these"}, new String[]{"Format", "Style", "Sheet", "Edit"}, new String[]{"32000", "48000", "60000", "None of these"}, new String[]{"Title bar", "Standard Toolbar", "Formatting Toolbar", "Formula Bar"}, new String[]{"Data", "Math / Tring", "Mathematical", "String"}, new String[]{"Sorting", "Searching", "Filtering", "Validating"}, new String[]{"Save As", "Save", "Save File", "Save As File"}, new String[]{"Ctrl + Shift + P", "Ctrl + Shift + O", "Ctrl + P", "None of These"}};
    public String[] mCorrectAnswer = {"Chart wizard", "1024", "All of these", "Format", "None of these", "Standard Toolbar", "Mathematical", "Sorting", "Save As", "Ctrl + Shift + O"};
    public String[] mQuestion = {"Which option is used to insert a chart?", "How many columns does LibreOffice Calc contain?", "What is included in Calc to prepare result analysis and merit list preparation?", "In which menu is the Merge Cells command found in LibreOffice Calc?", "How many seats we can insert in LibreOffice Calc?", "In Calc, most common commands present in which Bar?", "COS, EVEN, FACT, EXP are which categories of functions in LibreOffice Calc?", "What is the name of mechanism to arrange the data in a particular order?", "Which dialog box is open when we click Save As option in file menu?", "Which shortcut key is used for print preview in LibreOffice Calc?"};

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
