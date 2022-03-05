package com.examplejayho.cccstudymaterials.Politics;

public class PoliticsQuestion2 {
    public String[][] mChoices = {new String[]{"MapReduce", "Hadoop", "Hive", "None of these"}, new String[]{"System", "Secure", "Static", "Simple"}, new String[]{"Open – Source", "Scalability", "Data Recovery", "उपरोक्त सभी"}, new String[]{"Privacy and Security", "Energy Consumption", "Network Congestion", "All of the above"}, new String[]{"Networks of data-gathering sensors", "Cloud computing", "Both", "Neither"}, new String[]{"Wiring", "Drawing", "Mathematics", "French"}, new String[]{"SaaS", "IaaS", "PaaS", "All of the mentioned"}, new String[]{"पासवर्ड अटैक", "फिशिंग", "मेल वायर इंजिग", "डिनायल ऑफ़ सर्विसेज"}, new String[]{"ई-मेल स्पूफिंग", "ई-मेल स्पैमिंग", "ई-मेल बाम्बिंग", "उपर्युक्त में से कोई नहीं"}, new String[]{"स्पाईवेयर", "वायरस", "ट्रोजन हॉर्स", "इनमे से कोई नहीं"}};
    public String[] mCorrectAnswer = {"MapReduce", "Secure", "उपरोक्त सभी", "All of the above", "Cloud computing", "Mathematics", "All of the mentioned", "फिशिंग", "ई-मेल स्पैमिंग", "स्पाईवेयर"};
    public String[] mQuestion = {"निम्नलिखित में से कौन सा बिग डाटा फ्रेमवर्क गूगल द्वारा विकसित किया गया था?", "HTTPS में S का क्या मतलब है?", "बिग डाटा एनालिटिक्स की विभिन्न विशेषताए क्या है?", "इंटरनेट ऑफ थिंग्स में किन जोखिमों और चुनौतियों पर विचार किया जाना चाहिए?", "IoT किस पर बनाया गया है?", "निम्नलिखित में से कौन AI के निकटतम आधार है?", "निम्नलिखित में से कौन सबसे अच्छा ज्ञात सेवा मॉडल है?", "किस प्रकार के साइबर अटैक मे आपसे आपकी जानकारी मांगी जाती हैं, जैसे आपके पासवर्ड, नाम, जन्म तिथी, पिन आदि?", "एक निश्चित पते पर किसी एव्यूजर द्वारा बार–बार एक ही ई–मेल संदेश भेजना कहलाता हैं।", "निम्न में से कौन सा सॉफ्टवेर आपके कंप्यूटर की जासूसी करता है और सम्बंधित सूचनाओ का आदान प्रदान करता है?"};

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
