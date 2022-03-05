package com.examplejayho.cccstudymaterials.Sports;

public class SportQuestion9 {
    public String[][] mChoices = {new String[]{"CTRL+ENTER", "SHIFT+ENTER", "ALT+ENTER", "ALT+TAB"}, new String[]{"e-mail address", "street address", "IP address", "None of the above"}, new String[]{"Alan Turing", "Steve jobs", "Bill gates", "Tim Berners-Lee"}, new String[]{"Azure", "AWS", "Cloudera", "All of the mentioned"}, new String[]{"Hyper Text Markup Language", "Hyper Text Manipulation Language", "Hyper Text Managing Links", "Hyper Text Manipulating Links"}, new String[]{"SMTP", "HTTP", "FTP", "SIP"}, new String[]{"Open System Interface", "Out System Interface", "Open System Interconnection", "Out System Interconnection"}, new String[]{"Web server", "Internet", "Web browser", "World Wide Web"}, new String[]{"Protocol", "Medium", "Signal", "All the above"}, new String[]{"Google", "Yahoo", "Bing", "Facebook"}};
    public String[] mCorrectAnswer = {"ALT+ENTER", "IP address", "Tim Berners-Lee", "AWS", "Hyper Text Markup Language", "SMTP", "Open System Interconnection", "Web browser", "Medium", "Facebook"};
    public String[] mQuestion = {"Open a new tab in the foreground from the Address bar", "A computer on internet are identified by", "Who invented the World Wide Web (WWW)?", "Which one of the following is Cloud Platform by Amazon?", "Full form of HTML is", "Electronic mail uses which Application layer protocol?", "OSI stands for", "Google Chrome, Mozilla Firefox, Internet Explorer, Netscape Navigator are examples of", "The_____ is the physical path over which a message travels.", "Which of the following is not the internet search engine?"};

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
