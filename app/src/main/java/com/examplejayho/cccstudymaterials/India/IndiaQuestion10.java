package com.examplejayho.cccstudymaterials.India;

public class IndiaQuestion10 {
    public String[][] mChoices = {new String[]{"National Payments Corporation of India", "Finance mini", "Bank", "None of above"}, new String[]{"Circuit switching", "Packet switching", "Hybrid switching", "None of these"}, new String[]{"Slides pane", "Workspace", "Work pane", "Task pane"}, new String[]{"20", "10", "5", "15"}, new String[]{"Plotter", "CRT monitor", "Ear phones", "Digital Camera"}, new String[]{"Shift + F12", "F12", "Ctrl + F12", "जल विद्युत"}, new String[]{"Commerce", "Commercial", "Organization", "None of These"}, new String[]{"32000", "48000", "60000", "None of these"}, new String[]{"Uniform Reverse Location", "Universal Resolution Location", "Uniform Resource Locator", "United Resource Locator"}, new String[]{"Indian citizen", "Non Resident Indian", "Illiterate", "All of above"}, new String[]{"Organizing data", "Making data useful", "Collection of data", "All of the above"}, new String[]{"Extension", "Service provider", "Host name", "User name"}, new String[]{"Current account", "Savings Account", "Fixed Deposits", "None of above"}, new String[]{"PB", "ZB", "TB", "EB"}, new String[]{"Monthly basis", "Quarterly basis", "Half yearly basis", "Yearly basis"}, new String[]{"Normal view", "Outline view", "Notes", "Slide Sorter view"}, new String[]{"Netscape", "Veronica", "Mosaic", "Lynx"}, new String[]{"Megabits", "Dots per inch", "Hertz", "Inches"}, new String[]{"Drop Cap", "Word Art", "Clipart", "All of above"}, new String[]{"Microphone", "Scanner", "Touch screen", "Mouse"}};
    public String[] mCorrectAnswer = {"National Payments Corporation of India", "Packet switching", "Workspace", "20", "Digital Camera", "Shift + F12", "Commercial", "None of these", "Uniform Resource Locator", "All of above", "All of the above", "User name", "Fixed Deposits", "ZB", "Quarterly basis", "Slide Sorter view", "Netscape", "Dots per inch", "Clipart", "Mouse"};
    public String[] mQuestion = {"UPI payment interface Developed by", "The Internet used", "Which of the following is not a part of main impress window?", "What is the minimum Zoom percentage in LibreOffice writer?", "Which of the following is not an output device.", "Which key do you use to add bullet list to libreOffice writer?", ".com is related to?", "How many seats we can insert in Libreoffice Calc?", "What is the full form of URL ?", "Who can open bank account", "What is meant by 'Data Processing'?", "In xyz@gmail.com, what is xyz?", "Which type of deposits earns higher interest rate?", "Which of the following is the largest Data Storage Units?", "Interest on FDRs is compounded on", "Which view is generally used for creating, formatting and designing slides?", "The first graphical browser for the WWW was named", "The resolution of a dot matrix printer is measured in", "Which of the following is graphics solution for Word processors?", "Which of the following is the most frequently used input device?"};

    public IndiaQuestion10() {
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
