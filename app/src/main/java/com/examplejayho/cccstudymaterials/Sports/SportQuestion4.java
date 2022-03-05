package com.examplejayho.cccstudymaterials.Sports;

public class SportQuestion4 {
    public String[][] mChoices = {new String[]{"रेडिफ.कॉम", "लाईकॉस.कॉम", "ई-मेल", "उपरोक्त सभी"}, new String[]{"संचार", "संसाधन भागीदारी", "विश्र्वसनीयता", "उपरोक्त सभी"}, new String[]{"Simple", "Half Duplex", "Full Duplex", "None"}, new String[]{"Internet service provider", "International service provider", "Internet service post", "None"}, new String[]{"टोटल कॉल प्रोटोकॉल", "ट्रांसमिशन कंट्रोल प्रोटोकॉल", "ट्रांसमिशन कॉल प्रोटोकॉल", "ट्रांसमिशन सर्किट पोल"}, new String[]{"इंडियन सर्विस प्वाइंट", "इंटरनेशनल सर्विस प्वांइट", "इंटरनेट सर्विस प्रोवाइडर", "उपर्युक्त मे से कोई नही"}, new String[]{".com", "https", "www", "nielitexams"}, new String[]{"ENS", "DNS", "RNS", "ENS"}, new String[]{"एफटीपी", "ई-मेल", "ई-कॉमर्स", "उपरोक्त सभी"}, new String[]{"सब्सक्राइबर्स आइडेंटिटी माडयूल", "सब्सक्राइबर्स आइडेंटिटी मशीन", "सेल्फ आइडेंटिटी मशीन", "सेल्फ आइडेंटिटी माडयूल"}};
    public String[] mCorrectAnswer = {"उपरोक्त सभी", "उपरोक्त सभी", "Half Duplex", "Internet service provider", "ट्रांसमिशन कंट्रोल प्रोटोकॉल", "इंटरनेट सर्विस प्रोवाइडर", "https", "DNS", "उपरोक्त सभी", "सब्सक्राइबर्स आइडेंटिटी माडयूल"};
    public String[] mQuestion = {"निम्न में से मुफ्त ई-मेल कौन सी वेबसाइट उपलब्ध करती हैं?", "नेटवर्क का मुख्य उद्देश्य हैं?", "जब दो लोग बात करें एक समय में एक ही साइड से तो उसे क्या कहेंगे?", "ISP का पूर्ण रूप है?", "TCP का पूर्ण रूप क्या है।", "ISP किसका संक्षिप्त रूप है।", "https://www.nielitexams.com इस यूआरएल एड्रेस में प्रोटोकॉल कौन सा हैं?", "इन्टरनेट से जुड़े कम्प्यूटरों को पता देने वाली प्रणाली हैं।", "इन्टरनेट पर उपलब्ध सुविधाएं हैं।", "सिम (SIM) का पूरा स्वरूप हैं।"};

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
