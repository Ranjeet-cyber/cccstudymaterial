package com.examplejayho.cccstudymaterials.Politics;

public class PoliticsQuestion10 {
    public String[][] mChoices = {new String[]{"Phishing", "Soliciting", "DoS attacks", "Stalking"}, new String[]{"Param Shivay", "Aaditya", "SahasraT", "Param Yuva 2"}, new String[]{"Intranet of things", "Industry of things", "Internet of things", "None of above"}, new String[]{"Internet Messaging Application", "Interanet Messaging Application", "Interanet Message Access Protocol", "Internet Message Access Protocol"}, new String[]{"Google", "Nasscom Foundation", "Infosys", "TCS"}, new String[]{"Bangalore", "Delhi", "Chennai", "Mumbai"}, new String[]{"Performance", "Reliability", "Security", "All the above"}, new String[]{"Public authorization key", "Public ephemeral key authorization key", "Asymmetric authorization keys", "Symmetric authorization keys"}, new String[]{"Active Matrix Organic Light Emitting Diode", "Active Metter Organic Light Emitting Diode", "Access Matrix Organic Light Emitting", "Active Matrix Original Light Emitting Diode"}, new String[]{"*60#", "$#6#", "*#06#", "None"}};
    public String[] mCorrectAnswer = {"DoS attacks", "Param Shivay", "Internet of things", "Internet Message Access Protocol", "Nasscom Foundation", "Bangalore", "Security", "Public authorization key", "Active Matrix Organic Light Emitting Diode", "*#06#"};
    public String[] mQuestion = {"Which of the following is a class of computer threat", "Name the SuperComputer that was unveiled in IIT-BHU by Prime Minister Narendra Modi?", "IOT stand for", "What is IMAP?", "FSSAI to develop app to prevent food wastage in partnership with whichcompany?", "Which place of India is called Silicon City?", "An unauthorized user is a network _______ issue.", "Which of the following is a VALID authorization key?", "What is the full form of AMOLED?", "What code do IMEI numbers used?"};

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
