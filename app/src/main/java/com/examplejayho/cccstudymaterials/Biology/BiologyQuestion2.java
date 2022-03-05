package com.examplejayho.cccstudymaterials.Biology;

public class BiologyQuestion2 {
    public String[][] mChoices = {new String[]{"स्प्रेडशीट", "वर्ड प्रोसेसिंग", "प्रेजेंटेशन", "इनमें से कोई नहीं"}, new String[]{"96", "999.9", "72", "300"}, new String[]{"Style", "Format", "View", "Insert"}, new String[]{"Alt+Page up", "Page up", "Ctrl+Page up", "Home"}, new String[]{"Animations", "Lists", "Titles", "Charts"}, new String[]{"F3", "Ctrl+F2", "Shift+F2", "F2"}, new String[]{"Impress", "Writer", "Calc", "Base"}, new String[]{"CTRL+NUMBER", "ALT+SHIFT+F5", "SHIFT+F5", "none of the above"}, new String[]{"Draw", "Impress", "Calc", "Writer"}, new String[]{"F2", "F3", "F4", "F5"}};
    public String[] mCorrectAnswer = {"प्रेजेंटेशन", "999.9", "View", "Page up", "Animations", "F2", "Impress", "ALT+SHIFT+F5", "Impress", "F2"};
    public String[] mQuestion = {"Libreoffice Impress किस तरह का प्रोग्राम है?", "Libreoffice Impress में Maximum Font साइज हैं?", "Libreoffice Impress मैं Master Handout कमांड किस मेनू में पाए जाते हैं?", "पावर पॉइंट & impress में पिछले स्लाइड पर जाने की शॉटणकट की क्या है?", "स्लाइड लेआउट में कौनसा सेक्शन मौजूद नहीं है?", "Impress में टेक्सटबॉक्स के लिए किस key का प्रयोग करते हैं?", "LibreOffice में Presentation Graphic Software क्या है?", "Jump to Last edited slide पर जाने की शॉर्टकट की क्या है?", "Libreoffice में पावर पॉइंट को किस नाम से जाना जाता है?", "LibreOffice Impress में Text Box के लिए किस Shortcut Key का इस्तेमाल किया जाता है?"};

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
