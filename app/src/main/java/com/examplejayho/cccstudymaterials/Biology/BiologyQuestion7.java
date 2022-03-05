package com.examplejayho.cccstudymaterials.Biology;

public class BiologyQuestion7 {
    public String[][] mChoices = {new String[]{"F5", "Shift + F5", "Ctrl + F", "None"}, new String[]{"Central Alignment", "Left Alignment", "Right Alignment", "Justify Alignment"}, new String[]{".Ist", ".wrt", ".ods", ".odp"}, new String[]{"Slide pane", "Slide Sorter View", "Both A and B", "None of these"}, new String[]{"Pageup", "Pagedown", "Home", "End"}, new String[]{"Spreadsheet", "Word Processing", "Presentation", "None of these"}, new String[]{"View", "Insert", "Slide show", "Format"}, new String[]{"Pageup", "Pagedown", "Home", "End"}, new String[]{"5%", "15%", "10%", "20%"}, new String[]{"Calc", "Impress", "Writer", "None"}};
    public String[] mCorrectAnswer = {"F5", "Justify Alignment", ".odp", "Both A and B", "Home", "Presentation", "View", "Pagedown", "5%", "Impress"};
    public String[] mQuestion = {"Which shortcut key is used to run presentation in Libreoffice Impress?", "Which alignment is not available on LibreOffice Impress?", "Which extension is associated with the LibreOffice Impress File?", "Which of the following you can use to organize or shorten slides?", "Which shortcut key is used to jump at the first slide?", "What kind of program is LibreOffice Impress?", "In LibreOffice Impress slide sorter is found in which menu?", "What is the shortcut key to the next slide?", "How much is the minimum zoom size in LibreOffice Impress?", "What is a presentation in the libreOffice?"};

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
