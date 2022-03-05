package com.examplejayho.cccstudymaterials.History;

public class HistoryQuestion5 {
    public String[][] mChoices = {new String[]{"View", "Format", "Insert", "None Of These"}, new String[]{"Letter", "Legal", "A4", "A3"}, new String[]{"Edit", "Tools", "Insert", "View"}, new String[]{"F2", "F1", "F3", "F4"}, new String[]{"टेबल मे रौ को जोड़ पाना", "कॉलम को जोड़ या डिलीट करना", "टेबल मे जोड़े गए कॉलम्स को बाँटना", "उपर्युक्त मे से सभी"}, new String[]{"2", "3", "4", "5"}, new String[]{"स्पेलप्रो", "स्पेल चेक", "आउटलुक एक्सप्रेस", "उपर्युक्त सभी"}, new String[]{"0.3’’", "0.5’’", "0.8’’", "1.0’’"}, new String[]{"शब्दों के बीच स्पेस रखना", "शब्दों को दांये मार्जिन से सीधा करता", "टेक्स्ट का स्वत: अगली लाइन में पहुचना", "उपरोक्त में से कोई नहीं"}, new String[]{"Ctrl+X, Ctrl+C, Ctrl+V", "Ctrl+X, Ctrl+L, Shift+C", "Ctrl+X, Alt+L, Ctrl+C", "Alt+X, Alt+C, Alt+V"}};
    public String[] mCorrectAnswer = {"Format", "Letter", "Tools", "F1", "उपर्युक्त मे से सभी", "4", "स्पेल चेक", "0.5’’", "टेक्स्ट का स्वत: अगली लाइन में पहुचना", "Ctrl+X, Ctrl+C, Ctrl+V"};
    public String[] mQuestion = {"Writer में वाटर मार्क के लिए किस मीनू का उपयोग किया जाता है?", "Ms word में डिफ़ॉल्ट कौनसा पेज आकर सेट रहता है?", "LibreOffice Writer के किस मेनू में मेल मर्ज या लेटर विजार्ड पाया जाता है?", "लिब्रा ऑफिस में हेल्प की शॉर्टकट की क्या है?", "टेबल के बनने के बाद निम्न मे से क्या संम्भव है?", "MS Word में कितने Text Alignment हैं?", "Ms Word में स्पेलिंग को सही करने के लिए किस प्रोग्राम का उपयोग होता है?", "एक बार tab दबाने पर कर्सर आगे आता है ?", "Word warp का क्या अर्थ है ?", "Cut, Copy, तथा Paste की क्रमश: Short Cut key क्या है ?"};

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
