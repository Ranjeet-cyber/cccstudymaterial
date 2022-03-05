package com.examplejayho.cccstudymaterials.Geo;

public class GeoQuestion1 {
    public String[][] mChoices = {new String[]{"Windows", "Linux", "Oracle", "DOS"}, new String[]{"starting computer", "Install the program", "scan virus", "To turn off"}, new String[]{"Windows", "MAC", "Ms-Dos", "None of these"}, new String[]{"Linux", "Windows", "DOS", "Unix"}, new String[]{"Windows 7", "WordPad", "Photoshop", "MS-excel"}, new String[]{"My computer", "Title bar", "Status bar", "Task bar"}, new String[]{"Operating system", "Compiler", "Utilities", "All of the above"}, new String[]{"Ctrl + F4", "Ctrl + Shift + F4", "Alt + F4", "Win + F4"}, new String[]{"ऑपरेटिंग सिस्टम का ग्राफिक्स इंटरफ़ेस", "एक chip में store होता है", "linux और unix का एक महत्वपूर्ण केंद्र", "All"}, new String[]{"Multitasking", "Foreground tasking", "Single tasking", "Symmetric"}};
    public String[] mCorrectAnswer = {"Oracle", "starting computer", "Ms-Dos", "DOS", "Windows 7", "Task bar", "All of the above", "Alt + F4", "All", "8"};
    public String[] mQuestion = {"निम्नलिखित में से कौन सा ऑपरेटिंग सिस्टम नहीं है", "ऑपरेटिंग सिस्टम में बूटिंग का क्या मतलब है?", "निम्नलिखित में से कौन single-user ऑपरेटिंग सिस्टम है?", "यह ऑपरेटिंग सिस्टम एक समय में एक से ज्यादा प्रोग्राम को सपोर्ट नहीं करता है?", "निम्नलिखित में से कौन एक एप्लीकेशन सॉफ्टवेयर नहीं है?", "डेस्कटॉप पर समय और दिनांक कहां पर दिखाई पड़ते है?", "सिस्टम सॉफ्टवेयर निम्नलिखित में से कौन सा है?", "विंडोज शटडाउन विकल्प पॉप-अप करने की शॉटकट कुंजी क्या है?", "Kernel क्या है?", "एक ही समय में कई प्रोग्राम चलाने को कहा जाता है"};

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
