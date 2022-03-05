package com.examplejayho.cccstudymaterials.Chemistry;

public class ChemistryQuestion4 {
    public String[][] mChoices = {new String[]{"Ctrl+Shift+1", "Ctrl+Shift+3", "Ctrl+Shift+4", "Ctrl+Shift+5"}, new String[]{"1", "3", "4", "इनमे से कोई नहीं"}, new String[]{"Row 65536, Columns 256", "Row 1,048,576, Columns 256", "Row 1,048,576, Columns 16,384", "Row 16777216, Columns 256"}, new String[]{"एक डॉटेड बॉर्डर", "ब्लिंकिंग बॉर्डर", "डॉर्क विस्तृत बॉर्डर", "एक ग्रे कलर बॉर्डर"}, new String[]{"View", "Format", "Tools", "Edit"}, new String[]{"*", "/", "$", "="}, new String[]{"calc", "xl", "excel", "NONE OF THESE"}, new String[]{"Tools", "Data", "Window", "Formula"}, new String[]{"Ctrl+A", "Ctrl+Shift+A", "Ctrl+Shift+Space", "None Of These"}, new String[]{"2", "3", "4", "5"}};
    public String[] mCorrectAnswer = {"Ctrl+Shift+4", "3", "Row 65536, Columns 256", "डॉर्क विस्तृत बॉर्डर", "Edit", "=", "calc", "Tools", "Ctrl+A", "2"};
    public String[] mQuestion = {"Libreoffice Calc में किसी नंबर को करेंसी फॉर्मेट में बदलने के लिये किस कुंजी का प्रयोग करते है ?", "MS Excel 2010 में By default कितनी Sheet होती है?", "एम.एस.एक्सल 2003 में कितनी रो और कॉलम होते हैं ?", "सकिसी वर्कशीट में ‘एक्टिव सेल’ किस प्रकार डिसप्ले होती हैं?", "MS Excel में Fill option किस Menu में होता है ?", "Excel में सभी फ़ॉर्मुले किस से स्टार्ट होते है?", "लिब्रा ऑफिस Spreadsheet Program को किस नाम से जाना जाता है ?", "Libreoffice calc में गोल सीक फंक्शन किस मीनू में मिलता है?", "Libreoffice calc में Select all की शॉर्टकट की क्या है?", "Calc मे कितने प्रकार के सेल Reference होते हैं?"};

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
