package com.examplejayho.cccstudymaterials.Sports;

public class SportQuestion2 {
    public String[][] mChoices = {new String[]{"04", "08", "16", "32"}, new String[]{"Lee S Feyong", "Bill Gates", "Watson", "Tim Berner Lee"}, new String[]{"क्रोम", "फायरफॉक्स ", "सफारी", "गूगल प्लस"}, new String[]{"होस्ट", "वेबसाइट का नाम", "प्रोटोकॉल", "टॉप लेवल डोमेन"}, new String[]{"मेश", "रिंग", "बस", "स्टार"}, new String[]{"URL", "एंकर", "रेफरेन्स", "हाइपरलिंक"}, new String[]{"बस", "रोडवे", "गेटवे", "पाथवे"}, new String[]{"Hyper Text Mark Up Language", "Hyper Tech Mark Up Language", "Hyper Text Mail Language", "Hyper Tech Mail Language"}, new String[]{"VSNL", "IETF", "Inter NIC", "इनमें से कोई नहीं"}, new String[]{"User ID", "User Address", "URL", "ये सभी"}};
    public String[] mCorrectAnswer = {"16", "Tim Berner Lee", "गूगल प्लस", "प्रोटोकॉल", "बस", "हाइपरलिंक", "गेटवे", "Hyper Text Mark Up Language", "इनमें से कोई नहीं", "URL"};
    public String[] mQuestion = {"आईपी address के Class B में होस्ट बिट्स का आकार क्या है?", "www के आविष्कारक कौन है?", "निम्न में से कोनसा ब्राउज़र नहीं है?", "वेबसाइट नाम में में http क्या है?", "किस टोपोलोजी में नेटवर्क कंमपोनेंट एक ही केबल से कनेक्ट किए जाते हैं?", "वेब पेज का एक वर्ड जिसे क्लिक करने पर दूसरा डाक्यूमेन्ट खुलता है, उसे क्या कहते हैं?", "कजो डिवाइस दो या दो से अधिक नेटवर्कों को जोड़ता है उसे क्या कहा जाता है?", "HTML का पूरा नाम क्या है ?", "निम्नलिखित में से इंटरनेट किसके द्वारा चलाया जाता है ?", "वेबसाइट का एड्रेस निम्नलिखित में से कहलाता है ?"};

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
