package com.examplejayho.cccstudymaterials.Politics;

public class PoliticsQuestion5 {
    public String[][] mChoices = {new String[]{"Stanford University", "Oxford University", "Dartmouth Collage", "Emory University"}, new String[]{"HDM", "Gear", "Glass", "All of the above"}, new String[]{"Virus", "Spyware", "Trojans Horse", "Ransomware"}, new String[]{"Encryption", "Authentication", "Authorization", "None of the above "}, new String[]{"Cryptocurrency", "Blockchain", "computer on a Blockchain network", "Exchange"}, new String[]{"Bank account", "Floppy Disk", "Wallet", "In Pocket"}, new String[]{"distributed ledger on a peer to peer network", "type of cryptocurrency", "exchange", "centralized ledger"}, new String[]{"place to hang your coat", "private key connected to the Internet", "private key not connected to the Internet", "desktop wallet"}, new String[]{"Azure", "AWS", "Cloudera", "All of the mentioned"}, new String[]{"Compliance", "Computer", "Community", "Communication"}};
    public String[] mCorrectAnswer = {"Dartmouth Collage", "HDM", "Ransomware", "Encryption", "computer on a Blockchain network", "Wallet", "distributed ledger on a peer to peer network", "private key not connected to the Internet", "AWS", "Communication"};
    public String[] mQuestion = {"आर्टिफिशियल इंटेलिजेंस का पहला सम्मेलन कहाँ हुआ था?", "कांटेक्ट को देखने के लिए किस उपकरण का इस्तेमाल किया जाता है?", "कौन सा मैलवेयर आपके कंप्यूटर के डाटा को encrypt कर देता है?", "व्हाट्सएप ऐप के डाटा को सुरक्षित करने के लिए किस टेक्नोलॉजी का उपयोग करता है?", "Node क्या है?", "निम्नलिखित में से आप क्रिप्टोकरेंसी को कहां पर रख सकते हैं?", "ब्लॉकचेन टेक्नोलॉजी क्या है?", "ब्लॉकचेन में कोल्ड स्टोरेज का क्या मतलब है?", "निम्नलिखित में से कौन सा अमेज़ॅन द्वारा क्लाउड प्लेटफ़ॉर्म है?", "सेवा के रूप में CaaS______ के लिए है।"};

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
