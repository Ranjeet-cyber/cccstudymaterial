package com.examplejayho.cccstudymaterials.Biology;

public class BiologyQuestion1 {
    public String[][] mChoices = {new String[]{"View", "Insert", "Slide show", "Format"}, new String[]{"F2", "F5", "F7", "F12"}, new String[]{"5%", "15%", "10%", "20%"}, new String[]{"स्प्रेडशीट", "वर्ड प्रोसेसिंग", "प्रेजेंटेशन", "इनमें से कोई नहीं"}, new String[]{"Shw 1", "Slide1", "Presentation1", "Untitled1"}, new String[]{"JPEG", "HTML", "GIF", "WAV"}, new String[]{"Ctrl+X", "Ctrl+N", "Ctrl+M", "None"}, new String[]{"Alt+Page up", "Page up", "Ctrl+Page up", "Home"}, new String[]{"Insert", "slide", "Tools", "None"}, new String[]{".ist", ".odt", ".ods", ".odp"}};
    public String[] mCorrectAnswer = {"View", "F12", "5%", "प्रेजेंटेशन", "Untitled1", "HTML", "None", "Ctrl+Page up", "Tools", ".odt"};
    public String[] mQuestion = {"LibreOffice Impress में Slide Sorter किस मेनू में पाया जाता है?", "Save as की शॉर्टकट की है?", "LibreOffice Impress मैं न्यूनतम है zoom साइज कितना है?", "Libreoffice impress किस तरह का Program है?", "Libreoffice Impress में बने Presentation का By Default क्या बनता हैं?", "LibreOffice Impress में निम्न में से किस फाइल का प्रारूप नहीं लगा सकते?", "LibreOffice impress के प्रस्तुतीकरण में प्रतिरूप slide को जोड़ने के लिए Shortcut key की होती है?", "Libreoffice impress में Previous Slide पर जाने की Shortcut key क्या है?", "Libreoffice Impress में Macros नामक कमांड किस मेनू में पाई जाती है?", "Libreoffice Impress में Save की हुई फाइल कौनसे एक्सटेंशन के साथ सेव होती है?"};

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
