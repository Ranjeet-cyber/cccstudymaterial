package com.examplejayho.cccstudymaterials.Sports;

public class SportQuestion10 {
    public String[][] mChoices = {new String[]{"Transmission Control Protocol", "Transistor Control Protocol", "Transform Control Protocol", "Transmission Communicational Protocol"}, new String[]{"Socket", "Port", "Gateways", "Protocol"}, new String[]{"cable", "Channel", "Straight through cable", "rs232"}, new String[]{"Yahoo", "Google", "Messenger", "Altavista"}, new String[]{".edu", ".com", ".in", ".co.in"}, new String[]{"Stateful protocol", "Stateless protocol", "Both", "None"}, new String[]{"It is a mechanism for authentication", "It is the scanned image of one’s signature", "It is created by encrypting information", "It cannot be duplicated"}, new String[]{"Alt + T", "Ctrl + T", "Shift + T", "Alt + Ctrl + T"}, new String[]{"32 bits", "64 bits", "128 bits", "265 bits"}, new String[]{"DHCP", "IP", "RPC", "none of the above"}};
    public String[] mCorrectAnswer = {"Transmission Control Protocol", "Port", "Straight through cable", "Messenger", ".edu", "Stateful protocol", "It is the scanned image of one’s signature", "Ctrl + T", "128 bits", "DHCP"};
    public String[] mQuestion = {"TCP stands for", "_____is an access channel for computers to exchange information.", "The cable which required to make a connection between two computers is called?", "Which of the following is not a search engine?", "An educational institution would generally have the following in its domain name.", "FTP is a _____?", "Which one of the following statement is not correct for digital signature?", "What is the shortcut for opening new tabs in the browser?", "IPv6 addressed have a size of", "Which protocol assigns IP address to the client connected in the internet?"};

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
