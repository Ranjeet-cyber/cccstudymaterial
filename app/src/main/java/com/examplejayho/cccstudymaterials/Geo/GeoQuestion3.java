package com.examplejayho.cccstudymaterials.Geo;

public class GeoQuestion3 {
    public String[][] mChoices = {new String[]{".DOC", ".DOS", ".BAT", ".PRG"}, new String[]{"2012", "2014", "2015", "2013"}, new String[]{"Apache", "Android", "Linux", "Windows"}, new String[]{"VxWorks", "Windows CE", "RTLinux", "Palm OS"}, new String[]{"Demoralized system memory", "Distributed shared memory", "Direct system module", "Direct system memory"}, new String[]{"Working system", "Operating system", "Peripheral system", "Controlling system"}, new String[]{"International Standard Organization", "International Student Organization", "Integrated Service Organization", "iPhone Operating System"}, new String[]{".PRG", ".EXE", ".COM", ".SYS"}, new String[]{"एप्लीकेशन सॉफ्टवेयर", "मोबाइल ऑपरेटिंग सिस्टम", "प्रोग्रामिंग भाषा", "डाटाबेस सिस्टम"}, new String[]{"हाई लेवल लैंग्वेज को लो लेवल लैंग्वेज में बदलना", " प्रोग्राम्स का सेट जो कम्प्यूटर की वर्किंग को कंट्रोल करता है", "फ्लॉपी डिस्क ड्राइव जिस तरह ऑपरेट करती है", "प्रोग्राम्स का सेट जो कम्प्यूटर की वर्किंग को कंट्रोल करता है "}};
    public String[] mCorrectAnswer = {".BAT", "2015", "Apache", "Palm OS", "Distributed shared memory", "Operating system", "iPhone Operating System", ".SYS", "मोबाइल ऑपरेटिंग सिस्टम", " प्रोग्राम्स का सेट जो कम्प्यूटर की वर्किंग को कंट्रोल करता है"};
    public String[] mQuestion = {"बैच फाइल का एक्सटेंशन होता है?", "Windows 10 को किस वर्ष लॉन्च किया गया था ?", "निम्न में से कौन सा एक ऑपरेटिंग सिस्टम नहीं है??", "निम्नलिखित में से कौन सा Real time Operating System नहीं है?", "DSM का पूरा नाम क्या है?", "कंप्यूटर के पूरे संचालन को नियंत्रित करने वाला प्रोग्राम कौनसा है?", "IOS का पूरा नाम है?", "निम्न में से कौन सा एक्सटेंशन सिस्टम फाइलों को संदर्भित करता है?", "एंड्रॉइड क्या है?", "ऑपरेटिंग सिस्टम का अर्थ है ?"};

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
