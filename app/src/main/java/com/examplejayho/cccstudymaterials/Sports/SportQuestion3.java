package com.examplejayho.cccstudymaterials.Sports;

public class SportQuestion3 {
    public String[][] mChoices = {new String[]{"मोडूलेटर डिमोडूलेशन", "मोडूलेटर डिमोडूलेटर", "मोडूलेटर डिस्कशन", "इनमें से कोई नहीं"}, new String[]{"HTML", "Java", "TCP/IP", "ये सभी"}, new String[]{"32", "48", "64", "128"}, new String[]{"Microsoft", "ISP", "Google", "Government"}, new String[]{"डेड एंड", "होम पेज", "फ्रंट पेज", "बैकएंड पेज"}, new String[]{"www.nielitexams.com", "ww#.nielitexams.com", "www.nielitexams", "nielitexams@.com"}, new String[]{"RPC", "IP", "DHCP", "TCP"}, new String[]{"सर्च इंजन", "ब्राउजर प्रोग्राम", "डाटा बेस", "उपर्युक्त में से कोई नहीं"}, new String[]{"National Internet", "Network Information Center", "Network Interface Card", "Network Interface Code"}, new String[]{"265 बिट्स", "32 बिट्स", "128 बिट्स", "64 बिट्स"}};
    public String[] mCorrectAnswer = {"मोडूलेटर डिमोडूलेटर", "TCP/IP", "48", "ISP", "होम पेज", "www.nielitexams.com", "DHCP", "ब्राउजर प्रोग्राम", "Network Interface Card", "128 बिट्स"};
    public String[] mQuestion = {"मोडेम का पूरा नाम क्या है?", "इंटरनेट का स्टांडर्ड प्रोटोकॉल है ?", "Mac address कितने बिट्स का होता है?", "इंटरनेट के लिए पैसा किसे देते है?", "जब भी कोई यूजर किसी वेबसाइट को ओपन करता है, तो मुख्य पेज को कहते हैं?", "इनमें से कौन सा वेब साइट एड्रेस वैलिड है?", "कौन सा प्रोटोकॉल इंटरनेट में कनेक्ट क्लाइंट को आईपी एड्रेस असाइन करता है?", "इंटरनेट एक्सप्लोर हैं?", "NIC का पूर्ण रूप क्या है?", "IPv6 एड्रेस कि साइज ……………होती हैं?"};

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
