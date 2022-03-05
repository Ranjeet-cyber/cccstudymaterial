package com.examplejayho.cccstudymaterials.Physics;

public class PhysicsQuestion4 {
    public String[][] mChoices = {new String[]{"पति / पत्नी", "पुत्र", "पुत्री", "इनमें से किसी को नहीं"}, new String[]{"Loan की installments नही देने वाले को", "बुरी साख वाले को", "गैरकानूनी गतिविधियां करने वाले को", "इनमें से कोई नहीं"}, new String[]{"Current account", "Savings Account", "Fixed Deposits", "इनमें से कोई नहीं"}, new String[]{"24 x 7 x 365", "24 x 7 x 366", "12 x 5 x 300", "इनमें से कोई नहीं"}, new String[]{"बैंक की जमाराशि को बढ़ावा देना", "बैंक द्वारा दिए गए एडवांस की सुरक्षा", "संदिग्ध प्रकृति के लेन-देन पर निगाह रखना", "आयकर अधिकारियों को एक एकत्रीकरण में सहायता करना"}, new String[]{"12", "16", "दोनों धारा", "इनमें से कोई नहीं"}, new String[]{"Card Verification Value", "Code for Verification Value", "Card Value Verification", "None"}, new String[]{"Adhaar Enabled Payment System", "Account Enabled Payment System", "Addhar Enabled Password System", "Addhar Enabled Payment System"}, new String[]{"Unified Payments Interface", "Unified Payments Internet", "Unique Payments Interface", "Universe Payments Interface"}, new String[]{"RBI", "IBM", "SBI", "NPCI"}};
    public String[] mCorrectAnswer = {"इनमें से किसी को नहीं", "Loan की installments नही देने वाले को", "Fixed Deposits", "24 x 7 x 365", "संदिग्ध प्रकृति के लेन-देन पर निगाह रखना", "16", "Card Verification Value", "Adhaar Enabled Payment System", "Unified Payments Interface", "NPCI"};
    public String[] mQuestion = {"ATM पासवर्ड किसको बताना चाहिए?", "Defaulter किसे कहते है?", "किस पर सबसे अधिक ब्याज (interest) मिलती है?", "हम ATM service कब use कर सकते हैं?", "KYC नियमों का एक उद्देश्य है ।", "क्रेडिट कार्ड और डेबिट कार्ड नंबर कितने डिजिट के होते हैं?", "CVV का पूर्ण रूप है?", "AEPS का पूर्ण रूप क्या है?", "UPI का पूर्ण रूप क्या है?", "वनिम्नलिखित में से किसने BHIM ऐप को विकसित किया है?"};

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
