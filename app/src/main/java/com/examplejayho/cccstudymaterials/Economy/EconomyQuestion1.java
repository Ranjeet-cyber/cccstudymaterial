package com.examplejayho.cccstudymaterials.Economy;

public class EconomyQuestion1 {
    public String[][] mChoices = {new String[]{"इंग्लिश मेल", "इलेक्ट्रिक मेल", "इलेक्ट्रॉनिक मेल", "इसेन्सियल मेल"}, new String[]{"इंटरकांटिनेंटल नेटवर्क", "इंटरनेशनल नेटवर्क", "इंटरनल नेटवर्क", "इंटरकॉम नेटवर्क"}, new String[]{"2015", "2016", "2018", "2019"}, new String[]{"Mark Endersan", "Rick Doblin", "Eric Yuan", "Pevel Durov"}, new String[]{"Trash Mail", "Sent Mail", "Inbox", "Outbox"}, new String[]{"Thermal Printer", "Laser Printer", "Dot Matrix", "3d Printer"}, new String[]{"140", "190", "280", "None"}, new String[]{"Swift", "IFSC", "NEFT", "None"}, new String[]{"फेसबुक", "गूगल प्लस", "ऑरकुट", "जीमेल"}, new String[]{"CC", "To", "Subject", "Content"}};
    public String[] mCorrectAnswer = {"इलेक्ट्रॉनिक मेल", "इंटरनेशनल नेटवर्क", "2015", "Pevel Durov", "Trash Mail", "Thermal Printer", "280", "Swift", "जीमेल", "Subject"};
    public String[] mQuestion = {"ई-मेल का पूरा नाम क्या हैं ?", "इंटरनेट का पूरा नाम क्या हैं ?", "Digilocker को किस वर्ष लॉन्च किया गया?", "टेलीग्राम किसके द्वारा विकसित किया गया?", "डिलीट किया गया मेल को कहाँ संग्रहीत किया जाता है?", "POS मशीन द्वारा किस प्रिंटर का उपयोग किया जाता है?", "Twitter में tweet के अधिकतम शब्द सीमा क्या है?", "इंटरनेशनल ट्रांजैक्शन में किस कोड की जरूरत पड़ती है?", "निम्न में से कौन सोशल मीडिया वेबसाइट नहीं है?", "ई-मेल भेजते समय किस लाइन में संदेश की विषय वस्तु के बारे में बताया जाता है?"};

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
