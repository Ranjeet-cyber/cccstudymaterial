package com.examplejayho.cccstudymaterials.Geo;

public class GeoQuestion7 {
    public String[][] mChoices = {new String[]{"Management of the processor", "Management of the input/output", "Management of the memory", "All of the above"}, new String[]{"Delete", "Shift + Delete", "Right click - Delete", "None"}, new String[]{"By operating system", "By compiler", "By interpreter", "By application software"}, new String[]{"combination of computer hardware", "program which translates from high-level language to another", "program which translates from one high-level to a machine level", "None of these"}, new String[]{"Simultaneous processing with two or more processes", "Simultaneous running of two or more programs", "Running of two or more processes", "None of the above"}, new String[]{"NOD32", "Avast", "AVG", "AMG"}, new String[]{"Press Delete Key", "Press Shift + Delete Key", "Press Ctrl + Delete Key", "Press Alt + Delete Key"}, new String[]{"Computer Program", "Algorithm", "Flowchart", "Utility Program"}, new String[]{"mv", "cp", "ipr", "Pt"}, new String[]{"Text Select", "Paste", "Bold", "None"}};
    public String[] mCorrectAnswer = {"All of the above", "Shift + Delete", "By operating system", "program which translates from one high-level to a machine level", "Simultaneous processing with two or more processes", "AMG", "Press Shift + Delete Key", "Computer Program", "ipr", "Text Select"};
    public String[] mQuestion = {"Operating System is responsible for", "What do you use to direct delete a file so that the file is not stored in the recycling bin?", "BIOS is used?", "A Compiler is _______", "Multiprocessing means", "Which of the following is not antivirus software?", "How to delete files from the Recycle bin without storing in it?", "The list of coded instructions is called?", "Which command is used to get a print of a file in Unix?", "What will you do first with Cut, Copy?"};

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
