package com.examplejayho.cccstudymaterials.India;

public class IndiaQuestion6 {
    public String[][] mChoices = {new String[]{"RBI", "UPI", "NPCI", "NEFT"}, new String[]{"Cache memory", "Register", "Floppy disk", "Hard Disk Drive"}, new String[]{"Pageup", "Pagedown", "Home", "End"}, new String[]{"8 years", "10 years", "12 years", "None of above"}, new String[]{"International Information Services", "Internet Information Services", "Important Information Services", "Instance Information Services"}, new String[]{"Peer to Peer Protocol", "People to people point", "Point to point protocol", "None"}, new String[]{"To add data", "Formatting", "To add formula", "All of these"}, new String[]{"Full", "Null", "Received", "Credited"}, new String[]{"Mozilla Firebox", "IE", "Opera", "None of These"}, new String[]{"5%", "15%", "10%", "20%"}, new String[]{"8", "16", "32", "63"}, new String[]{"Bank mail", "Bounced mail", "Return mail", "Spam"}, new String[]{"Electronic Financial Transfer", "Electronic Funds Transfer", "Electric Finance Transfer", "Electric Fund Transfer"}, new String[]{"Program", "Flowchart", "Algorithm", "Operating System"}, new String[]{"Function keys", "Numeric keys", "Typewriters keys", "Special purpose keys"}, new String[]{"Single click", "Double click", "Triple click", "None of the above"}, new String[]{"computer categaries", "connectivity", "Telecommuting", "None of the above"}, new String[]{"Master pages", "Layouts", "Custom view", "Custom animation"}, new String[]{"RTGS", "SWIFT", "NEFT", "IMPS"}, new String[]{"Stateful protocol", "Stateless protocol", "Both", "None"}};
    public String[] mCorrectAnswer = {"NPCI", "Register", "Pagedown", "10 years", "Internet Information Services", "Point to point protocol", "All of these", "Credited", "Mozilla Firebox", "5%", "63", "Bounced mail", "Electronic Funds Transfer", "Operating System", "Function keys", "Triple click", "Telecommuting", "Layouts", "SWIFT", "Stateful protocol"};
    public String[] mQuestion = {"Umang app launched by", "What is the fastest memory?", "What is the shortcut key to the next slide?", "Minimum age required to open SB account in the bank?", "Is the full form of IIS?", "What is the full name of PPP?", "Which type of facilities does spreadsheet gives to make the work easy?", "Received Money from UPI is called?", "Which browser comes with Linux by default?", "How much is the minimum zoom size in LibreOffice Impress?", "What is the maximum length of a Wi-Fi password?", "What is the return mail sent to the sender?", "What does EFT stand for?", "Who is working as link between Hardware and software?", "The keyboards keys that are labelled F1, F2 and so on are called.", "Which of the following technique selects a sentence in Writer?", "Voice mail,E-mail,online service,the internet and the www are all example of", "Which of the following is not a section of tasks pane of Libre Impress?", "International payment transfer is done by", "FTP is a _____?"};

    public IndiaQuestion6() {
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
