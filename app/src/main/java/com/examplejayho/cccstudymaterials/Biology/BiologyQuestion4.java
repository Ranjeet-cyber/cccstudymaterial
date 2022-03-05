package com.examplejayho.cccstudymaterials.Biology;

public class BiologyQuestion4 {
    public String[][] mChoices = {new String[]{"8, 96", "6, 96", "6, 72", "6, 94"}, new String[]{"Ctrl+N", "Ctrl+Shift+N", "Ctrl+Shift+B", "None of these"}, new String[]{"Slide", "Insert", "File", "Format"}, new String[]{"Ctrl+F", "Alt+F", "Ctrl+H", "All of these"}, new String[]{"Fly from top", "Flash on", "Typewriter", "All of these"}, new String[]{"Page Layout", "View", "Insert", "Format"}, new String[]{"Ctrl+N", "Ctrl+S", "Ctrl+M", "Shift+N"}, new String[]{"PowerPoint", "Pwrpoint", "Powerpnt", "Powerpint"}, new String[]{"Excel", "PowerPoint", "Access", "Outlook"}, new String[]{"Delete बटन को दबाकर", "Esc बटन को दबाकर", "Right arrow को दबाकर", "Left arrow को दबाकर"}};
    public String[] mCorrectAnswer = {"6, 96", "Ctrl+Shift+N", "Format", "Ctrl+H", "Flash on", "View", "Shift+N", "Powerpnt", "PowerPoint", "Esc बटन को दबाकर"};
    public String[] mQuestion = {"Libreoffice Impress में सबसे छोटा और सबसे बड़ा Font का Size होता है?", "Libreoffice Impress में नया टेंप्लेट जोड़ने के लिए कौनसी शॉर्टकट कुंजी काम आएगी?", "Libreoffice Impress में बुलेट्स और नंबरिंग का विकल्प किस Menu में होता है?", "Libreoffice Impress में निम्न में से कौनसी शॉर्टकट कुंजी से Find and Replace का डायलॉग बॉक्स ओपन होगा?", "इसमें से कौनसा स्लाइड एनिमेशन का प्रकार है?", "Slide Panel का विकल्प किस Menu में होता है?", "PowerPoint presentation, में new फाइल बनाने की shortcut key क्या है?", "Run Dialog Box से Power Point को Open करने के लिए क्या लिखा जाता है", "Presentation बनाने के लिए किस प्रोग्राम का उपयोग किया जाता है?", "नआप Slide Show को कैसे रोक सकते हैं?"};

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
