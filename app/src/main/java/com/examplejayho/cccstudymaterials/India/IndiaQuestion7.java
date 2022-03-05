package com.examplejayho.cccstudymaterials.India;

public class IndiaQuestion7 {
    public String[][] mChoices = {new String[]{".doc", ".html", ".txt", ".tif"}, new String[]{"Network device", "Input Device", "Output Device", "All of the above"}, new String[]{"Operating system", "Interpreter", "Compiler", "Assembler"}, new String[]{"Ctrl + Shift + C", "Ctrl + C", "Ctrl + Shift + T", "Ctrl + Alt + C"}, new String[]{"With High rate of interest", "No proper accounting", "No transparency", "All of above"}, new String[]{"Jacking", "Identity theft", "Spoofing", "Hacking"}, new String[]{"Taskbar", "status bar", "Menubar", "Title bar"}, new String[]{"Ctrl + X", "Ctrl + N", "Ctrl + M", "None of These"}, new String[]{"50", "55", "60", "65"}, new String[]{"Thin Film Transistor", "Thick Film Transistor", "Tubular Film Transistor", "None"}, new String[]{"Operating System", "Compiler", "Browser", "IP address"}, new String[]{"Indian citizen", "Non Resident Indian", "Illiterate", "All of above"}, new String[]{"Dot", "@", "#", "$"}, new String[]{"Internet members", "Instant Messaging", "Including media", "None"}, new String[]{"Operating System", "Office Tool", "Programming Standard", "Proprietary Operating System"}, new String[]{"Space bar", "End key", "Break key", "Esc key"}, new String[]{"protocol", "browser", "URL", "None of these"}, new String[]{"First Generation", "Second Generation", "Fifth Generation", "Sixth Generation"}, new String[]{".edu", ".com", ".in", ".co.in"}, new String[]{"Empty presentation", "Form template", "Open new presentation", "Open existing presentation"}};
    public String[] mCorrectAnswer = {".txt", "Network device", "Operating system", "Ctrl + Alt + C", "All of above", "Spoofing", "Taskbar", "Ctrl + M", "60", "Thin Film Transistor", "Browser", "All of above", "Dot", "Instant Messaging", "Operating System", "Esc key", "URL", "Fifth Generation", ".edu", "Empty presentation"};
    public String[] mQuestion = {"What is the default file extension of notepad?", "What is the Router?", "Select the Odd one", "Which shortcut key is used to insert comment in LibreOffice?", "Loans from money lenders are", "The common name for the crime of stealing passwords is", "Which strip is display at the bottom?", "Which shortcut key is used for adding new slides to the presentation of LibreOffice Impress.", "The minimum age required for the APY Pension is?", "What is the full form of TFT?", "Internet explorer falls under", "Who can open bank account", "By which we separate file names and extensions?", "What is the full form of IM?", "Linux is an open source_____", "Which shortcut key is used to exit from running presentation in Libre Impress", "A web address is also called a_____", "Artificial Intelligence is associated with which generation?", "An educational institution would generally have the following in its domain name.", "Which of the following option is not available on Presentation Wizard?"};

    public IndiaQuestion7() {
    }

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
