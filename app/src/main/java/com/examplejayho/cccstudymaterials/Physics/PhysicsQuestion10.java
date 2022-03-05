package com.examplejayho.cccstudymaterials.Physics;

public class PhysicsQuestion10 {
    public String[][] mChoices = {new String[]{"March 2004", "Nov 2005", "November 2017", "Nov 2010"}, new String[]{"Keep your customers cool", "Keep your cool", "Know your customers", "Know your credit"}, new String[]{"4 months from date of issue", "3 month from date of issue", "1 month frome date of issue", "Unlimited"}, new String[]{"Mahatma Gandhi National Rural Employment Generation Scheme", "Mahatma Gandhi Nutrition & Rural Employment Generation Scheme", "Mahatma Gandhi National Rural Employment Guarantee Scheme", "None of above"}, new String[]{"East or South zone", "Easy and Swift", "Either or Survivor", "None of above"}, new String[]{"Business to Government", "Brand to Government", "Both", "None"}, new String[]{"Beneficiary", "Nominee", "Drawer of cheque", "All of above"}, new String[]{"A plastic card", "Can also use in ATM", "It is necessary to have money in advance for use", "All of the above"}, new String[]{"Real Time Gross Sale", "Real Time Gross Settlement", "Real Time Growth Settlement", "Real Time Group Service"}, new String[]{"Not paying loan instalments", "Bad reputation", "Illegal activities", "None of above"}};
    public String[] mCorrectAnswer = {"March 2004", "Know your customers", "3 month from date of issue", "Mahatma Gandhi National Rural Employment Guarantee Scheme", "Either or Survivor", "Business to Government", "Drawer of cheque", "All of the above", "Real Time Gross Settlement", "Not paying loan instalments"};
    public String[] mQuestion = {"When did RTGS start?", "What is the full form of KYC?", "What is validity period of cheque", "MGNREGS stands for", "E or S means", "Full name of B2G?", "Payment of cheque can be stopped by", "What is a Debit Card?", "RTGS stands for", "Defaulter of loan means"};

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
