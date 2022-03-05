package com.examplejayho.cccstudymaterials.India;

public class IndiaQuestion8 {
    public String[][] mChoices = {new String[]{"(a) SSI", "(b) MSI", "(c)LSI", "Both a and b"}, new String[]{"60 Sec.", "30 Sec.", "5 Min.", "2 Min."}, new String[]{"Title bar", "Standard Toolbar", "Formatting Toolbar", "Formula Bar"}, new String[]{"Internet express", "Outlook express", "Web express", "Email Express"}, new String[]{"March 2004", "Nov 2005", "November 2017", "Nov 2010"}, new String[]{"The Internet", "Home network", "Network requiring a server with shared resources", "wide area network"}, new String[]{"Computer Program", "Algorithm", "Flowchart", "Utility Program"}, new String[]{"Home tab", "Slide Show", "Design", "All of the above"}, new String[]{"HTTP", "TCP/IP", "WWW", "FTP"}, new String[]{"Shift + F12", "F12", "Ctrl + F12", "None of These"}, new String[]{"Batch system", "Quick response system", "Real time system", "Time sharing system"}, new String[]{"network", "mainframe", "supercomputer", "client"}, new String[]{"(a) Deposits", "(b) Loans", "Both (a) & (b)", "None of above"}, new String[]{"Keyboard", "Recycle Bin", "My Computer", "Task bar"}, new String[]{"Yahoo", "Google", "Messenger", "Altavista"}, new String[]{"Data", "Math / Tring", "Mathematical", "String"}, new String[]{"12", "13", "14", "18"}, new String[]{"Notebook", "Copy pad", "Registers", "I/O devices"}, new String[]{"United parcel service", "Uniform product support", "Under Power Supply", "Uninterrupted power supply"}, new String[]{"Phone lines", "LAN", "Internet", "Server"}};
    public String[] mCorrectAnswer = {"Both a and b", "60 Sec.", "Standard Toolbar", "Outlook express", "March 2004", "Home network", "Computer Program", "Slide Show", "TCP/IP", "Shift + F12", "Real time system", "network", "(b) Loans", "Task bar", "Messenger", "Mathematical", "13", "Registers", "Uninterrupted power supply", "Internet"};
    public String[] mQuestion = {"Which of the following IC was used in third generation of computers?", "How long can a video be recorded and posted on Instagram?", "In Calc, most common commands present in which Bar?", "Which of the following is the example of email client?", "When did RTGS start?", "A peer-to-peer LAN is an appropriate network architecture for", "The list of coded instructions is called", "What would you choose to do Show PreView in PowerPoint?", "The communication protocol used by internet is", "Which key do you use to add bullet list to libreOffice writer?", "The operating system that reads and reacts in terms of actual time is", "Servers are computer that provide resources to other computers connected to a", "Bank charges interest on", "Date and Time are available on the desktop at", "Which of the following is not a search engine?", "COS, EVEN, FACT, EXP are which categories of functions in LibreOffice Calc?", "The minimum age to open a Facebook account?", "ALU works on the instructions and data held in the", "What is full form of UPS?", "TCP/IP is necessary if one is to connect to the"};

    public IndiaQuestion8() {
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
