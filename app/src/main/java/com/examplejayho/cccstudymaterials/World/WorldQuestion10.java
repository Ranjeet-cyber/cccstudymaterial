package com.examplejayho.cccstudymaterials.World;

public class WorldQuestion10 {
    public String[][] mChoices = {new String[]{"Laser printer", "Ink jet printer", "Plotter", "Dot matrix printer"}, new String[]{"ODT", "DOCX", "PDF", "DOC"}, new String[]{"Processing of grades", "Payroll processing", "Both a and b", "All of above"}, new String[]{"arranging", "manipulating", "calculating", "gathering"}, new String[]{"USSR", "Japan", "USA", "UK"}, new String[]{"Enhances the capabilities of the hardware machine", "Increase the speed of central processing unit", "Both of above", "None of above"}, new String[]{"Medium Scale Integrated Circuits", "Medium System Integrated Circuits", "Medium Scale Intelligent Circuit", "Medium System Intelligent Circuit"}, new String[]{"notebook", "copy pad", "registers", "I/O devices"}, new String[]{"Sorting", "Classifying", "Reproducing", "Summarizing"}, new String[]{"To produce result", "To compare numbers", "To control flow of information", "To do math’s works"}};
    public String[] mCorrectAnswer = {"Plotter", "PDF", "Both a and b", "gathering", "USA", "Enhances the capabilities of the hardware machine", "Medium Scale Integrated Circuits", "registers", "Sorting", "To compare numbers"};
    public String[] mQuestion = {"Which of the following produces the best quality graphics reproduction?", "If you want to share a document and you want people to just see it and not edit it, which one should you use?", "An application suitable for sequential processing is", "Which of the following is not processing?", "The digital computer was developed primarily in", "Software in computer", "MSI stands for", "ALU works on the instructions and data held in the", "The arranging of data in a logical sequence is called", "What is the responsibility of the logical unit in the CPU of a computer?"};

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
