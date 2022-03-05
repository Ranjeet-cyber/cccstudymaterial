package com.examplejayho.cccstudymaterials.History;

public class HistoryQuestion3 {
    public String[][] mChoices = {new String[]{"Ctrl + Shift + P", "Ctrl + Shift + B", "Ctrl + Shift + S", "None"}, new String[]{"Ctrl+F12", "F12", "Ctrl+F11", "F11"}, new String[]{"Ctrl + H", "Ctrl + K", "Ctrl + L", "Ctrl + Shift + H"}, new String[]{"Shift + A", "Tab", "Ctrl + Enter", "Ctrl + C"}, new String[]{"Word Processing", "Letter Posting", "Blogging", "Documentation"}, new String[]{"10", "12", "15", "6"}, new String[]{"Insert", "Format", "Tools", "Form"}, new String[]{"Ctrl + O", "Ctrl + Shift + P", "Ctrl + F2", "Ctrl + Shift + O"}, new String[]{"Ctrl + Shift + F", "Ctrl + Shift + J", "Ctrl + Shift + H", "इनमें से कोई नहीं"}, new String[]{"मेल मर्ज", "मैक्रो मर्ज", "मेगा मर्ज", "माइक्रो मर्ज"}};
    public String[] mCorrectAnswer = {"Ctrl + Shift + P", "Ctrl+F11", "Ctrl + K", "Ctrl + Enter", "Documentation", "12", "Tools", "Ctrl + Shift + O", "Ctrl + Shift + J", "मेल मर्ज"};
    public String[] mQuestion = {"LibreOffice writer मैं सुपर स्क्रिप्ट की शॉर्टकट की क्या होती है?", "LibreOffice Writer में किस कमांड से टेबल को एडिट कर सकते है?", "लिबर ऑफिस राइटर हाइपरलिंक का शॉर्टकट क्या है?", "लिबरऑफिस राइटर में पेज ब्रेक लगाने के लिए कीबोर्ड संयोजन क्या है?", "पत्र लेखन, रिपोर्ट तैयार करना, दस्तावेज बनाना, पुस्तक लेखन आदि किस श्रेणी में आते हैं?", "लिब्रे ऑफिस राइटर में डिफ़ॉल्ट फॉन्ट साइज क्या है?", "लिब्रे ऑफिस राइटर में, मेल मर्ज विकल्प किस मेनू में है?", "LibreOffice writer में प्रिंट प्रीव्यू के लिये शॉर्टकट कुंजी क्या है ?", "Libreoffice में फुल स्क्रीन करने के लिये किस शॉर्टकट Key का प्रयोग करते है ?", "एक ऐसी प्रकिया जिसमें एक साथ बहुत से प्राप्तकर्ताओं को संदेश भेजा जाता हैं?"};

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
