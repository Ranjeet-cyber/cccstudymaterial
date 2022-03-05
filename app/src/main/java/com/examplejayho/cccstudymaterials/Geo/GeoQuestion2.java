package com.examplejayho.cccstudymaterials.Geo;

public class GeoQuestion2 {
    public String[][] mChoices = {new String[]{"Folder", "Backup", "Scandisk", "Format"}, new String[]{"कम्पाइलर द्वारा", "इंटरप्रेटर द्वारा", "ऑपरेटिंग सिस्टम द्वारा", "एप्लीकेशन सॉफ्टवेर द्वारा"}, new String[]{"Disk Operating Signal", "Disk Operating System", "Disk Orientation System", "Disk Orientaional Signal"}, new String[]{"MS Word", "MS DOS", "MS Excel", "MS Access"}, new String[]{"Internet Explorar", "Microsoft Edge", "Mozilla", "Chrome"}, new String[]{"Windows + D", "Windows Key", "Windows + Break", "Windows + M"}, new String[]{"1948", "1949", "1951", "1950"}, new String[]{"Formatting", "Booting", "Starting", "Entering"}, new String[]{"Internet Explorer Pro", "Opera", "Edge", "Cortana"}, new String[]{"Operating System", "Operating style", "Orientation system", "Operating signal"}};
    public String[] mCorrectAnswer = {"Folder", "ऑपरेटिंग सिस्टम द्वारा", "Disk Operating System", "MS DOS", "Microsoft Edge", "Windows + M", "1950", "Booting", "Edge", "Operating System"};
    public String[] mQuestion = {"सिस्टम टूल कौन सा नहीं है?", "BIOS का प्रयोग किसके द्वारा किया जाता है?", "DOS का पूरा नाम क्या हैं?", "निम्नलिखित में से कौन सा ऑपरेटिंग सिस्टम का एक उदाहरण है?", "Windows 10 के साथ मौजूद ब्राउज़र का नाम है?", "Windows OS में सभी विंडोज को Minimize करने के लिए हम कौनसी शॉटकट कुंजी का इस्तेमाल करेंगे?", "प्रथम ऑपरेटिंग सिस्टम कब विकसित किया गया था?", "कंप्यूटर चालू होने की प्रक्रिया को कहा जाता है?", "Windows 10 में नए ब्राउजर का नाम क्या है ?", "OS का पूरा नाम है?"};

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
