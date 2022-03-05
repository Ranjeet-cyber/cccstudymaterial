package com.examplejayho.cccstudymaterials.World;

public class WorldQuestion2 {
    public String[][] mChoices = {new String[]{"बिल गेट्स", "चार्ल्स बाबेज", "लैरी पेज", "लैरी पेज"}, new String[]{"आईबीएम", "एससीएल", "सीआरसी", "सी–डैक"}, new String[]{"डिजिटल संकेतों का", "एनालॉग संकेतों का", "दोनों", "किसी का नहीं"}, new String[]{"माऊस", "की-बोर्ड", "स्कैनर", "इनमें से सभी"}, new String[]{"डेटा को", "संख्याओं को", "एकत्रित डेटा को", "ये सभी"}, new String[]{"कैलकुलेटर", "डिफरेंस इंजन", "अबैकस", "घड़ी"}, new String[]{"जैक्वार्ड", "पावरस", "पास्कल", "इनमें से कोई नहीं"}, new String[]{"माइक्रो कंप्यूटर", "मेनफ्रेम कंप्यूटर", "मिनी कंप्यूटर", "सुपर कंप्यूटर"}, new String[]{"चेन्‍नई", "दिल्‍ली", "बेग्‍लुरू", "मुम्‍बई"}, new String[]{"फाइबर से", "सेमी कण्‍डक्‍टर से", "प्‍लास्टिक से", "इनमें से कोई नहीं"}};
    public String[] mCorrectAnswer = {"चार्ल्स बाबेज", "सीआरसी", "दोनों", "इनमें से सभी", "एकत्रित डेटा को", "अबैकस", "इनमें से कोई नहीं", "सुपर कंप्यूटर", "बेग्‍लुरू", "सेमी कण्‍डक्‍टर से"};
    public String[] mQuestion = {"कंप्यूटर के जनक एवं पिता किसे कहा जाता है", "विश्‍व के प्रथम सुपर कम्‍प्‍यूटर का निर्माण किया।", "हाइब्रिड कम्‍प्‍यूटर में प्रयोग होता हैं।", "निम्न में कौन इनपुट इकाई है ?", "कंप्यूटर में सुचना किसे कहा जाता है ?", "प्रथम गणना यंत्र है ?", "किसने पंच कार्ड का आरंभ किया ?", "CRAY क्या है ?", "भारत में सिलिकन वैली (Silicon Valley) स्थित हैं।", "आईपी चिपों (IC Chips) का निर्माण किया जाता हैं।"};

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
