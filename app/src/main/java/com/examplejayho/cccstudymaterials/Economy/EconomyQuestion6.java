package com.examplejayho.cccstudymaterials.Economy;

public class EconomyQuestion6 {
    public String[][] mChoices = {new String[]{"Online music", "Intranet", "A personal or corporate website in the form of an online journal", "a personal or corporate Google Search"}, new String[]{"Orkut", "Facebook", "Amazon.com", "Twitter"}, new String[]{"secret information sharing", "electronic mailing", "interpersonal communication", "social networking"}, new String[]{"60 Sec", "30 Sec", "5 Min", "2 Min"}, new String[]{"Network device", "Input Device", "Output Device", "All of the above"}, new String[]{"Multiple", "Only Two", "Only One", "Only three"}, new String[]{"Online Railway Information System", "Mobile Phones", "e-learning software", "Multimedia software"}, new String[]{"TCP/IP", "TCP", "URL", "DNS"}, new String[]{"Jacking", "Identity theft", "Spoofing", "Hacking"}, new String[]{"HTTP", "TCP/IP", "WWW", "FTP"}};
    public String[] mCorrectAnswer = {"A personal or corporate website in the form of an online journal", "Orkut", "social networking", "60 Sec", "Network device", "Multiple", "Mobile Phones", "DNS", "Spoofing", "TCP/IP"};
    public String[] mQuestion = {"What is a BLOG ?", "The site that played a major role during the terrorist attack on Mumbai (26/11) in 2008 was", "Twitter is generally used for", "How long can a video be recorded and posted on Instagram?", "What is the Router?", "We can delete the maximum number of e-mail at a time?", "Embedded software is used in", "______ maps IP address with domain name of sites.", "The common name for the crime of stealing passwords is called?", "The communication protocol used by internet."};

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
