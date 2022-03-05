package com.examplejayho.cccstudymaterials.Physics;


public class PhysicsQuestion1 {
    public String[][] mChoices = {new String[]{"8", "6", "4 या 6", "4"}, new String[]{"Permanent Internet Number", "Personal Identification Number", "Permanent Identification Number", "None"}, new String[]{"Real Time Gross Sales", "Real Time Gross Settlement", "Right Time Gross Settlement", "None"}, new String[]{"Fino Payments Bank", "SBI", "DCB", "ICICI"}, new String[]{"भारतीय रिज़र्व बैंक", "बैंक ऑफ़ हिन्दुस्तान", "भारतीय स्टेट बैंक", "आन्ध्रा बैंक"}, new String[]{"Ministry of electronics & IT", "Ministry of Finance", "Ministry of HRD", "All of above"}, new String[]{"1996",  "1988"}, new String[]{"Unique Transaction Reference", "Unique Transfer Reference", "universal Transaction Reference", "None"}, new String[]{"Permanent sale", "Point of sold", "Post of sales", "Point of Sale"}, new String[]{"Aadhar – Based Reference Service", "Aadhar – Based Reenabled Service", "Aadhar – Based Remittance Service", "None"}};
    public String[] mCorrectAnswer = {"4 या 6", "Personal Identification Number", "Real Time Gross Settlement", "DCB", "बैंक ऑफ़ हिन्दुस्तान", "Ministry of electronics & IT", "Unique Transaction Reference", "Point of Sale", "Aadhar – Based Remittance Service"};
    public String[] mQuestion = {"UPI Pin कितने अंक का होता है?", "PIN का पूर्ण रूप क्या है?", "RTGS PIN का पूर्ण रूप क्या है?", "सबसे पहले आधार बेस्ड माइक्रो एटीएम किस बैंक ने शुरू किया?", "भारत का सबसे पहला बैंक है?", "Umang एप्लीकेशन को किस मंत्रालय द्वारा लॉन्च किया गया।", "NEFT की शुरूआत कब हुई ?", "UTR का पूर्ण रूप क्या है?", "POS का पूर्ण रूप क्या है?", "ABRS का पूर्ण रूप क्या है?"};

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
