package com.examplejayho.cccstudymaterials.World;

public class WorldQuestion3 {
    public String[][] mChoices = {new String[]{"वर्क स्‍टेशन", "सीपीयू", "इंटेग्रेटेड सर्किट", "मैग्‍नेटिक डिस्‍क"}, new String[]{"पहली पीढ़ी में", "द्वितीय पीढ़ी में", "तीसरी पीढ़ी में", "तीसरी पीढ़ी में"}, new String[]{"मैकेनिकल", "इलेक्ट्रोमैकेनिकल", "ऑप्टिकल फाइबर", "ऑप्टिकल"}, new String[]{"भीतरी", "बाहरी", "सहायक", "मुख्य"}, new String[]{"LAN", "WAN", "MAN", "RAN"}, new String[]{"Optical Character Rendering", "Optical Character Recognition", "Optical CPU Recognition", "इनमें से कोई नहीं"}, new String[]{"प्लॉटर", "प्रिन्टर", "मॉनिटर", "टचस्क्रीन"}, new String[]{"ALU, Control Unit, Register", "ALU, Control Unit, RAM", "Cash, Control Unit, Register", "RAM, ROM, CDROM"}, new String[]{"हार्डवेयर", "सॉफ्टवेयर", "स्कैनर", "केवल a व b"}, new String[]{"चिप", "बाइट", "बग", "बग"}};
    public String[] mCorrectAnswer = {"इंटेग्रेटेड सर्किट", "द्वितीय पीढ़ी में", "ऑप्टिकल", "मुख्य", "LAN", "Optical Character Recognition", "टचस्क्रीन", "ALU, Control Unit, Register", "केवल a व b", "बग"};
    public String[] mQuestion = {"एक छोटे सिलिकॉन चिप पर ट्रांजिस्‍टर और अन्‍य इलेक्‍ट्रानिक उपकरणों द्वारा बने पूर्ण इलेक्‍ट्रानिक सर्किट को कहते हैं।", "Transistorized कम्प्यूटर किस पीढ़ी में परिचित हुये थे", "सीडी रोम डिवाइस में किस टेक्नोलॉजी का उपयोग किया गया है", "रैम (RAM) किस तरह की मेमोरी है ?", "ईथरनेट संबंधित है ?", "OCR का पूर्ण रूप क्या है ?", "निम्न में से कौन-सा आउटपुट डिवाइस नहीं है ?", "प्रोसेसर के तीन प्रमुख भाग है?", "कम्प्यूटर पर काम करने के लिए मुख्यतः किसकी जरूरत पड़ती हैं ?", "कम्प्यूटर आंकड़ो में अशुद्धि को कहा जाता हैं।"};

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
