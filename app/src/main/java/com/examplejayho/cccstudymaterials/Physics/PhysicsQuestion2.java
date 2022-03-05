package com.examplejayho.cccstudymaterials.Physics;

public class PhysicsQuestion2 {
    public String[][] mChoices = {new String[]{"एक्सेस कैश स्टेट्स", "एक्सचेंज क्लियरिंग स्टैंडर्ड", "एक्सेंस क्रेडिट सुपरवाइजर", "इलेक्ट्रॉनिक क्लियरिंग सर्विस"}, new String[]{"ATM", "IIN", "Code", "Pin"}, new String[]{"SBI", "BOB", "PNB", "ICICI"}, new String[]{"Automatic Transfer Mode", "Asynchronous Transfer Mode", "Asynchronous Transfer Machine", "Automated teller machine"}, new String[]{"1000000 Per Day", "1000000 Per Month", "100000 Per Day", "No limit"}, new String[]{"4", "6", "5", "3"}, new String[]{"Managing Banking", "Manage banking", "Mobile-Banking", "Net banking"}, new String[]{"TCS", "Citrus Pay", "Snapdeal", "One97 Communications"}, new String[]{"घर", "शिक्षा", "वाहन", "उपरोक्त सभी"}, new String[]{"जमा", "ऋण", "निकाशी", "लेन-देन"}};
    public String[] mCorrectAnswer = {"इलेक्ट्रॉनिक क्लियरिंग सर्विस", "IIN", "SBI", "Automated teller machine", "No limit", "4", "Mobile-Banking", "One97 Communications", "उपरोक्त सभी", "जमा"};
    public String[] mQuestion = {"बैकिंग लेन-देन मे ECS का अर्थ है।", "AEPS के सन्दर्भ में कौन सा नंबर यूज़ किया जाता है?", "भारत में सबसे बड़ा कमर्शियल बैंक है?", "ATM का  पूर्ण रूप है?", "RTGS का अधिकतम सीमा है?", "ATM Pin कितने डिजिट का होता है?", "M-banking क्या है?", "निम्नलिखित में से कौन सी कंपनी पेटी-एम ई-वॉलेट ऐप से जुडी है", "निम्नलिखित में से किसके लिए बैंक ऋण प्रदान करता है।", "बैंक ब्याज देता है?"};

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
