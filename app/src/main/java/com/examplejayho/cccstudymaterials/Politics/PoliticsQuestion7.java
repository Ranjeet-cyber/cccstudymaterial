package com.examplejayho.cccstudymaterials.Politics;

public class PoliticsQuestion7 {
    public String[][] mChoices = {new String[]{"Facebook", "YouTube", "Skype", "Twitter"}, new String[]{"Confidentiality, integrity, availability", "Control, intelligence, action", "Central, intelligence, agency", "Confidence, integrity, action"}, new String[]{"Apple", "Google", "Microsoft", "All of these"}, new String[]{"Inter voice response", "interactive voice response", "interactive violet response", "interactive voice respect"}, new String[]{"Cracking", "Jacking", "Spoofing", "Smarming"}, new String[]{"Frequency of Failure", "recovery time after a failure", "catastrophe", "All of the above"}, new String[]{"Internet protocols", "Network layers", "Internet layers", "Cryptographic protocols"}, new String[]{"Write it in another language", "Keep the message in attachment", "Encrypt the message", "Send as a blind copy"}, new String[]{"Disrupt computer operation", "Gather sensitive information", "Both A and B", "All of the Above"}, new String[]{"Instance Principle", "Internet Protocol", "Instant Protocol", "Intellectual Property"}};
    public String[] mCorrectAnswer = {"YouTube", "Confidentiality, integrity, availability", "Microsoft", "interactive voice response", "Cracking", "All of the above", "Cryptographic protocols", "Encrypt the message", "Both A and B", "Internet Protocol"};
    public String[] mQuestion = {"Who will introducing 'Learning Playlists' for educational videos?", "What are the three basic component of computer security?", "Inventor of Bing?", "What is the full form of IVR?", "—— refers to electronic trespassing or criminal hacking.", "Which of the following are network reliability issues?", "What are TLS and SSL?", "What is a good way to protect sensitive information sent via e-mail?", "Malware is used to", "What does IP mean?"};

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
