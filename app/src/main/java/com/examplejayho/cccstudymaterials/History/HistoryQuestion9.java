package com.examplejayho.cccstudymaterials.History;

public class HistoryQuestion9 {
    public String[][] mChoices = {new String[]{"Ctrl + Enter", "Shift + Enter", "Enter", "None of these"}, new String[]{"Ctrl + J", "Ctrl + Shift + J", "Ctrl + L", "Ctrl + R"}, new String[]{"Ctrl + M", "Ctrl + Shift + K", "Ctrl + K", "Ctrl + K + C"}, new String[]{"Ctrl + L", "Ctrl + A", "Ctrl + shift + L", "None"}, new String[]{"Ctrl + R", "Ctrl + Z", "Ctrl + Y", "Ctrl + shift + R"}, new String[]{"Open document format", "Old document format", "Open source document format", "None"}, new String[]{"Ctrl + R", "Ctrl + Shift + R", "Alt + Shift + C", "Window + L + R"}, new String[]{"Redo undo text", "Undo Reduced Text", "Both", "None of these"}, new String[]{"Tools", "Insert", "Format", "Edit Menu"}, new String[]{"9, 96", "6, 69", "7, 72", "11, 96"}};
    public String[] mCorrectAnswer = {"Ctrl + Enter", "Ctrl + J", "Ctrl + K", "Ctrl + L", "Ctrl + Y", "Open document format", "Ctrl + Shift + R", "Redo undo text", "Tools", "6, 69"};
    public String[] mQuestion = {"The shortcut key to page break in LibreOffice Writer?", "What is the shortcut key to justify alignment in LibreOffice Writer?", "What is the shortcut key to hyperlink in LibreOffice Writer?", "Which key is used for left alignment in LibreOffice Writer?", "What is the shortcut to redo in libreOffice writer? ", "Full form of ODF?", "Ruler has shortcut key in libreoffice?", "What happens with Ctrl + Y in Writer?", "In which menu is the word count option found in libraOffice Writer?", "What is the minimum and maximum font size in the libraOffice Writer?"};

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
