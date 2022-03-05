package com.examplejayho.cccstudymaterials.Economy;

public class EconomyQuestion3 {
    public String[][] mChoices = {new String[]{"23 Nov 2017", "10 Dec 2017", "20 Nov 2017", "5 Nov 2017"}, new String[]{"फास्ट गेमिंग", "फास्टट्रैक मोबाइल गवर्नेंस", "स्लो गेमिंग", "इनमें से कोई नहीं"}, new String[]{"15MB", "20MB", "25MB", "10MB"}, new String[]{"Internet payment system", "Immediate payment service", "Immediate payment system", "All of these"}, new String[]{"पारदर्शिता", "दक्षता", "जवाबदेही", "सभी"}, new String[]{"Two factor Auditions", "Two factor Verification", "Two factor Authorised", "Two factor authentication"}, new String[]{"नोट पैड", "वर्क बुक", "मेसेज कंपोजिशन विंडो", "इनमे से कोई नही"}, new String[]{"E-goverence", "E-commerce", "E-mail", "None"}, new String[]{"larry page", "Paul Buchheit", "Sergey Brin", "Sundar Pichai"}, new String[]{"Body", "Subject", "CC", "BCC"}};
    public String[] mCorrectAnswer = {"23 Nov 2017", "फास्टट्रैक मोबाइल गवर्नेंस", "25MB", "Immediate payment service", "सभी", "Two factor authentication", "मेसेज कंपोजिशन विंडो", "E-commerce", "Paul Buchheit", "Body"};
    public String[] mQuestion = {"उमंग एप को भारत में कब शुरू किया गया?", "उमंग एप का उद्देश्य है?", "हम जी-मेल में अधिकतम कितने साइज की फाइल को अटैचमेंट कर सकते है?", "IMPS का पूरा नाम क्या है?", "ई-गवर्नेंस प्रक्रिया बदलाव करती है?", "2FA का पूरा नाम है?", "ई-मेल के लिये संदेश कहाँ बनाते है।", "Indiamart क्या है?", "Gmail के Founder कौन है?", "ई-मेल में मुख्य content कहाँ होता है?"};

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
