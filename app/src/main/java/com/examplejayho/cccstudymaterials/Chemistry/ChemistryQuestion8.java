package com.examplejayho.cccstudymaterials.Chemistry;

public class ChemistryQuestion8 {
    public String[][] mChoices = {new String[]{"500%", "400%", "350%", "600%"}, new String[]{"Up and Down scroll", "Right and left", "Horizontal and Vertical", "All of above"}, new String[]{"Ctrl + Space", "Shift + Space", "Ctrl + Shift + Page down", "None"}, new String[]{"Function", "Nested Function", "General Function", "Condition Function"}, new String[]{"1", "15", "56", "-1"}, new String[]{"256", "1028", "10000", "None"}, new String[]{"Ctrl + ;", "Shift + D", "Ctrl + D", "Alt + D"}, new String[]{"Ctrl + V", "Ctrl + M", "Ctrl + Shift + F", "Ctrl + 1"}, new String[]{"Ctrl + Shift + C", "Ctrl + C", "Ctrl + Shift + T", "Ctrl + Alt + C"}, new String[]{"10", "3", "7", "1"}};
    public String[] mCorrectAnswer = {"400%", "Up and Down scroll", "Ctrl + Space", "Nested Function", "56", "10000", "Ctrl + ;", "Ctrl + M", "Ctrl + Alt + C", "10"};
    public String[] mQuestion = {"Maximum Zoom in LibreOffice Calc is?", "Which options are available in scroll button on LibreOffice Calc?", "Which shortcut key is used to select the whole row", "Function inside another function known as?", "What will be the value of = Product (7, 8)?", "What is the maximum number of worksheets in LibreOffice Calc?", "Which Shortcut key used for insert the Current Date in LibreOffice?", "Which shortcut key is used to clear the formatting of cells in LibreOffice Calc?", "Which shortcut key is used to insert comment in LibreOffice?", "What will be the value of = product (5,2)?"};

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
