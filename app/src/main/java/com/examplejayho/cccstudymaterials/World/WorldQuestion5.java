package com.examplejayho.cccstudymaterials.World;

public class WorldQuestion5 {
    public String[][] mChoices = {new String[]{"Compact Drum Read Write", "Compact Diskette Read Write", "Compact Dies Read Only Than Write", "Compact Disc Re Writable"}, new String[]{"इसे रीड और राइट दोनों के लिए प्रयोग किया जाता हैं", "इसमें किसी भी लोकेशन को सीधे पढ़ा जा सकता है", "इसमें डाटा बनाये रखने के लिए लगातार पॉवर सप्लाई की जरूरत होती हैं।", "इसमें लगातार पॉवर सप्लाई की जरूरत नहीं होती"}, new String[]{"RAM", "Floppy", "CD ROM", "Blu-ray"}, new String[]{"ICR", "OCR", "MICR", "All of the above"}, new String[]{"पॉइंटिंग डिवाइस है", "एक ऑप्टिकल स्कैनर है", "मैग्नेटिक इंक का प्रयोग करता है", "उपर्युक्त मे से कोई नहीं"}, new String[]{"पेरिफेरल", "सॉफ्टवेयर", "ऑपरेटिंग सिस्टम", "स्टोरेज"}, new String[]{"Fedora", "macOS", "MS-DOS", "Android"}, new String[]{"Unique Serial Bus", "Universal Serial Bus", "Union Serial Bus", "Unknown Serial Bus"}, new String[]{"डाटा संग्रहण", "डाटा को सजाना", "डाटा को उपयोगी बनाना", "उपरोक्त सभी"}, new String[]{"आई.सी", "प्रोसेसर", "वैक्यूम ट्यूब", "कोई नहीं"}};
    public String[] mCorrectAnswer = {"Compact Disc Re Writable", "इसमें डाटा बनाये रखने के लिए लगातार पॉवर सप्लाई की जरूरत होती हैं।", "Blu-ray", "All of the above", "पॉइंटिंग डिवाइस है", "पेरिफेरल", "Android", "Universal Serial Bus", "डाटा को उपयोगी बनाना", "प्रोसेसर"};
    public String[] mQuestion = {"नCD–RW का पूरा रूप हैं।", " रैम (RAM) वोलाटाइल (Volatile) या अस्थायी मेमोरी हैं क्योकि", "इनमें से किस Secondary उपकरण में अधिकतम डेटा संग्रहण करने की क्षमता है", "निम्नलिखित में से कौन सा character पहचान करने की तकनीक है?", "एक लाइट पेन", "कंप्यूटर के किस भाग को आप देख व छू सकते है", "निम्नलिखित में से कौन UNIX पर आधारित ऑपरेटिंग सिस्टम नहीं है?", "USB का पूर्ण रूप है?", "डाटा प्रोसेसिंग का अर्थ है?", " चतुर्थ पीढ़ी के कंप्यूटरों की मुख्य विशेषता थी?"};

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
