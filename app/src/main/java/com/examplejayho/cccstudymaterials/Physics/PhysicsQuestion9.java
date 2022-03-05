package com.examplejayho.cccstudymaterials.Physics;

public class PhysicsQuestion9 {
    public String[][] mChoices = {new String[]{"fixed sum is deposited every month", "period of deposit is a fixed tenure", "interest is paid at FDR rate", "All of above"}, new String[]{"Deposits", "Loans", "Both (a) & (b)", "None of above"}, new String[]{"National Payments Corporation of India", "Finance mini", "Bank", "None of above"}, new String[]{"Indian citizen", "Non Resident Indian", "Illiterate", "All of above"}, new String[]{"Covers life insurance up to Rs.2 lac", "Accident insurance cover", "Both (a) & (b)", "None of above"}, new String[]{"50", "55", "60", "65"}, new String[]{"25", "15", "5", "20"}, new String[]{"Fino Payments Bank", "Axis bank", "SBI", "ICICI"}, new String[]{"With High rate of interest", "No proper accounting", "No transparency", "All of above"}, new String[]{"Operation of account through internet", "Opening of account through ATM", "Both (a) & (b)", "None of above"}};
    public String[] mCorrectAnswer = {"All of above", "Loans", "National Payments Corporation of India", "All of above", "Covers life insurance up to Rs.2 lac", "60", "25", "Axis bank", "All of above", "Operation of account through internet"};
    public String[] mQuestion = {"In Recurring Deposits.", "Bank charges interest on", "UPI payment interface Developed by", "Who can open bank account", "What is Pradhan Mantri Jivan Jyoti Bima Yojana (PMJJBY)?", "The minimum age required for the APY Pension is?", "What is the charge for transfer between ₹ 200000 to ₹ 500000?", "Which bank started the first micro ATM based Aadhaar?", "Loans from money lenders are", "Internet banking refers to"};

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
