package com.examplejayho.cccstudymaterials.Sports;

public class SportQuestion6 {
    public String[][] mChoices = {new String[]{"8", "16", "32", "63"}, new String[]{"A connection to Internet", "A web browser", "A web server", "All the above"}, new String[]{"Circuit switching", "Packet switching", "Hybrid switching", "None of these"}, new String[]{"home page", "master page", "first page", "banner page"}, new String[]{"W3C", "IETF", "Inter NIC", "None of the above"}, new String[]{"Domain Name System", "Defence Nuclear System", "Downloadable New Software", "Dependent Name Server"}, new String[]{"software bundles", "web page", "web site", "interconnected networks"}, new String[]{"Phone lines", "LAN", "Internet", "Server"}, new String[]{"TCP", "FTP", "SMTP", "POP"}, new String[]{"network", "mainframe", "supercomputer", "client"}};
    public String[] mCorrectAnswer = {"63", "All the above", "Packet switching", "home page", "None of the above", "Domain Name System", "interconnected networks", "Internet", "POP", "network"};
    public String[] mQuestion = {"What is the maximum length of a Wi-Fi password?", "What do you need to put your web pages on the www?", "The Internet used", "The first page that you normally view at a web site is", "Internet is governed by", "The term DNS stands for", "The internet is a system _____", "TCP/IP is necessary if one is to connect to the", "_____is a protocol used by e-mail clients to download e-mails to your computer.", "Servers are computer that provide resources to other computers connected to a"};

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
