package com.examplejayho.cccstudymaterials.History;

public class HistoryQuestion8 {
    public String[][] mChoices = {new String[]{"CTRL + F12", "ALT + DELETE", "CTRL + DELETE", "TAB + DELETE"}, new String[]{"Spreadsheet", "Text files", "MySQL", "CSV file"}, new String[]{"portrait", "landscape", "book", "None of the above"}, new String[]{"Setting margins", "Find and replace", "Setting header and footer", "Page orientation"}, new String[]{"replaces the current document", "leaves the current document intact", "is not possible", "closes the document"}, new String[]{"Ctrl + U", "Shift + U", "Ctrl + I", ") Shift + I"}, new String[]{"Bold", "Superscript", "Underline", "Subscript"}, new String[]{"Find", "Find and Replace", "Spell check", "Spelling and grammar check"}, new String[]{"Landscape", "Portrait", "Indent", "Tab setting"}, new String[]{"In the recycle bin", "Taskbar", "Clipboard", "None of these"}};
    public String[] mCorrectAnswer = {"CTRL + F12", "MySQL", "portrait", "Find and replace", "leaves the current document intact", "Ctrl + I", "Subscript", "Find and Replace", "Landscape", "Clipboard"};
    public String[] mQuestion = {"Which shortcut key is used to insert table?", "Which of the following is not valid type of data source in mail merge?", "The default orientation of a page in Writer is", "Which of the following does not come under page formatting?", "Saving an existing document with some other name using the Save As option____", "Keyboard shortcut to italicise the selected text is", "Which option should be used to type H2O, to get 2 at its proper place?", "What option should be used to to change the word ‘Books’ to the word ‘Copies’ in a document?", "What is the option to print the document so that the height of the page is less than its width?", "Where is the text saved when cut and copied?"};

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
