package com.examplejayho.cccstudymaterials.Physics;

public class PhysicsQuestion6 {
    public String[][] mChoices = {new String[]{"Linked Adhar card to Gas Connection", "Linked Adhar card to Post office", "Linked Adhar card to Bank Account", "None of Above"}, new String[]{"23 November 2017", "27 November 2015", "15 August 2017", "17 July 2018"}, new String[]{"SBI", "ICICI", "BOB", "RBI"}, new String[]{"Fire", "Theft", "Burglary", "All of above"}, new String[]{"Fixed deposit account", "Recurring Deposit Account", "Savings bank account", "All of the above"}, new String[]{"Immediate Payment Service", "Internet Payment Service", "Internet Pay Service", "Internet Media Payment Service"}, new String[]{"Issued by Bank", "Contains transaction details of Bank account", "Shows balance in account", "All of above"}, new String[]{"Current account", "Savings Account", "Fixed Deposits", "None of above"}, new String[]{"Only the locker holder knows", "The bank knows", "Both (A) and (B)", "None of the above"}, new String[]{"Monthly basis", "Quarterly basis", "Half yearly basis", "Yearly basis"}};
    public String[] mCorrectAnswer = {"Linked Adhar card to Bank Account", "23 November 2017", "SBI", "All of above", "All of the above", "Immediate Payment Service", "1971", "Fixed Deposits", "Only the locker holder knows", "Quarterly basis"};
    public String[] mQuestion = {"What is Adhar Seeding?", "When did the Umang app start in India?", "Which bank has the largest area (Branches)?", "General Insurance relates to insurance against", "Can a nominee be added to a bank account?", "IMPS stands for", "Bank Pass Book is", "Which type of deposits earns higher interest rate?", "Things kept in the locker", "Interest on FDRs is compounded on"};

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
