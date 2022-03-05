package com.examplejayho.cccstudymaterials.History;

public class HistoryQuestion7 {
    public String[][] mChoices = {new String[]{"Insert", "File", "Tools", "Format"}, new String[]{"right", "centre", "left", "middle"}, new String[]{"Page indicator", "Proofing level", "Zoom bar", "Help"}, new String[]{"View", "Edit", "Styles", "File"}, new String[]{"Ctrl+ C", "Ctrl + N", "Ctrl + M", "Ctrl + D"}, new String[]{"Google Docs", "LibreOffice Writer", "Microsoft Word", "All of the above"}, new String[]{"F5 key", "F8 key", "Fl key", "None of the above"}, new String[]{"Auto Text", "Auto Correct", "Auto Complete", "All of the above"}, new String[]{"1 column, 1 row", "2 columns, 1 row", "2 columns, 2 rows", "1 column, 2 rows"}, new String[]{"SHIFT + INSERT", "SHIFT + F7", "CTRL + INSERT", "TAB + INSERT"}};
    public String[] mCorrectAnswer = {"File", "left", "Zoom bar", "Edit", "Ctrl + N", "All of the above", "None of the above", "Auto Correct", "2 columns, 2 rows", "SHIFT + F7"};
    public String[] mQuestion = {"Which menu option has the commands Save, Print and Close?", "On the ______ side of the status bar, you can see page number and word count in LibreOffice", "You can change the magnification of the page (i.e., make it bigger or smaller) using____ option.", "Undo, cut, copy and paste are ___ commands.", "Which shortcut key is used to create a new document?", "Which of the following options are word processors? Select all the correct options", "To find a word in a document we can use which of the following function key?", "Spellings are corrected automatically in Writer because of which of the following features?", "what is the default table size in LibreOffice Writer", "Which shortcut key is used for automatic spell checking?"};

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
