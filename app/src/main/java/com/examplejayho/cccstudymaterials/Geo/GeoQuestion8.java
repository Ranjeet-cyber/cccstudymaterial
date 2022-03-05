package com.examplejayho.cccstudymaterials.Geo;

public class GeoQuestion8 {
    public String[][] mChoices = {new String[]{"Command Resources", "Manage Resources", "Provide Utilities", "Be user friendly"}, new String[]{"command line interface", "graphical user interface", "batch interface", "device interface"}, new String[]{"Batch system", "Quick response system", "Real time system", "Time sharing system"}, new String[]{"Mac OS", "Fedora", "MS-DOS", "Android"}, new String[]{"Corel Draw", "Wordstar", "EXCEL", "MS-WORD"}, new String[]{"Which directly understood by a computer", "Which needs to be translated", "Which uses mnemonics", "In which programs are written first"}, new String[]{"Scheduling", "Caching", "Swapping", "Spooling"}, new String[]{"Mozilla Firebox", "IE", "Opera", "None of These"}, new String[]{"UNIX", "LISP", "BASIC", "JAVA"}, new String[]{"Power & Sleep", "Sound Settings", "Notifications", "Display Settings"}};
    public String[] mCorrectAnswer = {"Manage Resources", "graphical user interface", "Real time system", "MS-DOS", "EXCEL", "Which directly understood by a computer", "Swapping", "Opera", "UNIX", "Display Settings"};
    public String[] mQuestion = {"The primary job of the operating system of a computer is to ____.", "Windows explorer program are", "The operating system that reads and reacts in terms of actual time is", "Which of the following is not UNIX based?", "Which of the following is a spreadsheet package?", "Machine language is a language", "Moving process from a main memory to a disk is called?", "Which browser comes with Linux by default", "Which of the following is not a programming language?", "Which system settings allow you to change the screen’s resolution?"};

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
