package com.examplejayho.cccstudymaterials.History;

public class HistoryQuestion10 {
    public String[][] mChoices = {new String[]{"Ctrl + ]", "Shift + ]", "Ctrl + Alt + ]", "None"}, new String[]{"Ctrl + Enter", "Shift + Enter", "Enter", "None"}, new String[]{"Ctrl + K", "Ctrl + H", "Ctrl + L", "None"}, new String[]{"Ctrl + 1", "Ctrl + 2", "Ctrl + 3", "None"}, new String[]{"Ctrl + R", "Shift + R", "Ctrl + Shift + R", "None"}, new String[]{"Desktop", "Documents", "Download", "All of the above"}, new String[]{"20", "10", "5", "15"}, new String[]{".txt", ".doc", ".odt", ".csv"}, new String[]{"1", "1.5", "2", "2.5"}, new String[]{"F1", "F2", "F4", "F3"}};
    public String[] mCorrectAnswer = {"Ctrl + ]", "Ctrl + Enter", "Ctrl + K", "Ctrl + 2", "Ctrl + R", "Documents", "20", ".csv", "1", "F1"};
    public String[] mQuestion = {"What shortcut key is used to increase font size?", "What is the shortcut key to break a page in LibreOffice Writer?", "What is the shortcut key for a hyperlink in LibreOffice Writer?", "Which shortcut key is used for heading 2 in LibreOffice Writer", "What is the shortcut key for right alignment in LibreOffice Writer?", "What is the default location of Save File in LibreOffice?", "What is the minimum Zoom percentage in LibreOffice writer?", "Which of the following file extensions is not related to Open Office Writer?", "What is the default line spacing in LibreOffice writer", "Which key do you have to press to get help in LibreOffice Writer?"};

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
