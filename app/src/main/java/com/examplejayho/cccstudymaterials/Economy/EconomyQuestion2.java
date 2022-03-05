package com.examplejayho.cccstudymaterials.Economy;


public class EconomyQuestion2 {
    public String[][] mChoices = {new String[]{"समाजवादी पार्टी", "भारतीय जनता पार्टी", "राष्ट्रिय जनता पार्टी", "लोक जनशक्ति पार्टी"}, new String[]{"इलेक्ट्रिक मेल", "इलेक्ट्रॉनिक मेल", "इंग्लिश मेल", "इसेन्सियल मेल"}, new String[]{"(_)", "()", "(.)", "(@)"}, new String[]{"रेडिफमेल", "याहू", "हॉटमेल", "ये सभी"}, new String[]{"ब्राउज़र", "वायरस", "सर्च इंजन", "ऑपरेटिंग सिस्टम"}, new String[]{"E Governance", "Social Media", "IMM", "None"}, new String[]{"प्रोटोकोल", "ब्राउजर", "सर्च इंजन", "इसमें से कोई नही"}, new String[]{ "1998",  }, new String[]{"रेलवे सेवा प्रदाता", "ईमेल सेवा प्रदाता", "प्लास्टिक मनी", "ईवालेट"}, new String[]{"Mobile", "Mailing", "Mail", "All of these"}};
    public String[] mCorrectAnswer = {"भारतीय जनता पार्टी", "इलेक्ट्रॉनिक मेल", "()", "हॉटमेल", "सर्च इंजन", "E Governance", "सर्च इंजन", "रेलवे सेवा प्रदाता", "Mail"};
    public String[] mQuestion = {"भारत की पहली राजनीतिक पार्टी जिसने इंटरनेट पर अपना वेबसाइट बनाया?", "ई-मेल का पूरा नाम क्या है ?", "निम्नलिखित में से कौन-सा ईमेल का भाग नहीं है?", "निम्नलिखित में से कौन निःशुल्क ई-मेल सेवा प्रदान करता है ?", "गूगल क्या है ?", "eMitra किससे सम्बंधित है?", "Yahoo क्या है?", "Whatsapp की स्थापना कब हुई ?", "IRCTC से क्या आशय है?", "SMPT में 'M' का क्या अर्थ है?"};

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
