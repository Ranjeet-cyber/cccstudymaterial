package com.examplejayho.cccstudymaterials.Economy;

public class EconomyQuestion7 {
    public String[][] mChoices = {new String[]{"12", "13", "14", "18"}, new String[]{"Internet members", "Instant Messaging", "Including media", "None"}, new String[]{"Facebook", "Instagram", "Amazon", "Linkedin"}, new String[]{"highlight all your important emails", "delete an email", "organise all your emails", "find a specific email"}, new String[]{"Mail User Authentication", "Mail User Application", "Mail User Agent", "Multi User Agent"}, new String[]{"Trash Mail", "Sent Mail", "Inbox", "Outbox"}, new String[]{"Facebook", "Instagram", "Twitter", "None of These"}, new String[]{"point-to-point", "multipoint", "primary", "secondary"}, new String[]{"Mail Agent", "Mail Control Agent", "User Agent", "none of these"}, new String[]{"Extension", "Service provider", "Host name", "User name"}};
    public String[] mCorrectAnswer = {"13", "Instant Messaging", "Amazon", "highlight all your important emails", "Mail User Agent", "Trash Mail", "Instagram", "point-to-point", "User Agent", "User name"};
    public String[] mQuestion = {"The minimum age to open a Facebook account?", "What is the full form of IM?", "Which of the following are not examples of social networking?", "When would you use the Gmail star feature.", "The complete form of MUA.", "Deleted email will be found in", "Which social media is more based on image and video.", "_______ connection provides a dedicated link between two devices.", "What is the person who controls email send and receive receipts?", "In abc@gmail.com, what is abc?"};

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
