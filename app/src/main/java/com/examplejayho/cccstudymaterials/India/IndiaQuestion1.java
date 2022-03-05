package com.examplejayho.cccstudymaterials.India;

public class IndiaQuestion1 {
    public String[][] mChoices = {new String[]{"रैम", "फ्लॉपी", "सी डी.", "डिस्क"}, new String[]{"Windows", "Linux", "Oracle", "DOS"}, new String[]{"Ctrl+Shift+O", "Ctrl+shift+P", "Ctrl+F2", "Ctrl+P"}, new String[]{"200", "300", "400", "500"}, new String[]{"F2", "F5", "F7", "F12"}, new String[]{"user id", "URL", "Time stamp", "ये सभी"}, new String[]{"2015", "2016", "2018", "2019"}, new String[]{"Real Time Gross Sales", "Real Time Gross Settlement", "Right Time Gross Settlement", "None"}, new String[]{"Bill Gates", "Kevin Ashton", "Steve Jobs", "McDonald"}, new String[]{"आर्यभट्ट", "सिद्धार्थ", "अशोक", "बुद्ध"}, new String[]{"LAN", "WAN", "MAN", "RAN"}, new String[]{"Shut Down", "Restart", "Sleep", "Hibernate"}, new String[]{"प्रोग्राम", "टेक्स्ट", "ग्राफ", "डाक्यूमेंट"}, new String[]{"मेल मर्ज", "मैक्रो मर्ज", "मेगा मर्ज", "माइक्रो मर्ज"}, new String[]{"*", "/", "$", "="}, new String[]{"AVG", "MAX", "COS", "ये सभी"}, new String[]{"Ctrl+X", "Ctrl+N", "Ctrl+M", "None"}, new String[]{"Worldwide corporation", "W3C", "World Wide Consortium", "World Wide Web Standard"}, new String[]{"Trash Mail", "Sent Mail", "Inbox", "Outbox"}, new String[]{"8", "6", "4 या 6", "4"}};
    public String[] mCorrectAnswer = {"रैम", "Oracle", "Ctrl+Shift+O", "500", "F12", "URL", "2015", "Real Time Gross Settlement", "Kevin Ashton", "सिद्धार्थ", "LAN", "Restart", "डाक्यूमेंट", "मेल मर्ज", "=", "COS", "None", "World Wide Consortium", "Trash Mail", "4 या 6"};
    public String[] mQuestion = {"किस मेमोरी में रखा डाटा बिजली जाते ही समाप्त हो जाता है?", "निम्नलिखित में से कौन सा ऑपरेटिंग सिस्टम नहीं है?", "LibreOffice writer में प्रिंट प्रीव्यू की शार्टकट की क्या है?", "libreoffice calc को अधिकतम zoom नहीं कर सकते?", "Save as की शॉर्टकट की है?", "वेबसाइट का address निम्नलिखित में से क्या कहलाता हैं ?", "Digilocker को किस वर्ष लॉन्च किया गया?", "RTGS का पूर्ण रूप क्या है?", "इन्टरनेट ऑफ़ थिंग्स (IOT) शब्द का अविष्कार किसने किया?", "भारत में निर्मित प्रथम कंप्यूटर का क्या नाम है?", "ईथरनेट संबंधित है ?", "निम्नलिखित में से किस शटडाउन विधि को अक्सर वार्म बूट कहा जाता है?", "LibreOffice मे बनाई गई फाईल को किस नाम से जाना जाता है।", "एक ऐसी प्रकिया जिसमें एक साथ बहुत से प्राप्तकर्ताओं को संदेश भेजा जाता हैं?", "Excel में सभी फ़ॉर्मुले किस से स्टार्ट होते है?", "Mathematical Functions का एक उदाहरण हैं।", "LibreOffice impress के प्रस्तुतीकरण में प्रतिरूप slide को जोड़ने के लिए Shortcut key की होती है?", "वर्ल्ड वाइड वेब(World Wide Web) मानक किसके द्वारा बनाया गया?", "डिलीट किया गया मेल को कहाँ संग्रहीत किया जाता है?", "UPI Pin कितने अंक का होता है?"};

    public IndiaQuestion1() {
    }

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
