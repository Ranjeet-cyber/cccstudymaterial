package com.examplejayho.cccstudymaterials.History;

public class HistoryQuestion1 {
    public String[][] mChoices = {new String[]{"Ctrl + Shift + O", "Ctrl + shift + P", "Ctrl + F2", "Ctrl + P"}, new String[]{"Ctrl + Enter", "Shift + Enter", "Enter", "Ctrl + shift + Enter"}, new String[]{"Ctrl + Q", "Ctrl + W", "Ctrl + Shift + W", "None"}, new String[]{"Ctrl + C", "Ctrl + X", "Ctrl + K", "Shift + X"}, new String[]{".odt", ".ods", ".odp", ".docx"}, new String[]{".20", ".18", "1", "2"}, new String[]{"Shift + F12", "F12", "Ctrl + F12", "None"}, new String[]{"Tools", "Slide", "Insert", "None of these"}, new String[]{"Ctrl + 1", "Ctrl + 2", "Ctrl + Shift + 3", "Ctrl + 2"}, new String[]{"winzip", "winword", "msdoc", "msword"}};
    public String[] mCorrectAnswer = {"Ctrl + Shift + O", "Ctrl + Enter", "Ctrl + Q", "Ctrl + X", ".odt", ".18", "Shift + F12", "Tools", "Ctrl + 2", "winword"};
    public String[] mQuestion = {"LibreOffice writer में प्रिंट प्रीव्यू की शार्टकट की क्या है", "LibreOffice writer में पेज ब्रेक करने की शॉर्टकट की क्या है", "लिब्रेऑफिस में विंडोज को बंद करने का शार्टकट की क्या है", "लिब्रेऑफिस में text को कट करने की शॉर्टकट की क्या है?", "Libreoffice Writer में डिफ़ॉल्ट फाइल एक्सटेंशन क्या है?", "Libreoffice Calc मैं सेल की Height कितना होता है?", "LibreOffice writer में बुलेट लिस्ट जोड़ने के लिए किस कुंजी का प्रयोग करते हैं?", "Libre office में Macros की command किस menu मे मिलती है ?", "LibreOffice राइटर में Heading 2 के लिए शॉर्टकट कुंजी है?", "एम एस वर्ड को रन कमांड के द्वारा खोलने के लिए क्या टाईप करते है।"};

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
