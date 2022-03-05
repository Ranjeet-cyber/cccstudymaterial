package com.examplejayho.cccstudymaterials.Politics;

public class PoliticsQuestion1 {
    public String[][] mChoices = {new String[]{"People", "Process", "Connectivity", "Security"}, new String[]{"Bill Gates", "Kevin Ashton", "Steve Jobs", "McDonald"}, new String[]{"अपनी सोच कंप्यूटर में रखना", "अपनी बुद्धिमानी से की गई प्रोग्रामिंग", "मशीन को बुद्धिमान बनाना", "गेम खेलना"}, new String[]{"9th February 2018", "19th February 2018", "29th February 2018", "19th November 2018"}, new String[]{"Robot Process Automation", "Robotic Process Automation", "Robot Procedure Automation", "None"}, new String[]{"SaaS", "IaaS", "PaaS", "उपरोक्त सभी"}, new String[]{"Wipro", "HCL", "NASSCOM", "NIELIT"}, new String[]{"सेंसर", "नेटवर्क कनेक्टिविटी", "डेटा भण्डारण अनुप्रयोगों", "उपरोक्त सभी"}, new String[]{"Structured Data Only", "Unstructured Data Only", "Structured and Unstructured Data", "अन्य"}, new String[]{"Norton", "Avira", "Quick Heal", "उपरोक्त सभी"}};
    public String[] mCorrectAnswer = {"Security", "Kevin Ashton", "मशीन को बुद्धिमान बनाना", "19th February 2018", "Robotic Process Automation", "उपरोक्त सभी", "NASSCOM", "उपरोक्त सभी", "Structured and Unstructured Data", "उपरोक्त सभी"};
    public String[] mQuestion = {"निम्नलिखित में से कौन सा IOT का अंग नहीं है?", "इन्टरनेट ऑफ़ थिंग्स (IOT) शब्द का अविष्कार किसने किया?", "कृत्रिम बुद्धिमत्ता (Artificial Intelligence ) क्या है?", "फ्यूचर स्किल पोर्टल की शुरुआत कब हुई?", "RPA का पूर्ण अर्थ क्या है?", "निम्नलिखित में से कौन सा मॉडल सर्वोत्तम सर्विस मॉडल के रूप में जाना जाता है?", "फ्यूचर स्किल पोर्टल किसके द्वारा लांच किया गया है?", "IoT प्रणाली में मुख्य भाग है?", "निम्न में से क्या Big Data से सम्बंधित है?", "निम्नलिखित में से कौन सा एंटी वायरस प्रोग्राम है?"};

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
