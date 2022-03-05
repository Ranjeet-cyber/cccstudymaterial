package com.examplejayho.cccstudymaterials.Sports;

public class SportQuestion7 {
    public String[][] mChoices = {new String[]{"network", "wireless", "slow", "broadband"}, new String[]{"The Internet", "Home network", "Network requiring a server with shared resources", "wide area network"}, new String[]{"Metropolitan Area Network", "Marked Area Network", "Metropolitan Arranged Network", "Manufactured Arrangement of Networks"}, new String[]{"Nodes", "Hubs", "The backbone", "Route"}, new String[]{"protocol", "browser", "URL", "None of these"}, new String[]{"Operating System", "Compiler", "Browser", "IP address"}, new String[]{"Homepage", "Index", "JAVA script", "Bookmark"}, new String[]{"Commerce", "Commercial", "Organization", "None"}, new String[]{"Peer to Peer Protocol", "Point to point protocol", "People to people point", "None"}, new String[]{"IMAP", "HTTP", "VoIP", "IAMP"}};
    public String[] mCorrectAnswer = {"broadband", "Home network", "Metropolitan Area Network", "The backbone", "URL", "Browser", "Index", "Commercial", "Point to point protocol", "HTTP"};
    public String[] mQuestion = {"DSL is an example of an _____connection.", "A peer-to-peer LAN is an appropriate network architecture for", "MAN stands for", "The common pathways on a WAN are known as", "A web address is also called a_____", "Internet explorer falls under", "First page of Website is termed as", ".com is related to?", "What is the full name of PPP?", "Which of the following protocols sends web pages?"};

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
