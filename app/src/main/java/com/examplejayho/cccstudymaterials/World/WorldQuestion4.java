package com.examplejayho.cccstudymaterials.World;

public class WorldQuestion4 {
    public String[][] mChoices = {new String[]{"आपरेटिंग सिस्टम का नाम हैं", "बीमारी का नाम हैं", "केमिकल का नाम हैं", "कंप्यूटर वायरस हैं"}, new String[]{"पब्लिक द्वारा बनाया गया सॉफ्टवेयर", "इंटरनेट पर मुफ्त में उपलबध सॉफ्टवेयर", "सरकारी सॉफ्टवेयर", "माइक्रोसाफ्ट सॉफ्टवेयर"}, new String[]{"Power On Self Test", "Program On Self Test", "Power On System Test", "Program On System Test"}, new String[]{"शेयर वेयर", "कामर्शियल", "प्रायराइटरी", "ओपन सोर्स"}, new String[]{"फ्लॉपी डिस्क", "कंप्यूटर प्रोग्राम", "कंप्यूटर सर्किट", "ह्यूमन ब्रेन"}, new String[]{"शेयर वेयर", "एप्लिकेशन सॉफ्टवेयर", "ओपेन सोर्स सॉफ्टवेयर", "पब्लिक डोमेन सॉफ्टवेयर"}, new String[]{"जैक किल्बे", "बिल गेट्स", "मार्क एंडरसन", "हरमन हॉलेरिथ"}, new String[]{"Sixth generation", "Fifth generation", "First generation", "Third generation"}, new String[]{"डिस्क रीड ओनली मेंमोरी", "कॉम्पैक्ट डिस्क रीड ओनली मेमोरी", "ट्सर्क्यूलर डिस्क रीड ओनली मेंमारी", "उपरोक्त में से कोई नहीं"}, new String[]{"सीडी रॉम (CD ROM)", "सीडी रॉम (CD ROM)", "रजिस्टर (Registers)", "कैश (Cache)"}};
    public String[] mCorrectAnswer = {"आपरेटिंग सिस्टम का नाम हैं", "इंटरनेट पर मुफ्त में उपलबध सॉफ्टवेयर", "Power On Self Test", "ओपन सोर्स", "कंप्यूटर प्रोग्राम", "एप्लिकेशन सॉफ्टवेयर", "जैक किल्बे", "Fifth generation", "कॉम्पैक्ट डिस्क रीड ओनली मेमोरी", "रजिस्टर (Registers)"};
    public String[] mQuestion = {"लिनक्स एक।", "पब्लिक डोमेन सॉफ्टवेयर हैं।", "पोस्ट (POST) का पूरा रूप हैं।", "लिनक्स (Linux) किस किस्म का सॉफ्टवेयर हैं।", "कंप्यूटर के संदर्भ में सॉफ्टवेयर का अर्थ है।", "माइक्रोसाफ्ट ऑफिस है ?", "IC का निर्माण कीसने किया था", "Artificial Intelligence किस जनरेशन से संबंधित है", "सीडी रॉम (CD ROM) का पूर्ण रूप हैं।", "इनमें से सबसे तेज मेमोरी हैं।"};

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
