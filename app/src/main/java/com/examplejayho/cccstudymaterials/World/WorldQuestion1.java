package com.examplejayho.cccstudymaterials.World;

public class WorldQuestion1 {
    public String[][] mChoices = {new String[]{"रास्टर स्केन", "केमरा लेंस", "हीट सेंसेटिव पेपर", "उपर्युक्त में से कोई नहीं"}, new String[]{"PRAM", "DRAM", "FLASH", "SRAM"}, new String[]{"Netscape", "Veronica", "Mosaic", "Lynx"}, new String[]{"रैम", "फ्लॉपी", "सी डी.", "डिस्क"}, new String[]{"10 टन", "40 टन", "30 टन", "20 टन"}, new String[]{"आर्यभट्ट", "सिद्धार्थ", "अशोक", "बुद्ध"}, new String[]{"सॉफ्टवेयर", "हार्डवेयर", "ऑपरेटिंग सॉफ्टवेयर", "इनमें से कोई नहीं"}, new String[]{"बिल गेट्स", "चार्ल्स बेबेज", "बेल्स पास्कल", "जोसेफ जैक्यूर्ड"}, new String[]{"मशीन", "मोडेम", "प्रोसेसर", "रजिस्टर"}, new String[]{"बेसिक भाषा", "कोबोल भाषा", "मशीनी भाषा", "फोरट्रान भाषा"}};
    public String[] mCorrectAnswer = {"रास्टर स्केन", "PRAM", "Mosaic", "रैम", "30 टन", "सिद्धार्थ", "हार्डवेयर", "चार्ल्स बेबेज", "मशीन", "मशीनी भाषा"};
    public String[] mQuestion = {"लेजर प्रिंटर का प्रयोग होता है", "निम्न में से कौन RAM नहीं है ?", "WWW के लिए पहले ग्राफिक्स ब्राउज़र का नाम था", "किस मेमोरी में रखा डाटा बिजली जाते ही समाप्त हो जाता है?", "एनिएक का वजन था?", "भारत में निर्मित प्रथम कंप्यूटर का क्या नाम है?", "कंप्यूटर के फिजिकल अंग को कहते हैं", "कंप्यूटर का जनक किसे कहा जाता है", "IMAC एक प्रकार का है", "कम्पयूटर कौनसी भाषा पर कार्य करता है"};

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
