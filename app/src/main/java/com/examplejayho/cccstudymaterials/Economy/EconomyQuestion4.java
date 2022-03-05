package com.examplejayho.cccstudymaterials.Economy;

public class EconomyQuestion4 {
    public String[][] mChoices = {new String[]{"Continuous Wave Radar", "Continuous Wave Reader", "Continuous Web Radar", "None"}, new String[]{"Inbox", "Trash", "Outbox", "Draft"}, new String[]{"पावर पाइंट", "इनबॉक्स", "सेंडर", "रिसीवर"}, new String[]{"Amazon", "Twitter", "LinkedIn", "Instagram"}, new String[]{"T.B. Lee (1971 में)", "Ray Tomlinson (1971 में)", "Robert Tanenbaum (1973 में)", "Mark Anderson (1986 में)"}, new String[]{"इंग्लिश मेल", "एड्रेस मेल", "इलेक्ट्रानिक मेल", "इलेक्ट्रिक मेल"}, new String[]{"टु", "सब्जेक्ट", "कनेक्ट", "CC"}, new String[]{"Unique Mobile Application for New-age Governance", "Unified Mobile Application for New-age Governance", "Universal Mobile Application Net Goods", "United Mobile Application National Governance"}, new String[]{"B2B", "B2G", "C2C", "B2C"}, new String[]{"B2B", "C2B", "B2C", "Enterprise Commerce"}};
    public String[] mCorrectAnswer = {"Continuous Wave Radar", "Outbox", "पावर पाइंट", "Amazon", "Ray Tomlinson (1971 में)", "इलेक्ट्रानिक मेल", "सब्जेक्ट", "Unified Mobile Application for New-age Governance", "B2B", "B2C"};
    public String[] mQuestion = {"CRW का पूर्ण रूप है?", "आपके द्वारा भेजा गया ई-मेल कहां पर स्टोर होता है?", "निम्न में से कौन-सा ईमेल से संबंधित शब्द नहीं है ?", "निम्न में से कौनसी साइट सोशल साइट नहीं है?", "प्रथम ईमेल किसके द्वारा भेजा गया था?", "ई-मेल का पूर्ण रूप क्या है।", "ईमेल भेजते समय कौनसी लाइन विषय वस्तु का विवरण देती है", "UMANG का फुल फॉर्म है?", "किस प्रकार का ई-कॉमर्स कंपनियों के बीच में स्थापित होता है ?", "जब कोई व्यवसाय अपने उत्पादों को इंटरनेट पर उपभोक्ताओं को  बेचता है तो इस प्रकार का वाणिज्य होता है ?"};

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
