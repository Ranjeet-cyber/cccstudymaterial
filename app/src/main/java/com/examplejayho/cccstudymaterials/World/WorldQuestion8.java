package com.examplejayho.cccstudymaterials.World;

public class WorldQuestion8 {
    public String[][] mChoices = {new String[]{"Speakers", "Virtual-reality glasses", "Scanner", "Touch screen"}, new String[]{"an embedded microprocessor", "extensive memory", "independent processing capability", "a keyboard and screen"}, new String[]{"1 second", "10th of a seconds", "1000th of a second", "10000th of a second"}, new String[]{"Dot per sq. inch", "Dot per inch", "Dots printed per unit time", "All of the above"}, new String[]{"ABC", "ENIAC", "EDVAC", "All of the above"}, new String[]{"Mark I", "ABC", "Z3", "None of above"}, new String[]{"Floppy Disk", "Hard Disk", "Compact Disk", "Magneto Optic Disk"}, new String[]{"ENIAC", "MARK I", "Z3", "ABC"}, new String[]{"Path", "Address bus", "Route", "All of the above"}, new String[]{"1.40 MB", "1.44 GB", "1.40 GB", "1.44 MB"}};
    public String[] mCorrectAnswer = {"Scanner", "a keyboard and screen", "1000th of a second", "Dot per sq. inch", "ABC", "ABC", "Hard Disk", "ENIAC", "Address bus", "1.44 MB"};
    public String[] mQuestion = {"Which of the following is NOT an output device?", "A dumb terminal has", "One millisecond is", "The output quality of a printer is measured by", "Which of the following was a special purpose computer?", "What was the computer invented by Attanasoff and Clifford?", "Which of the following storage devices can store maximum amount of data?", "Which computer was considered the first electronic computer until 1973 when court invalidated the patent?", "A physical connection between the microprocessor memory and other parts of the microcomputer is known as", "High density double sided floppy disks could store _____ of data"};

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
