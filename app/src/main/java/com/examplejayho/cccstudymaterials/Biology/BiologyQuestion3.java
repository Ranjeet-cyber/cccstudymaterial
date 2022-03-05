package com.examplejayho.cccstudymaterials.Biology;

public class BiologyQuestion3 {
    public String[][] mChoices = {new String[]{"Central Alignment", "Left Alignment", "Right Alignment", "Justification"}, new String[]{"8", "10", "12", "14"}, new String[]{"Ctrl+N", "Ctrl+M", "Ctrl+W", "Ctrl+P"}, new String[]{"Insert", "slide", "Tools", "None"}, new String[]{"Ctrl+X", "Ctrl+N", "Ctrl+M", "None"}, new String[]{"Ctrl+Shift+V", "Ctrl+Alt+Shift+V", "Ctrl+Alt+V", "None"}, new String[]{"Slide Show", "Slide", "Tools", "None"}, new String[]{"Ctrl+F3", "Alt+F3", "Ctrl+Shift+2", "Shift+F3"}, new String[]{"F12", "Ctrl+S", "Ctrl+Shift+S", "Ctrl+F12"}, new String[]{"Presentation", "Drawing Toolbar", "Standard Toolbar", "All of these"}};
    public String[] mCorrectAnswer = {"Justification", "10", "Ctrl+W", "Tools", "None", "Ctrl+Alt+Shift+V", "Slide", "Ctrl+F3", "Ctrl+Shift+S", "Standard Toolbar"};
    public String[] mQuestion = {"LibreOffice Impress में कौन सा Alignment नहीं होता है?", "LibreOffice Impress में कितने Menu पाए जाते है?", "LibreOffice Impress में किसी भी स्लाइड को बंद करने के लिए इस्तेमाल होने वाली शॉर्टकट कुंजी कौनसी हैं?", "LibreOffice Impress में Macros कमांड किस मेनू में मिलता है?", "LibreOffice Impress के प्रस्तुतीकरण में प्रतिरूप slide को जोड़ने के लिए शॉर्टकट की होती है?", "Impress में Paste Unformatted Text के लिए कौन सी शॉर्टकट कुंजी काम में आती है?", "LibreOffice Impress में Master Slide Function किस Menu में होता है?", "Libreoffice Impress में किसी भी Text का डुप्लीकेट करने के लिए इस शॉर्टकट कुंजी का प्रयोग होता है?", "Libreoffice Impress में Save As का शॉर्टकट कुंजी क्या होगी?", "Libreoffice Impress में Export Direct As PDF का Option कहां पर मिलता है?"};

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
