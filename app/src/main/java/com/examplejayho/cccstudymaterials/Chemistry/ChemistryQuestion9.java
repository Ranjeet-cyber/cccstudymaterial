package com.examplejayho.cccstudymaterials.Chemistry;

public class ChemistryQuestion9 {
    public String[][] mChoices = {new String[]{"Ctrl + F2", "Ctrl + F4", "Ctrl + F3", "None of these"}, new String[]{"File name", "Location where the file is to be saved", "Both A and B", "None of these"}, new String[]{"Ctrl + Shift + V", "Ctrl + V", "Ctrl + Alt + V", "Shift + V"}, new String[]{"Shift + F3", "Ctrl + F2", "Ctrl + F3", "Alt + F3"}, new String[]{"7,2", "7+2", "9", "5,7"}, new String[]{"Print View", "Print Preview", "Print Screen", "Print Document"}, new String[]{"300%", "200%", "400%", "500%"}, new String[]{"Cell", "Table", "Position", "Data"}, new String[]{"Ctrl + W", "Ctrl + Q", "Ctrl + Shift + C", "Shift + W"}, new String[]{"Instant messaging, address book, antivirus, mailing list", "Forms, data analysis, conditional formatting, sorting and filtering", "Graphics, templates, spell checker, thesaurus", "Accessibility, multimedia, hyperlinks, updated"}};
    public String[] mCorrectAnswer = {"Ctrl + F2", "Both A and B", "Ctrl + Shift + V", "Ctrl + F2", "9", "Print Preview", "400%", "Cell", "Ctrl + W", "Forms, data analysis, conditional formatting, sorting and filtering"};
    public String[] mQuestion = {"Which shortcut key is used to insert function in LibreOffice calc?", "When we select Save As options in Calc which information will ask in dialog box?", "Which shortcut key is used for Paste Special in LibreOffice Calc?", "Which shortcut is used to insert function in LibreOffice Calc?", "What is the result of the formula = MAX (B1: B3) + MIN (B1: B3)? Where B1 = 5, B2 = 2, B3 = 7", "Before printing we see the document on screen, what is called this process?", "The maximum Zoom % in LibreOffice Calc is?", "What is the intersection of rows and columns in LibreOffice Calc?", "Which shortcut key is used to exit from Worksheet in LibreOffice Calc?", "Which of the following are the features of spreadsheet software?"};

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
