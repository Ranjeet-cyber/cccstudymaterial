package com.examplejayho.cccstudymaterials.Physics;

public class PhysicsQuestion3 {
    public String[][] mChoices = {new String[]{"Balance enquiry", "Account Transation", "Payment", "All of the above"}, new String[]{"RIGS", "कोर बैंकिंग", "MICR", "NEFT"}, new String[]{"5 वर्ष", "10 वर्ष", "15 वर्ष", "18 वर्ष"}, new String[]{"निर्धारित न्यूनतम सीमा रु 1 लाख और अधिकतम रु 10 लाख है", "निर्धारित न्यूनतम सीमा रु 25000 और अधिकतम रु 1 लाख है", "निर्धारित न्यूनतम सीमा रु 2 लाख और अधिकतम सीमा कोई नहीं है", "निर्धारित न्यूनतम सीमा रु 25000 और अधिकतम सीमा कोई नहीं है"}, new String[]{"Know your customer", "Know your character", "ऊपर दिए दोनों", "इनमें से कोई नहीं"}, new String[]{"Time Deposit Scheme", "Total Deposit Scheme", "Tax Deducted at Source", "इनमें से कोई नहीं"}, new String[]{"Private Sector Banks", "Regional Rural Banks", "Public Sector Banks", "ऊपर दिए सभी"}, new String[]{"Quated Monthly Installment", "Equal Monthly Installment", "Extra Monthly Installment", "Extra Monthly Investment"}, new String[]{"Person having Pension Facilities", "Public Provident Fund", "Permanent Practitioner’s Forum", "Pension Planning Funds"}, new String[]{"जारी करने के 4 महीनें तक", "जारी करने के 3 महीनें तक", "जारी करने के 1 महीनें तक", "कोई limit नही होती है"}};
    public String[] mCorrectAnswer = {"All of the above", "NEFT", "10 वर्ष", "निर्धारित न्यूनतम सीमा रु 2 लाख और अधिकतम सीमा कोई नहीं है", "Know your customer", "Tax Deducted at Source", "ऊपर दिए सभी", "Quated Monthly Installment", "Public Provident Fund", "जारी करने के 3 महीनें तक"};
    public String[] mQuestion = {"इनमें से कौन सा मोबाइल बैंकिंग सेवा है?", "निम्मलिखित में से कौन-सी इण्टरनेट के माध्यम से फण्ड स्थानान्तरित करने की प्रणाली है?", "बचत खाता खोलने की न्यूनतम आयु है?", "RTGS लेन-देन के लिए निर्धारित न्यूनतम और अधिकतम सीमा (रुपयों में) क्या है ?", "KYC की full form क्या है?", "TDS full form क्या है?", "Bank draft कौन जारी करता है?", "EMI का full form क्या है?", "PPF का क्या full form है?", "चेक की validity कब तक रहती है?"};

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
