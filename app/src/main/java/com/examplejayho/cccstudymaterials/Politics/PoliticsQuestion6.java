package com.examplejayho.cccstudymaterials.Politics;

public class PoliticsQuestion6 {
    public String[][] mChoices = {new String[]{"Hackers", "Spam", "Viruses", "Identify theft"}, new String[]{"Data mining", "Data selection", "POS", "Data conversion"}, new String[]{"Robotics", "Simulation", "Computer forensics", "Animation"}, new String[]{"unauthorized attacks", "virus attacks", "data-driven attacks", "fire attacks"}, new String[]{"Encryption", "Audits", "UPS", "Firewalls"}, new String[]{"one private key is used for both encryption and decryption", "private and public key used are symmetric", "only public keys are used for encryption", "only symmetric key is used for encryption"}, new String[]{"15", "17", "12", "13"}, new String[]{"Aadhaar Based Remittance Service", "Aadhaar Board Remittance Service", "Advance Based Remittance Service", "None"}, new String[]{"The Indian Institute of Technology, Kanpur", "The Indian Institute of Technology, Bhubaneswar", "The Indian Institute of Technology, Mandi", "The Indian Institute of Science"}, new String[]{"Smart factory", "Speed", "Analytics", "None of above"}};
    public String[] mCorrectAnswer = {"Viruses", "Data mining", "Computer forensics", "unauthorized attacks", "Encryption", "only symmetric key is used for encryption", "15", "Aadhaar Based Remittance Service", "The Indian Institute of Technology, Kanpur", "Speed"};
    public String[] mQuestion = {"All of the are examples of real security and privacy risks EXCEPT", "process known as ……. is used by large retailers to study trends", "To recover and read deleted or damaged files from a criminal’s computer is an called?", "Firewalls are used to protect a communication network system against", "Which of the following scrambles a message by applying a secret code?", "By symmetric key encryption we mean", "How many digits are in IMEI?", "What is the full form of ABRS?", "Which institute has developed a virtual classroom aid, 'Mobile Masterjee'?", "Which of the following option is not best described about industry 4.0"};

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
