package com.examplejayho.cccstudymaterials.Physics;

public class PhysicsQuestion7 {
    public String[][] mChoices = {new String[]{"Account Operation by Internet", "Account opened through ATM", "Both (a) and (b)", "None of the above"}, new String[]{"RTGS", "SWIFT", "NEFT", "IMPS"}, new String[]{"Electronic Financial Transfer", "Electronic Funds Transfer", "Electric Finance Transfer", "Electric Fund Transfer"}, new String[]{"Password", "User name", "User address", "User mobile number"}, new String[]{"RBI", "UPI", "NPCI", "NEFT"}, new String[]{"No", "Yes", "Only in case of joint account", "Only in case he is head of family"}, new String[]{"8 years", "10 years", "12 years", "None of above"}, new String[]{"Full", "Null", "Received", "Credited"}, new String[]{"Pension Planning Funds", "Person having Pension Facilities", "Public Provident Fund", "Permanent Practitioners Forum"}, new String[]{"Deposits less than Rs.50,000/-", "Deposits in excess of Rs.1 lac", "Deposits Rs.50,000/- & above", "All transactions"}};
    public String[] mCorrectAnswer = {"Account Operation by Internet", "SWIFT", "Electronic Funds Transfer", "Password", "NPCI", "Yes", "10 years", "Credited", "Public Provident Fund", "Deposits Rs.50,000/- & above"};
    public String[] mQuestion = {"Internet banking means", "International payment transfer is done by", "What does EFT stand for?", "Main security of internet banking is", "Umang app launched by", "Can illiterate person be issued Debit card", "Minimum age required to open SB account in the bank", "Received Money from UPI is called?", "PPF means", "PAN number is required for"};

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
