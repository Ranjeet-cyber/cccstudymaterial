package com.examplejayho.cccstudymaterials.Sports;

public class SportQuestion1 {
    public String[][] mChoices = {new String[]{"First", "Second", "Third", "Fourth"}, new String[]{"user id", "URL", "Time stamp", "ये सभी"}, new String[]{"फाइल ट्रान्सफर प्रोटोकाल", "फाइल ट्रान्सफर प्रॉबलम्ब", "फाइल ट्रान्सफर प्रीवियस", "इनमें से कोई नहीं"}, new String[]{"15 अगस्त, 1995", "10 अगस्त, 1995", "8 अगस्त, 1994", "7 अगस्त, 1996"}, new String[]{"Permanent Account Number", "Personal Area Network", "Permanent Area Network", "None"}, new String[]{"Google", "Yahoo", "Baidu", "Wolfram Alpha"}, new String[]{"Archie", "Dogpile", "Altavista", "Excite"}, new String[]{"Worldwide corporation", "W3C", "World Wide Consortium", "World Wide Web Standard"}, new String[]{"To select multiple option", "To select single option", "To select all option", "All of above"}, new String[]{"Baidu", "Google", "Yahoo", "Bing"}};
    public String[] mCorrectAnswer = {"Fourth", "URL", "फाइल ट्रान्सफर प्रोटोकाल", "15 अगस्त, 1995", "Personal Area Network", "Wolfram Alpha", "Archie", "World Wide Consortium", "All of above", "Baidu"};
    public String[] mQuestion = {"LAN MAN WAN का प्रयोग किस पीढ़ी में किया गया?", "वेबसाइट का address निम्नलिखित में से क्या कहलाता हैं?", "इंटरनेट से सम्बन्धित FTP शब्द का पूरा मतलब क्या हैं ?", "भारत में इंटरनेट की शुरुआत कब हुई ?", "PAN का पूर्ण रूप क्या है?", "इनमें से कौन सर्च इंजन नहीं है ?", "सबसे पहले सर्च इंजन का नाम था?", "वर्ल्ड वाइड वेब(World Wide Web) मानक किसके द्वारा बनाया गया?", "रेडियो बटन का कार्य क्या है?", "चीन में कौन सा सर्च इंजन चलता है?"};

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
