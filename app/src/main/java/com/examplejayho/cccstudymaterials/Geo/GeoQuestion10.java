package com.examplejayho.cccstudymaterials.Geo;

public class GeoQuestion10 {
    public String[][] mChoices = {new String[]{".gif", ".bit", ".jpeg", ".png"}, new String[]{"Linux", "Windows", "MAC", "Android"}, new String[]{"Microsoft Windows", "Unix", "Window Vista", "Monolithic Kernel"}, new String[]{"Real time processing", "Batch processing", "Off line processing", "Distributed processing"}, new String[]{"4", "5", "8", "12"}, new String[]{".doc", ".html", ".txt", ".tif"}, new String[]{"Unix", "Linux", "DOS", "None of these"}, new String[]{"archives", "folders", "indexes", "lists"}, new String[]{"countw", "wcount", "wc", "count p"}, new String[]{"F1 Key", "F2 Key", "F3 Key", "F4 Key"}};
    public String[] mCorrectAnswer = {".bit", "Windows", "Monolithic Kernel", "Real time processing", "8", ".txt", "Unix", "folders", "wc", "F1 Key"};
    public String[] mQuestion = {"Do not have picture file extension in the following?", "Internet Explorer comes along with", "System structure of Linux is", "If data is processed as it arrives, this type of data processing is called?", "What is the maximum length of the filename in DOS?", "What is the default file extension of notepad?", "Which one is the GUI based operating system?", "You organize files by storing them in", "What command is used to count the total number of lines, words, and characters contained in a file on LINUX?", "To get Help when using MS Office, you would Press the"};

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
