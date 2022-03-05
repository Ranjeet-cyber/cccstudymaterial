package com.examplejayho.cccstudymaterials.Economy;

public class EconomyQuestion10 {
    public String[][] mChoices = {new String[]{"Sending mail", "Download mail", "For access time", "None of these"}, new String[]{"primary", "multipoint", "point-to-point", "secondary"}, new String[]{"Mail User Authentication", "Mail User Application", "Mail User Agent", "Multi User Agent"}, new String[]{"Facebook", "Instagram", "Amazon", "Linkedin"}, new String[]{"Modem", "Gateway", "Moniter", "Peripheral"}, new String[]{"Letter, number, @", "Letters, numbers", "Username", "None of these"}, new String[]{"Network", "Physical", "Data Link", "Transport"}, new String[]{"Wire full flexibility", "Wireless fiexibility", "Wireless fidelity", "Wire fidelity"}, new String[]{"I & B", "IETF", "Inter NIC", "None of these"}, new String[]{"ATM", "FDDI", "LAN", "Client Server"}};
    public String[] mCorrectAnswer = {"Sending mail", "point-to-point", "Mail User Agent", "Amazon", "Modem", "Letter, number, @", "Network", "Wireless fidelity", "None of these", "ATM"};
    public String[] mQuestion = {"SMTP Is used for?", "______ connection provides a dedicated link between two devices.", "The complete form of MUA is", "Which of the following are not examples of social networking?", "The equipment needed to allow home computers to connect to the internet is called?", "What does an email ID contain?", "Router Operate at which layer?", "नWhat is the full form of wifi?", "Internet is governed by?", "Call Based architecture is known as"};

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
