package com.examplejayho.cccstudymaterials.Politics;

public class PoliticsQuestion9 {
    public String[][] mChoices = {new String[]{"Phising", "Spamming", "Virus", "Malware"}, new String[]{"Malicious Intent", "Sabotage", "Accident Errors", "Espionage Agents"}, new String[]{"Right to Privacy", "Copyright", "Intellectual Property Rights", "None of these"}, new String[]{"Hardware Failure", "Privacy Invasion", "Fraudulent Manipulation of Data", "All of the Above"}, new String[]{"G-Yatra", "Sarathi", "Spotify", "m-Parivahan"}, new String[]{"Unstructured Supplementary Service Date", "Unstructured Supplementary System Data", "Unstructured Supplementary Service Data", "None"}, new String[]{"Android Pie", "Android 10", "Android Coco", "Android 9A"}, new String[]{"Bangalore", "Delhi", "Chennai", "Mumbai"}, new String[]{"Theft of information", "Modification of data", "Wiping of information", "All of the mentioned"}, new String[]{"His Public key", "His Private Key", "Receivers Public Key", "Receivers Public Key"}};
    public String[] mCorrectAnswer = {"Spamming", "Malicious Intent", "Right to Privacy", "Privacy Invasion", "Sarathi", "Unstructured Supplementary Service Data", "Android 10", "Bangalore", "All of the mentioned", "His Private Key"};
    public String[] mQuestion = {"What is the term used to refer to sending unwanted bulk messages, especially advertising, indiscriminately?", "A passive threat to computer security is", "What is the right given to freedom from intrusion by the public, especially as a right called?", "Data security threats include", "Name the driving license app, that is introduced by the government recently.", "USSD Stand for?", "The new Android version launched by Google on August 22, 2019 is", "Which place of India is called Silicon City?", "Which of the following are forms of malicious attack", "Hashed message is signed by a sender using"};

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
