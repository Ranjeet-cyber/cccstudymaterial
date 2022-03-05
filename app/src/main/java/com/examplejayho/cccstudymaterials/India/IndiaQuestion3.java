package com.examplejayho.cccstudymaterials.India;

public class IndiaQuestion3 {
    public String[][] mChoices = {new String[]{"मशीन", "मोडेम", "प्रोसेसर", "रजिस्टर"}, new String[]{"My computer", "Title bar", "Status bar", "Task bar"}, new String[]{"Shift+F12", "F12", "Ctrl+F12", "None"}, new String[]{"Ctrl+Shift+J", "Ctrl+Shift+F11", "F11", "Not"}, new String[]{"स्प्रेडशीट", "वर्ड प्रोसेसिंग", "प्रेजेंटेशन", "इनमें से कोई नहीं"}, new String[]{"Google", "Yahoo", "Baidu", "Wolfram Alpha"}, new String[]{"Laser Printer", "Thermal Printer", "Dot Matrix", "3d Printer"}, new String[]{"Point of Sale", "Post of sales", "Point of sold", "None"}, new String[]{"Wipro", "HCL", "NASSCOM", "NIELIT"}, new String[]{"winzip", "winword", "msdoc", "msword"}, new String[]{"जैक किल्बे", "बिल गेट्स", "मार्क एंडरसन", "हरमन हॉलेरिथ"}, new String[]{"OS/2", "Windows", "P11", "Unix"}, new String[]{"Tab", "Ctrl + Tab", "Ctrl + Shift + Tab", "Shift + Tab"}, new String[]{"Untitled1", "Calc1", "Spreadsheet1", "None"}, new String[]{"Quated Monthly Installment", "Equal Monthly Installment", "Extra Monthly Installment", "Extra Monthly Investment"}, new String[]{"Page Layout", "View", "Insert", "Format"}, new String[]{"Delete बटन को दबाकर", "Esc बटन को दबाकर", "Right arrow को दबाकर", "Left arrow को दबाकर"}, new String[]{"VSNL", "IETF", "Inter NIC", "इनमें से कोई नहीं"}, new String[]{"IMM", "Social Media", "E Governance", "None"}, new String[]{"Time Deposit Scheme", "Total Deposit Scheme", "Tax Deducted at Source", "इनमें से कोई नहीं"}};
    public String[] mCorrectAnswer = {"मशीन", "Task bar", "Shift+F12", "Ctrl+Shift+J", "प्रेजेंटेशन", "Wolfram Alpha", "Thermal Printer", "Point of Sale", "NASSCOM", "winword", "जैक किल्बे", "P11", "Ctrl + Tab", "Untitled1", "Quated Monthly Installment", "View", "Esc बटन को दबाकर", "इनमें से कोई नहीं", "E Governance", "Tax Deducted at Source"};
    public String[] mQuestion = {"IMAC एक प्रकार का है?", "डेस्कटॉप पर समय और दिनांक कहां पर दिखाई पड़ते है?", "LibreOffice writer में बुलेट लिस्ट जोड़ने के लिए किस कुंजी का प्रयोग करते हैं?", "Libreoffice calc में full screen mode की शॉर्टकट की क्या है?", "Libreoffice impress किस तरह का Program है?", "इनमें से कौन सर्च इंजन नहीं है?", "POS मशीन द्वारा किस प्रिंटर का उपयोग किया जाता है?", "POS का पूर्ण रूप क्या है?", "फ्यूचर स्किल पोर्टल किसके द्वारा लांच किया गया है?", "एम एस वर्ड को रन कमांड के द्वारा खोलने के लिए क्या टाईप करते है।", "IC का निर्माण कीसने किया था?", "निम्न मे से कौन सा ऑपरेटिंग सिस्टम नहीं है?", "अगली सीट में जाने के लिये किस कुंजी का प्रयोग करते है ?", "Libreoffice Calc फाइल by default किस नाम से सेव होता है ?", "EMI का full form क्या है?", "Slide Panel का विकल्प किस Menu में होता है?", "आप Slide Show को कैसे रोक सकते हैं?", "निम्नलिखित में से इंटरनेट किसके द्वारा चलाया जाता है ?", "eMitra किससे सम्बंधित है?", "TDS full form क्या है?"};

    public IndiaQuestion3() {
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
