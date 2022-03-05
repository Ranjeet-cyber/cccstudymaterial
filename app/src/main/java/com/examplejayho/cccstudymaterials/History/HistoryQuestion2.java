package com.examplejayho.cccstudymaterials.History;

public class HistoryQuestion2 {
    public String[][] mChoices = {new String[]{"प्रोग्राम", "टेक्स्ट", "ग्राफ", "डाक्यूमेंट"}, new String[]{"मार्जिन, पेपर साइज, कलर", "पेपर स्त्रोत, ले आउट", "A और B दोनों", "फाइल का नाम"}, new String[]{"1", "1.5", "2", "2.5"}, new String[]{"रूलर बार", "मेन्यू बार", "टास्क बार", "टाईटल बार"}, new String[]{"प्रिन्ट", "वेब पेज प्रिव्यू", "प्रिंट प्रिव्यू", "सेंड टू"}, new String[]{"Ctrl + ]", "Ctrl + }", "Ctrl + [", "a & b both"}, new String[]{"Ctrl+L", "Ctrl+ Shift+L", "Shift+L", "Ctrl+E"}, new String[]{"Alt + B", "Ctrl + O", "Alt + O", "Ctrl + B"}, new String[]{"Ctrl + Shift + U", "Ctrl + A", "Alt + E", "Ctrl + U"}, new String[]{"72", "96", "70", "90"}};
    public String[] mCorrectAnswer = {"डाक्यूमेंट", "A और B दोनों", "1", "टास्क बार", "प्रिंट प्रिव्यू", "a & b both", "Ctrl+L", "Ctrl + B", "Ctrl + U", "96"};
    public String[] mQuestion = {"LibreOffice मे बनाई गई फाईल को किस नाम से जाना जाता है।", "पेज सेटअप कमाण्ड की सहायता से किनको बदला जा सकता हैं।?", "LibreOffice writer में बाय डिफॉल्ट लाइन स्पेसिंग कितनी होती है?", "कार्य क्षेत्र को मापन के लिए किस बार का उपयोग किया जाता हैं।", "किस कमाण्ड द्वारा डॉक्युमेंन्ट को प्रिंट करने से पूर्व देख सकते हैं।", "LibreOffice writer फोंट साइज इंक्रीज करने की शॉर्टकट की क्या है?", "Align Left के लिए शॉर्टकट की है?", "सिलेक्टेड लाइन को बोल्ड करने की शॉर्टकट कुंजी हैं।", "सिलेक्टेड लाइन को अंडरलाइन करने की शॉर्टकट कुंजी हैं।", "LibreOffice Writer मैं अधिकतम फोंट साइज कितना हो सकता है?"};

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
