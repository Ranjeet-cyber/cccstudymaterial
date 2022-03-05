package com.examplejayho.cccstudymaterials.India;

public class IndiaQuestion4 {
    public String[][] mChoices = {new String[]{"बिल गेट्स", "चार्ल्स बाबेज", "लैरी पेज", "लेडी लारा"}, new String[]{"Shut Down", "Restart", "Sleep", "Hibernate"}, new String[]{"रूलर बार", "मेन्यू बार", "टास्क बार", "टाईटल बार"}, new String[]{"Ctrl+F2", "Shift+F3", "Ctrl+F3", "None Of These"}, new String[]{"JPEG", "HTML", "GIF", "WAV"}, new String[]{"Archie", "Dogpile", "Altavista", "Excite"}, new String[]{"Swift", "IFSC", "NEFT", "None"}, new String[]{"एक्सेस कैश स्टेट्स", "एक्सचेंज क्लियरिंग स्टैंडर्ड", "एक्सेंस क्रेडिट सुपरवाइजर", "इलेक्ट्रॉनिक क्लियरिंग सर्विस"}, new String[]{"सेंसर", "नेटवर्क कनेक्टिविटी", "डेटा भण्डारण अनुप्रयोगों", "उपरोक्त सभी"}, new String[]{"Ctrl+F6", "Ctrl", "Ctrl+F8", "Ctrl+F1"}, new String[]{"एनालॉग", "डिजीटल", "हाइब्रिड", "तीनों"}, new String[]{"2012", "2014", "2015", "2013"}, new String[]{"0.3’’", "0.5’’", "0.8’’", "1.0’’"}, new String[]{"Ctrl + H", "Ctrl + K", "Ctrl + L", "Ctrl + Shift + H"}, new String[]{"Ctrl + 1", "Ctrl + F2", "Ctrl + 2", "Ctrl + M"}, new String[]{"F4", "F5", "F6", "F7"}, new String[]{"Lee S Feyong", "Bill Gates", "Watson", "Tim Berner Lee"}, new String[]{"Mobile", "Mailing", "Mail", "All of these"}, new String[]{"बुरी साख वाले को", "गैरकानूनी गतिविधियां करने वाले को", "Loan की installments नही देने वाले को", "इनमें से कोई नहीं"}, new String[]{"Finance Ministry", "SBI", "RBI", "GOI"}};
    public String[] mCorrectAnswer = {"चार्ल्स बाबेज", "Restart", "टास्क बार", "Ctrl+F2", "HTML", "Archie", "Swift", "इलेक्ट्रॉनिक क्लियरिंग सर्विस", "उपरोक्त सभी", "Ctrl+F8", "हाइब्रिड", "2015", "0.5’’", "Ctrl + K", "Ctrl + 1", "F5", "Tim Berner Lee", "Mail", "Loan की installments नही देने वाले को", "RBI"};
    public String[] mQuestion = {"कंप्यूटर के जनक एवं पिता किसे कहा जाता है?", "निम्नलिखित में से किस विधि को अक्सर वार्म बूट कहा जाता है?", "कार्य क्षेत्र को मापन के लिए किस बार का उपयोग किया जाता हैं।", "Libreoffice calc में insert function की शॉर्टकट की क्या है?", "LibreOffice Impress में निम्न में से किस फाइल का प्रारूप नहीं लगा सकते?", "सबसे पहले सर्च इंजन का नाम था?", "इंटरनेशनल ट्रांजैक्शन में किस कोड की जरूरत पड़ती है?", "बैकिंग लेन-देन मे ECS का अर्थ है।", "IoT प्रणाली में मुख्य भाग है?", "Libreoffice Calc में किसी वैल्यू को हाईलाइट करने के लिये किस शॉर्टकट कुंजी का प्रयोग करते है ?", "वे कंप्यूटर जो एनालॉग व डिजीटल दोनों का कार्य करते हैं?", "Windows 10 को किस वर्ष लॉन्च किया गया था?", "एक बार tab दबाने पर कर्सर आगे आता है ?", "लिबर ऑफिस राइटर हाइपरलिंक का शॉर्टकट क्या है?", "Libreoffice Calc में Cell फोर्मटिंग के लिये किस शॉर्टकट कुंजी का प्रयोग करते है?", "Slide Show करने की शॉर्टकट की (Key) क्या है?", "WWW के आविष्कारक कौन है ?", "SMPT में 'M' का क्या अर्थ है?", "Defaulter किसे कहते है?", "ITZ Cash किस बैंक द्वारा अधिकृत मोबाइल वॉलेट है?"};

    public IndiaQuestion4() {
    }

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
