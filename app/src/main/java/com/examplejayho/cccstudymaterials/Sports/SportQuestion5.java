package com.examplejayho.cccstudymaterials.Sports;

public class SportQuestion5 {
    public String[][] mChoices = {new String[]{"जैव प्रौद्योगिकी", "अंतरिक्ष प्रौद्योगिकी", "मिसाइल प्रौद्योगिकी", "संचार प्रौद्योगिकी"}, new String[]{"हार्डवेयर से", "साफ्टवेयर से", "साइबर क्राइम से", "इंटरनेट से"}, new String[]{"ग्लोबल", "गवर्नमेंट", "जेनेरेशन", "गूगल"}, new String[]{"उपकरणों के बीच वायरलेस संचार को", "मोबाइल फोन पर सिग्नल प्रसारण को", "लैंडलाइन से मोबाइल फोन संचार", "सेटेलाइट टेलीफोन संचार"}, new String[]{"लिंक", "सर्वर", "गेटवे", "ब्रिज वे"}, new String[]{"फाइल ट्रान्सफर प्रोटोकाल", "फाइल ट्रान्सफर प्रॉबलम्ब", "फाइल ट्रान्सफर प्रीवियस", "इनमें से कोई नहीं"}, new String[]{"अमेरिका", "रूस", "भारत", "कोई भी मालिक नहीं है"}, new String[]{"Internet Mobile Equipment Identity", "International Mobile Equipment Identity", "International Mobile Enquiry Identity", "इनमे से कोई नहीं"}, new String[]{"16", "32", "64", "64"}, new String[]{"SMTP", "FTP", "TCP/IP", "IRC"}};
    public String[] mCorrectAnswer = {"संचार प्रौद्योगिकी", "इंटरनेट से", "जेनेरेशन", "उपकरणों के बीच वायरलेस संचार को", "गेटवे", "फाइल ट्रान्सफर प्रोटोकाल", "कोई भी मालिक नहीं है", "International Mobile Equipment Identity", "32", "SMTP"};
    public String[] mQuestion = {"Wi Max निम्नलिखित में से किससे संबंधित हैं।", "बैकबोन (Backbone) संबंधित हैं।", "2G स्पेक्ट्रम में अक्षर ‘G’ किस शब्द के लिए प्रयुक्त हैं।", "ब्लूटूथ (Bluetooth) प्रौद्योगिकी संभव बनाती हैं।", "दो नेटवर्को को आपस में जोड़ने वाला कम्प्यूटर हैं।", "इंटरनेट से सम्बन्धित FTP शब्द का पूरा मतलब क्या हैं ?", "इंटरनेट का मालिक कौन है?", "IMEI का फुलफॉर्म क्या है ?", "IPv4 एड्रेस की लंबाई कितने बिट की होती है?", "निम्न में से कौन सा प्रोटोकॉल ईमेल के लिए यूज़ किया जाता है ?"};

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
