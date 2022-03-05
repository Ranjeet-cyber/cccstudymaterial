package com.examplejayho.cccstudymaterials.Politics;

public class PoliticsQuestion4 {
    public String[][] mChoices = {new String[]{"Program", "Antivirus Software", "Virus Program", "All of above"}, new String[]{"एटीएम मशीन", "स्मार्ट वाच", "कैलकुलेटर", "सेल फ़ोन"}, new String[]{"IR", "VR", "IVR", "RI"}, new String[]{"Internet Layer", "Network Layer", "Application Layer", "Sensor Layer"}, new String[]{"JAVA", "Python", "C++", "Lisp"}, new String[]{"Performance", "Security", "Reliability", "None of above"}, new String[]{"Intrusion Detection System", "Internet Detection Software", "Intrusion Detection Software", "Internet Detection System"}, new String[]{"Plain Text", "Simple Text", "Encrypted Text", "Design Text"}, new String[]{"John McCarthy", "Blaise Pascal", "Jack Kibly", "John Bardeen"}, new String[]{"Fused Deposition Modelling", "Fused Filament Fabrication", "Filament Deposit Mesh", "Fused Direct Metal"}};
    public String[] mCorrectAnswer = {"All of above", "एटीएम मशीन", "VR", "Network Layer", "Python", "Security", "Intrusion Detection System", "Encrypted Text", "John McCarthy", "Fused Deposition Modelling"};
    public String[] mQuestion = {"ट्रेंड माइक्रो क्या है?", "पहला IOT डिवाइस कौन सा था?", "टेक्नोलॉजी उपयोगकर्ताओं को ऐसा महसूस कराती है जैसे वे वास्तव में एक आभासी वातावरण में है?", "निम्नलिखित में से कौन-सी लेयर एक संचार लेयर है जो IOT उपकरणों को WAN से जोड़ती है?", "IOT का डाटा विश्लेषण के लिए कौन सी भाषा का प्रयोग किया जाता है?", "Encryption तकनीक से हमारी data को मिलती है?", "IDS का पूर्ण रूप क्या है?", "Cipher Text क्या है ?", "आर्टिफिशियल इंटेलिजेंस के जनक कौन है?", "FDM का पूर्ण रूप है?"};

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
