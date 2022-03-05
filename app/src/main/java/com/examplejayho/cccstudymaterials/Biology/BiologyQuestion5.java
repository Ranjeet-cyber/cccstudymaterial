package com.examplejayho.cccstudymaterials.Biology;

public class BiologyQuestion5 {
    public String[][] mChoices = {new String[]{"4", "5", "6", "इनमे से कोई नहीं"}, new String[]{"चित्र बनाना", "स्थिर चित्रों को गति देना", "प्रिंट निकालना", "ग्राफ में चित्रों को बदलना"}, new String[]{"F4", "F5", "F6", "F7"}, new String[]{"CTRL+Q", "CTRL+X", "CTRL+W", "CTRL+Y"}, new String[]{"WAV", "JPG", "MPEG", "ये सभी"}, new String[]{"Animations", "Lists", "Titles", "Charts"}, new String[]{"प्रेजेन्टेशन हेतु", "डाटाबेस हेतु", "प्रोग्रामिंग हेतु", "एकाउंटिंग हेत"}, new String[]{"ऐक्सल", "पॉवर प्वॉइंट", "ऐक्सेस", "वर्ड"}, new String[]{"Spreadsheet", "Presentation", "Slide", "PPT"}, new String[]{"72", "82", "96", "90"}};
    public String[] mCorrectAnswer = {"4", "स्थिर चित्रों को गति देना", "F5", "CTRL+Q", "ये सभी", "Animations", "प्रेजेन्टेशन हेतु", "पॉवर प्वॉइंट", "Slide", "96"};
    public String[] mQuestion = {"पॉवर पॉइंट में layout कितने प्रकार के होते हैं |", "Animation क्या है?", "Slide Show करने की शॉर्टकट की (Key) क्या है?", "लिब्रे ऑफिस को बंद करने का शॉर्टकट की है?", "पॉवर पॉइंट शो में कौनसा फाइल फॉर्मेट जोड़ सकते हैं?", "स्लाइड लेआउट में कौनसा सेक्शन मौजूद नहीं है?", "एम एस पॉवर प्वॉइन्ट का प्रयोग किया जाता हैं।", "प्रेजेन्टेशन/स्लाइड्स निम्न के द्वारा तैयार हो सकता हैं?", "प्रेजेंटेशन में एक पेज को क्या कहते हैं?", "प्रेजेंटेशन स्लाइड के टेक्स्ट की मैक्सिमम साइज होती है?"};

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
