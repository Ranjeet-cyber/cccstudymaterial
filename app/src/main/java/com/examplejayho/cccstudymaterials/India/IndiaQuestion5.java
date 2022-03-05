package com.examplejayho.cccstudymaterials.India;

public class IndiaQuestion5 {
    public String[][] mChoices = {new String[]{"माऊस", "की-बोर्ड", "स्कैनर", "इनमें से सभी"}, new String[]{"ऑपरेटिंग सिस्टम का ग्राफिक्स इंटरफ़ेस", "एक chip में store होता है", "linux और unix का एक महत्वपूर्ण केंद्र", "All"}, new String[]{"Ctrl+L", "Ctrl+ Shift+L", "Shift+L", "Ctrl+E"}, new String[]{"Tab", "Ctrl+Tab", "Ctrl+Shift+Tab", "Shift+Tab"}, new String[]{"Insert", "slide", "Tools", "None"}, new String[]{"Baidu", "Google", "Yahoo", "Bing"}, new String[]{"CC", "To", "Subject", "Content"}, new String[]{"E Governance", "Social Media", "IMM", "None"}, new String[]{"Wiring", "Drawing", "Mathematics", "French"}, new String[]{"मेश", "रिंग", "बस", "स्टार"}, new String[]{"एप्लीकेशन सॉफ्टवेयर", "सिस्टम सॉफ्टवेयर", "हार्डवेयर का सॉफ्टवेयर", "उपरोक्त सभी"}, new String[]{"Working System", "Operating System", "Peripheral System", "Controlling System"}, new String[]{"Save As dialog box", "Spelling & Grammar dialog box", "Chart Wizard", "Font dialog box"}, new String[]{"Bubble", "Balun", "Hollow", "Circle"}, new String[]{"Ctrl+F2", "Shift+F3", "Ctrl+F3", "None"}, new String[]{"WAV", "JPG", "MPEG", "ये सभी"}, new String[]{"Spreadsheet", "Presentation", "Slide", "PPT"}, new String[]{"URL", "एंकर", "रेफरेन्स", "हाइपरलिंक"}, new String[]{"फास्ट गेमिंग", "फास्टट्रैक मोबाइल गवर्नेंस", "स्लो गेमिंग", "इनमें से कोई नहीं"}, new String[]{"Card Verification Value", "Code for Verification Value", "Card Value Verification", "None"}};
    public String[] mCorrectAnswer = {"इनमें से सभी", "All", "Ctrl+L", "Ctrl+Tab", "Tools", "Baidu", "Subject", "E Governance", "Mathematics", "बस", "हार्डवेयर का सॉफ्टवेयर", "Operating System", "Save As dialog box", "Bubble", "Ctrl+F2", "ये सभी", "Slide", "हाइपरलिंक", "फास्टट्रैक मोबाइल गवर्नेंस", "Card Verification Value"};
    public String[] mQuestion = {"निम्न में कौन इनपुट इकाई है?", "Kernel क्या है?", "Align Left के लिए शॉर्टकट की है?", "अगली सीट में जाने के लिये किस कुंजी का प्रयोग करते है?", "Libreoffice Impress में Macros नामक कमांड किस मेनू में पाई जाती है?", "चीन में कौन सा सर्च इंजन चलता है?", "ई-मेल भेजते समय किस लाइन में संदेश की विषय वस्तु के बारे में बताया जाता है?", "eMitra किससे सम्बंधित है?", "निम्नलिखित में से कौन AI के निकटतम आधार है?", "किस टोपोलोजी में नेटवर्क कंमपोनेंट एक ही केबल से कनेक्ट किए जाते हैं?", "फर्मवेयर का अर्थ है?", "कंप्यूटर के पूरे संचालन को नियंत्रित करने वाला प्रोग्राम कौनसा है?", "F12 Key का उपयोग किस लिए किया जाता है?", "Calc में Chart क्या होता है?", "Libreoffice calc में insert function की शॉर्टकट की क्या है ?", "पॉवर पॉइंट में कौन सा फाइल फॉर्मेट जोड़ सकते हैं?", "प्रेजेंटेशन में एक पेज को क्या कहते हैं?", "वेब पेज का एक वर्ड जिसे क्लिक करने पर दूसरा डाक्यूमेन्ट खुलता है, उसे क्या कहते हैं?", "उमंग एप का उद्देश्य है", "CVV का पूर्ण रूप है?"};

    public IndiaQuestion5() {
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
