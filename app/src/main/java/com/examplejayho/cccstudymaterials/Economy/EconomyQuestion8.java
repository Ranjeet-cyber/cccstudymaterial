package com.examplejayho.cccstudymaterials.Economy;

public class EconomyQuestion8 {
    public String[][] mChoices = {new String[]{"Natural occurs", "To make by human being", "Made by machine", "All of above"}, new String[]{"Mail Server", "Chat Server", "Client Server", "Message Server"}, new String[]{"$", "#", "@", "none"}, new String[]{"Chart Service", "Discussion group", "E-mail service", "None"}, new String[]{"point-to-point", "multipoint", "primary", "secondary"}, new String[]{"Internet express", "Outlook express", "Web express", "Email Express"}, new String[]{"Application layer", "Transpart layer", "Network layer", "Data link layer"}, new String[]{"User ID", "Domain name", "Both", "None"}, new String[]{"Instant making", "Internal messaging", "Instant messaging", "None of these"}, new String[]{"140", "180", "280", "150"}};
    public String[] mCorrectAnswer = {"To make by human being", "Chat Server", "@", "Discussion group", "multipoint", "Outlook express", "Transpart layer", "Both", "Instant messaging", "280"};
    public String[] mQuestion = {"Which of the following is a virus?", "Which server is used for instant messaging?", "What is Twitter handle Symbol?", "News Group are", "In a _______ connection, more than two devices can share a single link.", "Which of the following is the example of email client?", "TCP is a commonly used protocol at", "An email ID consist of", "E-mail is an example of which of the following?", "How many characters can be used while tweet in Twitter?"};

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
