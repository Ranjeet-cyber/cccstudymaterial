package com.examplejayho.cccstudymaterials.Physics;

public class PhysicsQuestion5 {
    public String[][] mChoices = {new String[]{"13", "14", "22", "18"}, new String[]{"केन्द्रीय सेवाएँ", "प्रत्यक्ष सेवाएँ", "वित्तीय सेवाएँ", "अन्य"}, new String[]{"Mobile Money Identify", "Mobile Money Identifier", "Both", "None"}, new String[]{"भुगतान", "बैलेंस की जांच", "खाता लेनदेन", "उपयुक्त सभी"}, new String[]{"Finance Ministry", "SBI", "RBI", "GOI"}, new String[]{"1 April 1935", "25 March 1947", "17 December 1937", "अन्य"}, new String[]{"#121#", "*99#", "#123*", "अन्य"}, new String[]{"नागपुर", "दिल्ली", "मुंबई", "भोपाल"}, new String[]{"OMR", "OCR", "Bar code reader", "MICR"}, new String[]{"2 September 1950", "19 March 1947", "1 January 1949", "26 January 1950"}};
    public String[] mCorrectAnswer = {"13", "वित्तीय सेवाएँ", "Mobile Money Identifier", "उपयुक्त सभी", "RBI", "1 April 1935", "*99#", "मुंबई", "MICR", "1 January 1949"};
    public String[] mQuestion = {"भीम ऐप कितनी भाषाएं में है?", "बैंक प्रदान करती हैं ?", "MMID का पूरा नाम क्या है?", "मोबाइल बैंकिंग सेवा है?", "ITZ Cash किस बैंक द्वारा अधिकृत मोबाइल वॉलेट है?", "भारतीय रिज़र्व बैंक कब स्थापित हुआ ?", "क्या डायल करके USSD सेवा का लाभ उठा सकते हैं?", "भारतीय रिज़र्व बैंक का मुख्यालय कहाँ हैं?", "बैंकिंग क्षेत्र में अधिक संख्या में चेको के तेज निस्तारण में सहायता करता है?", "पभारतीय रिज़र्व बैंक का राष्ट्रीयकरण कब हुआ ?"};

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
