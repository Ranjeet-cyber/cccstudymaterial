package com.examplejayho.cccstudymaterials.Sports;

public class SportQuestion8 {
    public String[][] mChoices = {new String[]{"Target", "Thing", "Twice", "Twit"}, new String[]{"Host", "IP Address", "Address", "URLs address"}, new String[]{"Slow", "internet", "Broadband", "Wireless"}, new String[]{"Uploading", "Forwarding", "FTP", "Downloading"}, new String[]{"Uniform Reverse Location", "Universal Resolution Location", "Uniform Resource Locator", "United Resource Locator"}, new String[]{"IP Address", "Domain", "Uniform Resource Locator", "Hyperlink"}, new String[]{"Extra Markup Language", "Extended Marking Links", "Excellent Markup Language", "Extensible Markup Language"}, new String[]{"Internal Protocol", "Internet Protocol", "Interior Protocol", "None of These"}, new String[]{"Facebook", "Twitter", "Instagram", "Telegram"}, new String[]{"Netscape", "Veronica", "Mosaic", "Explorer"}};
    public String[] mCorrectAnswer = {"Thing", "Host", "Broadband", "Uploading", "Uniform Resource Locator", "Uniform Resource Locator", "Extensible Markup Language", "Internet Protocol", "Twitter", "Mosaic"};
    public String[] mQuestion = {"What mean of T in IoT?", "The computer or server on the Internet is also known as", "DSL is a_____ connection", "The process of transferring files from a computer on the Internet to your computer is called?", "What is the full form of URL?", "Every web document has a unique address, what is it called?", "XML stands for", "IP stands for?", "Which is used to tweet?", "The first graphical browser for the WWW was named"};

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
