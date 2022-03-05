package com.examplejayho.cccstudymaterials.Chemistry;

public class ChemistryQuestion3 {
    public String[][] mChoices = {new String[]{"Ctrl+Space", "Shift+Space", "Ctrl+Shift+Page down", "None"}, new String[]{"Ctrl+Shift+C", "Ctrl+C", "Ctrl+Shift+T", "Ctrl+Alt+C"}, new String[]{"###", "सेल बड़ी हो जाती है और मान सही आता है", "####", "#Name?"}, new String[]{"Format", "Style", "Sheet", "Edit"}, new String[]{"Ctrl+Shift+P", "Ctrl+Shift+O", "Ctrl+P", "None"}, new String[]{"1024", "1048576", "16384", "None"}, new String[]{"Ctrl++", "Ctrl+-", "Ctrl+D", "Delete"}, new String[]{"Untitled1", "Calc1", "Spreadsheet1", "None"}, new String[]{"Ctrl+V", "Ctrl+M", "Ctrl+Shift+F", "Ctrl+1"}, new String[]{"Ctrl+W", "Ctrl+Q", "Ctrl+Shift+C", "Shift+W"}};
    public String[] mCorrectAnswer = {"Shift+Space", "Ctrl+Alt+C", "###", "Format", "Ctrl+Shift+O", "1024", "Ctrl+-", "Untitled1", "Ctrl+M", "Shift+W"};
    public String[] mQuestion = {"पूरे रो को सेलेक्ट करने के लिये किस शॉर्टकट कुंजी का प्रयोग करते है?", "Libreoffice में कमेंट के लिये किस कुंजी का प्रयोग करते है?", "Libreoffice Calc में अगर सेल से बड़ी वैल्यू होती है तो क्या मान आता है?", "Libreoffice Calc में मर्ज सेल्स कमांड किस मेनू में पाया जाता है?", "Libreoffice Calc में प्रिंट प्रीव्यू की शॉर्टकट key क्या है?", "Libreoffice Calc में कुल कितने कॉलम होते है?", "किसी सेल को डिलीट करने की शॉर्टकट की क्या है?", "Libreoffice Calc फाइल by default किस नाम से सेव होता है?", "Libreoffice Calc में डायरेक्ट फॉर्मेट क्लियर करने की शॉर्टकट कुंजी क्या है?", "Libreoffice Calc में कर्रेंट विंडोज से बाहर निकलने की शॉर्टकट कुंजी क्या है?"};

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
