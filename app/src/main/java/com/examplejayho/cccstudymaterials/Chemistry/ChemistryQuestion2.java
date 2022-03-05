package com.examplejayho.cccstudymaterials.Chemistry;

public class ChemistryQuestion2 {
    public String[][] mChoices = {new String[]{"Alt+Tab", "Tab", "Alt", "Shift+Tab"}, new String[]{"Ctrl+Shift+J", "Ctrl+Shift+F11", "F11", "Not"}, new String[]{"10,48,576 & 1024", "1024 & 10,48,576", "1048576 & 16384", "16384 & 1048576"}, new String[]{"Ctrl+F2", "Shift+F3", "Ctrl+F3", "None Of These"}, new String[]{"Ctrl+;", "Ctrl+Shift+;", "Ctrl+T", "None"}, new String[]{"Ctrl+F6", "Ctrl", "Ctrl+F8", "Ctrl+F1"}, new String[]{"Ctrl+1", "Ctrl+F2", "Ctrl+2", "Ctrl+M"}, new String[]{"$D$10", "AMJ1048575", "XFD1048576", "$AMD$1048576"}, new String[]{"Data", "Math / Tring", "Mathematical", "String"}, new String[]{"Tab", "Ctrl+Tab", "Ctrl+Shift+Tab", "Shift+Tab"}};
    public String[] mCorrectAnswer = {"Shift+Tab", "Ctrl+Shift+J", "10,48,576 & 1024", "Ctrl+F2", "Ctrl+Shift+;", "Ctrl+F8", "Ctrl+1", "AMJ1048575", "Mathematical", "Ctrl+Tab"};
    public String[] mQuestion = {"Libreoffice Calc सेल के लेफ्ट ( एक कदम पीछे  ) जाने के लिये कौन सी कुंजी का प्रयोग करते है ?", "Libreoffice calc में full screen mode की शॉर्टकट की क्या है ?", "Calc मे कितने रो और कॉलम होते हैं ?", "Libreoffice calc में insert function की शॉर्टकट की क्या है ?", "Libreoffice Calc में टाइम इन्सर्ट करने के लिये किस शॉर्टकट कुंजी का प्रयोग करते है?", "Libreoffice Calc में किसी वैल्यू को हाईलाइट करने के लिये किस शॉर्टकट कुंजी का प्रयोग करते है?", "Libreoffice Calc में Cell फोर्मटिंग के लिये किस शॉर्टकट कुंजी का प्रयोग करते है ?", "Libreoffice Calc में लास्ट सेल का एड्रेस क्या होता है ?", "Libreoffice Calc में COS, EVEN, FACT, EXP किस केटेगरी के फंक्शन है ?", "अगली सीट में जाने के लिये किस कुंजी का प्रयोग करते है ?"};

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
