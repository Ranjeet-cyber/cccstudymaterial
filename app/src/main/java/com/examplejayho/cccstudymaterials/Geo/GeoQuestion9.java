package com.examplejayho.cccstudymaterials.Geo;

public class GeoQuestion9 {
    public String[][] mChoices = {new String[]{"Android", "MAC", "Samsung", "LINUX"}, new String[]{"Throughput", "MHz", "Flaps", "None of the above"}, new String[]{"hardware", "a device", "a program", "a hardware concept"}, new String[]{"COPY", "DISKCOPY", "CHKDSK", "TYPE"}, new String[]{"Window phone", "Android", "BADA", "All of the above"}, new String[]{"Input", "Input", "operating system", "hardware"}, new String[]{"Increased throughput", "Shorter response time", "Decreased operating system overhead", "Ability to assign priorities to jobs"}, new String[]{"Graphical User Interface", "Greater User Interface", "Graphical Union Interface", "Graphical User Interest"}, new String[]{"My computer", "Title bar", "Status bar", "Task bar"}, new String[]{"Mozilla Firebox", "IE", "Opera", "None of These"}};
    public String[] mCorrectAnswer = {"Samsung", "Throughput", "a program", "DISKCOPY", "", "operating system", "Decreased operating system overhead", "Graphical User Interface", "Task bar", "Mozilla Firebox"};
    public String[] mQuestion = {"Which of the following if not OS", "CPU performance is measured through ___.", "A set of computer instructions designed to solve a specific problem is referred to as", "While running DOS on a PC, the command that is used to duplicate the entire diskette?", "Which of the following is the mobile operating system?", "Who handles all the computer functions?", "Which of the following is not advantage of multiprogramming?", "GUI stands for", "Where the time and date display on the desktop?", "Which browser comes with Linux by default"};

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
