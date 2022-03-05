package com.examplejayho.cccstudymaterials.Geo;

public class GeoQuestion6 {
    public String[][] mChoices = {new String[]{"Keyboard", "Recycle Bin", "My Computer", "task bar"}, new String[]{"Linux", "Mozilla", "Macintosh", "Windows"}, new String[]{"International Standard Organization", "International Student Organization", "Integrated Service Organization", "Internal Student Organization"}, new String[]{"Input", "Output", "Operating system", "Hardware"}, new String[]{"FAT16", "FAT32", "NTFS", "WNFS"}, new String[]{"MS Word", "MS Excel", "MS Writer", "MS Access"}, new String[]{"Linux", "Word", "Excel", "Tally"}, new String[]{"Windows 7", "Linux", "JAVA", "Apple"}, new String[]{"Command Prompt", "Task Manager", "Settings", "Disk Manager"}, new String[]{"Windows 98", "MS DOS", "Windows XP", "Windows NT"}};
    public String[] mCorrectAnswer = {"task bar", "Mozilla", "International Standard Organization", "Operating system", "FAT16", "MS Writer", "Linux", "JAVA", "Task Manager", "MS DOS"};
    public String[] mQuestion = {"Date and Time are available on the desktop at", "Which of the following is not an operating system?", "Full name of IOS", "Which is handles all the functions of the computer", "Which file system does DOS typically use?", "Which program does not fall into the MS Office Package?", "Which of the following is system software?", "______ is a known as high level language.", "What application do you use to close a non-responsive program?", "Which of the followiing operating system does not implement multitasking truly?"};

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
