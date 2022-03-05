package com.examplejayho.cccstudymaterials.Economy;

public class EconomyQuestion5 {
    public String[][] mChoices = {new String[]{"इंटरनेट पर ईमेल का प्रसारण", "कैटलॉग और टेलीफोन के माध्यम से बिक्री", "इलेक्ट्रॉनिक माध्यम से व्यवसाय और संचार लेन-देन का माध्यम", "अमेरिकी जनगणना ब्यूरो द्वारा दी गई जानकारी"}, new String[]{"जुलाई 2015", "अगस्त 2016", "जुलाई 2016", "जनवरी 2015"}, new String[]{"इनकम टैक्स फाइल करना", "आधार और पीएफ फंड क्वेरीज को हल करना", "गैस सिलेंडर बुक करना", "उपरोक्त सभी"}, new String[]{"Mission-Mode Project (MMP)", "Passport Seva Project (PSP)", "A & B Both", "None of These"}, new String[]{"विदेश मंत्रालय ( MEA)", "भारत सरकार (GOL)", "टाटा कंसल्टेंसी सर्विस (TCS)", "इनमें से कोई नहीं"}, new String[]{"स्वच्छ भारत अभियान", "मिड-डे मील", "अटल उन्नति मिशन", "डिजिटल इंडिया"}, new String[]{"July 14, 2017", "July 14, 2016", "July 14, 2015", "July 14, 2018"}, new String[]{"3 जुलाई, 2002", "3 अगस्त ,2002", "3 जनवरी, 2002", "12 अगस्त,  2005"}, new String[]{"256", "255", "250", "No limit"}, new String[]{"e commerce", "e goverence", "e-mail", "None"}};
    public String[] mCorrectAnswer = {"इलेक्ट्रॉनिक माध्यम से व्यवसाय और संचार लेन-देन का माध्यम", "जुलाई 2015", "उपरोक्त सभी", "Passport Seva Project (PSP)", "टाटा कंसल्टेंसी सर्विस (TCS)", "डिजिटल इंडिया", "1904 ई.", "3 अगस्त ,2002", "256", "e commerce"};
    public String[] mQuestion = {"ई-कॉमर्स की परिभाषा क्या है ?", "सार्वजनिक अस्पतालों के लिए ऑनलाइन पंजीकरण प्रणाली (ORS) शुरू की गई?", "UMANG App निम्न सेवाओं को सुलभ कराता है?", "NeGP का सबसे सफल प्रोजेक्ट है?", "PSP से संबंधित इनमें से कौन सी कंपनी एप्लीकेशन सॉफ्टवेयर के विकास और सरकार को असिस्ट करने के लिए उत्तरदाई है?", "UMANG एप्लीकेशन किस पहल का एक हिस्सा है ?", "SAARTHI कब लॉन्च हुआ?", "IRCTC द्वारा इंटरनेट टिकटिंग ऑपरेशन किस तारीख को शुरू किया गया था?", "Whatsapp ग्रुप मेंअधिकतम कितने सदस्य हो सकते हैं?", "olx क्या है?"};

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
