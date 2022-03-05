package com.examplejayho.cccstudymaterials.Geo;

public class GeoQuestion5 {
    public String[][] mChoices = {new String[]{"P11", "OS/2", "Windows", "Unix"}, new String[]{"नकंप्यूटर के संसाधनों को बहुत कुशलता से प्रबंधित करता है", "निष्पादन के लिए नौकरियों को शेड्यूल करने का ख्याल रखता है", "डेटा और निर्देशों के प्रवाह का प्रबंधन करता है", "उपरोक्त सभी"}, new String[]{"Lynx", "MS DOS", "Windows XP", "Process Control"}, new String[]{"Index register", "Segment pointer", "stack pointer", "Data register"}, new String[]{"Prompt", "Shell", "Command", "DOS Prompt"}, new String[]{"बूटिंग", "मल्टीकॉपिंग", "मल्टीटास्किंग", "मल्टीपेस्टिंग"}, new String[]{"Application Program", "Office Suit", "System Program", "Operating System"}, new String[]{"नोटपैड", "वर्डपैड", "माइक्रोसॉफ्ट वर्ड", "एडोब फोटोशोप"}, new String[]{"Ctrl + X", "Ctrl + C", "Ctrl + D", "Ctrl + V"}, new String[]{"आइकॉन", "स्टार्ट बटन", "साइडबार", "इनमें से कोई नहीं"}};
    public String[] mCorrectAnswer = {"P11", "उपरोक्त सभी", "Process Control", "Data register", "Shell", "मल्टीटास्किंग", "Operating System", "नोटपैड", "Ctrl + C", "स्टार्ट बटन"};
    public String[] mQuestion = {"निम्न मे से कौन सा ऑपरेटिंग सिस्टम नहीं है?", "एक ऑपरेटिंग सिस्टम का कार्य क्या है?", "निम्नलिखित में से कौन सा real time operating system का उदाहरण है?", "निम्नलिखित में से कौन सा address रजिस्टर नहीं है।", "Command Interpreter को भी जाना जाता है?", "विंडोज में एक समय में एक से अधिक एप्लीकेशन रन करने को कहते है।", "Windows ,Linux ,Unix, Mac क्या है?", "निम्नलिखित टेक्स्ट एडिटर में से विंडोज ऑपरेटिंग सिस्टम का पार्ट है?", "विंडोज ऑपरेटिंग सिस्टम में टेक्स्ट या इमेज कॉपी करने के लिए शॉर्टकट का प्रयोग किया जाता है?", " विंडोज का एक बहुत ही महत्वपूर्ण हिस्सा है, जिसपर क्लिक करने पर स्टार्ट मेनू ओपन होता है।"};

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
