package com.examplejayho.cccstudymaterials.Physics;


public class PhysicsQuestion8 {
    public String[][] mChoices = {new String[]{"Spell check it", "Review it", "Verify and validate it", "Organise and simplify it"}, new String[]{"Loans", "Deposits", "Both deposits & loans", "None of the options"}, new String[]{"Cash withdrawal", "Account enquiry", "Statement of account", "All of above"}, new String[]{"Provides social security to the unorganized sector", "Encourages workers to voluntarily save for their retirement", "Fixed pension is paid on attaining age of 60 years", "All of above"}, new String[]{"NPCI", "UIDAI", "RBI", "All"}, new String[]{"Cash withdrawal", "Account inquiries", "Account Description", "All of the above"}, new String[]{"Accident insurance cover of Rs.1.00 lac", "Life insurance cover of Rs.30,000", "Overdraft facility up to Rs.5,000", "All of above"}, new String[]{"2017", "2015", "2010", }, new String[]{"Open wallet", "Semi open wallet", "Semi closed wallet", "None of the above"}, new String[]{"Government of India", "NABARD", "Public sector banks", "State Bank of India"}};
    public String[] mCorrectAnswer = {"Verify and validate it", "Deposits", "All of above", "All of above", "NPCI", "All of the above", "All of the above", "2010", "Semi open wallet", "Government of India"};
    public String[] mQuestion = {"Before you analyse data, you must do the following", "Bank pays interest on", "ATM can be used for", "What is Atal Pension Yojana (APY)?", "UPI was developed by", "Use of ATMs", "What are the benefits attached to PMJDY?", "When did electronic wallet become operational in India?", "Which mobile wallet does not permit cash withdrawal", "Coins are issued by"};

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
