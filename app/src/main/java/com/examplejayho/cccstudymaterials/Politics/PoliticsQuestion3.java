package com.examplejayho.cccstudymaterials.Politics;

public class PoliticsQuestion3 {
    public String[][] mChoices = {new String[]{"ईमेल स्पूफिंग", "ईमेल स्पैमिंग", "हैकिंग", "उपरोक्त सभी"}, new String[]{"MQTT", "Zigbee", "XMPP", "All of the above"}, new String[]{"उपलब्धता", "इंटीग्रिटी", "गोपनीयता", "उपरोक्त सभी"}, new String[]{"Performance", "Security", "Reliability", "None of above"}, new String[]{"गोपनीयता", "व्यवधान", "परिवर्तन", "उपरोक्त सभी"}, new String[]{"डाटा को देखना और प्रिंट करना", "कठिनाइयों के बिना कंप्यूटर संसाधनों तक पहुचना", "संसाधनों के डाटा का पृथक्करण और संरक्षण", "उपरोक्त सभी"}, new String[]{"Physical Problem", "Human Problem", "Authentication Problem", "All of the above"}, new String[]{"Confidentiality, Integrity, Availability", "Central, Intelligence, Agency", "Confidence, Integrity, Action", "Control, Intelligence, Action"}, new String[]{"Soliciting", "Stalking", "DoS Attack", "All of above"}, new String[]{"Computer Virus", "Trojan Horse", "Computer Worms", "All of the above"}};
    public String[] mCorrectAnswer = {"ईमेल स्पूफिंग", "All of the above", "गोपनीयता", "Security", "गोपनीयता", "संसाधनों के डाटा का पृथक्करण और संरक्षण", "Authentication Problem", "Confidentiality, Integrity, Availability", "All of above", "ए. ओ. ह्यूम"};
    public String[] mQuestion = {"ईमेल के माध्यम से बैंक डिटेल मांगना क्या कहलाता है?", "IoT में अधिकतम इस्तेमाल होने वाला प्रोटोकॉल?", "कंप्यूटर सुरक्षा में ........... का अर्थ है कि कंप्यूटर प्रणाली में सूचना केवल अधिकृत पार्टीज द्वारा देखने योग्य हो?", "Encryption तकनीक एक नेटवर्क ....... को बेहतर बनाती है", "सुरक्षित कंप्यूटिंग का मुख्य लक्ष्य क्या है?", "कंप्यूटर सुरक्षा में इंटिग्रिटी है?", "सिस्टम ऑपरेशन के लिए एक बड़ी सुरक्षा समस्या है?", "कंप्यूटर सुरक्षा के तीन बुनियादी घटक क्या हैं?", "निम्नलिखित में से कौन सा कंप्यूटर खतरे का एक वर्ग है?", "निम्नलिखित में से कौन सा इलेक्ट्रॉनिक भुगतान प्रणाली के लिए खतरा है?"};

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
