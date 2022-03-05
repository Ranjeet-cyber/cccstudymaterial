package com.examplejayho.cccstudymaterials.Geo;

public class GeoQuestion4 {
    public String[][] mChoices = {new String[]{"डेस्कटॉप लॉक करने के लिए", "शटडाउन", "रिस्टार्ट", "लॉग ऑफ़"}, new String[]{"Window Logo", "Window Logo + @", "Window Logo + M", "Window Logo + F"}, new String[]{"React OS", "Ubuntu", "Free BSD", "Windows 7"}, new String[]{"कंप्यूटर चालू करना", "कंप्यूटर को रीस्टार्ट करना", "कंप्यूटर को बंद करना", "इनमें से कोई नहीं"}, new String[]{"Ctrl+D", "Ctrl+Shift+Delete", "Ctrl+Delete", "Shift+Delete"}, new String[]{"Ctrl+N", "Ctrl+Shift+N", "Ctrl+Num", "Shift+N"}, new String[]{"Write", "Calendar", "Write file", "Control panel"}, new String[]{"Windows NT", "Page Maker", "WinWord XP", "Photoshop"}, new String[]{"New Type File System", "Never Terminated File System", "New Technology File System", "Non Terminated File System"}, new String[]{"DOS", "Linux", "Windows", "Unix"}};
    public String[] mCorrectAnswer = {"डेस्कटॉप लॉक करने के लिए", "Window Logo", "Windows 7", "कंप्यूटर चालू करना", "Ctrl+Shift+Delete", "Ctrl+Shift+N", "Control panel", "Windows NT", "New Technology File System", "DOS"};
    public String[] mQuestion = {"विंडोज + एल की का प्रयोग होता है ?", "स्टार्ट मेन्यू को खोलने का शॉर्टकट है ?", "निम्नलिखित में से कौन-सा एक प्रोप्राइटरी ऑपरेटिंग सिस्टम है ?", "कोल्ड बूटिंग क्या कहलाता है?", "Recycle Bin में सेंड किये बीना फाइल्स को डिलीट करने की शोर्टकट की है?", "किस शॉर्टकट की से आप एक नया फोल्डर बना सकते हैं?", "यदि सिस्टम में Date और Time गलत है, तो आप इसे कहाँ से रीसेट कर सकते हैं?", "निम्नलिखित में से कौन सा एप्लीकेशन सॉफ्टवेयर नहीं है?", "फाइल सिस्टम “NTFS” का अर्थ है?", "इनमें से कौन सा प्रोग्राम एक समय में एक से अधिक प्रोग्राम का समर्थन नहीं करता है?"};

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
