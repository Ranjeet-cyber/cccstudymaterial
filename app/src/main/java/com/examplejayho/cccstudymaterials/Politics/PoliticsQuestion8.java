package com.examplejayho.cccstudymaterials.Politics;

public class PoliticsQuestion8 {
    public String[][] mChoices = {new String[]{"International mobile equipment identify", "Internet mobile equipment identify", "International mobile equipment identity", "None"}, new String[]{"Fraudulently acquiring sensitive information", "An encryption technique", "An anti-spam technique", "A password building technique"}, new String[]{"Security patches", "Refresh patches", "Security breath fixes", "All of the above"}, new String[]{"Virus", "Security", "Worm", "None of the above"}, new String[]{"Mobile Money Identifier", "Mobile making identifier", "Money mobile identifier", "Mobile money immediate"}, new String[]{"Janaushadhi Sugam", "Digicop", "Khelo India", "Kumbh JioPhone"}, new String[]{"Malware", "Spyware", "Adware", "None of these"}, new String[]{"Confidentiality", "Interruption", "Modification", "All of Above"}, new String[]{"It cannot be changed", "It is expensive to implement", "It is easy to use and requires little training", "It is difficult to lose"}, new String[]{"Do not open attachments from suspicious sources", "Delete chain and junk mails", "Backup your files", "All of the above"}};
    public String[] mCorrectAnswer = {"International mobile equipment identity", "Fraudulently acquiring sensitive information", "Security patches", "Security", "Mobile Money Identifier", "Janaushadhi Sugam", "Spyware", "Confidentiality", "It is expensive to implement", "All of the above"};
    public String[] mQuestion = {"Full form of IMEI?", "What is Phishing?", "Software programs that close potential security breaches in an operating system are known as", "Firewall is a type of _____", "Full form of MMID?", "What is the name of the mobile application launched for locating outlets and searching Generic medicine?", "_________ monitors user activity on internet and transmit that information in the background to someone else.", "The main goals of secure computing is", "Which of the following is a disadvantage of biometrics?", "Which of the following are preventive antivirus measures?"};

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
