package com.examplejayho.cccstudymaterials.India;

public class IndiaQuestion2 {
    public String[][] mChoices = {new String[]{"सॉफ्टवेयर", "हार्डवेयर", "ऑपरेटिंग सॉफ्टवेयर", "इनमें से कोई नहीं"}, new String[]{"Windows", "MAC", "Ms-Dos", "None of these"}, new String[]{"Ctrl+C", "Ctrl+X", "Ctrl+K", "Shift+X"}, new String[]{"Formula Bar", "Address Book", "Name Box", "None"}, new String[]{"5%", "15%", "10%", "20%"}, new String[]{"15 अगस्त, 1995", "अगस्त, 1995", "8 अगस्त, 1994", "7 अगस्त, 1996"}, new String[]{"Mark Endersan", "Rick Doblin", "Eric Yuan", "Pevel Durov"}, new String[]{"Ministry of electronics & IT", "Ministry of Finance", "Ministry of HRD", "All of above"}, new String[]{"Robot Process Automation", "Robotic Process Automation", "Robot Procedure Automation", "None"}, new String[]{"Windows 7", "WordPad", "Photoshop", "MS-exce"}, new String[]{"ALU, Control Unit, Register", "ALU, Control Unit, RAM", "Cash, Control Unit, Register", "RAM, ROM, CDROM"}, new String[]{"ऑपरेटिंग सिस्टम का ग्राफिक्स इंटरफ़ेस", "एक chip में store होता है", "linux और unix का एक महत्वपूर्ण केंद्र", "All"}, new String[]{"Page Orientation", "Paper Size", "Page Layout", "Page Margin"}, new String[]{"Letter", "Legal", "A4", "A3"}, new String[]{"1", "3", "4", "इनमे से कोई नहीं"}, new String[]{"96", "999.9", "72", "300"}, new String[]{"Fly from top", "Flash on", "Typewriter", "All of these"}, new String[]{"To select multiple option", "To select single option", "To select all option", "All of above"}, new String[]{"समाजवादी पार्टी", "भारतीय जनता पार्टी", "राष्ट्रिय जनता पार्टी", "लोक जनशक्ति पार्टी"}, new String[]{"TCS", "Citrus Pay", "Snapdeal", "One97 Communications "}};
    public String[] mCorrectAnswer = {"हार्डवेयर", "Ms-Dos", "Ctrl+X", "Name Box", "5%", "15 अगस्त, 1995", "Pevel Durov", "Ministry of electronics & IT", "Robotic Process Automation", "Windows 7", "ALU, Control Unit, Register", "All", "Page Orientation", "Letter", "3", "999.9", "Flash on", "All of above", "भारतीय जनता पार्टी", "One97 Communications "};
    public String[] mQuestion = {"कंप्यूटर के फिजिकल अंग को कहते हैं?", "निम्नलिखित में से कौन single-user ऑपरेटिंग सिस्टम है?", "लिब्रेऑफिस में text को कट करने की शॉर्टकट की क्या है?", "Libreoffice Calc में किसी सेल का एड्रेस कहा दिखाई देता है?", "LibreOffice Impress मैं न्यूनतम है zoom साइज कितना है?", "भारत में इंटरनेट की शुरुआत कब हुई ?", "टेलीग्राम किसके द्वारा विकसित किया गया?", "Umang एप्लीकेशन को किस मंत्रालय द्वारा लॉन्च किया गया।", "RPA का पूर्ण अर्थ क्या है?", "निम्नलिखित में से कौन एक एप्लीकेशन सॉफ्टवेयर नहीं है?", "प्रोसेसर के तीन प्रमुख भाग है?", "Kernel क्या है?", "Portrait और Landscape क्या है?", "Libreoffice Calc में किसी सेल का एड्रेस कहा दिखाई देता है?", "Ms word में डिफ़ॉल्ट कौनसा पेज आकर सेट रहता है?", "MS Excel 2010 में By default कितनी Sheet होती है??", "इसमें से कौनसा स्लाइड एनिमेशन का प्रकार है?", "रेडियो बटन का कार्य क्या है?", "भारत की पहली राजनीतिक पार्टी जिसने इंटरनेट पर अपना वेबसाइट बनाया?", "निम्नलिखित में से कौन सी कंपनी पेटी-एम ई-वॉलेट ऐप से जुडी है?"};

    public IndiaQuestion2() {
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
