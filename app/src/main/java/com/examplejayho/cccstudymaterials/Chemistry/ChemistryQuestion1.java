package com.examplejayho.cccstudymaterials.Chemistry;

public class ChemistryQuestion1 {
    public String[][] mChoices = {new String[]{"A1+A2", "Add(A1+A2)", "=A1+A2", "(A1:A2)"}, new String[]{"200", "300", "400", "500"}, new String[]{"=sum (B1:B1048576)", "=add (B1:B1048576)", "=sum(B1,B1048576)", "None"}, new String[]{"F2", "Shift + F3", "Both", "None"}, new String[]{"Shift + 1", "Ctrl + 1", "Alt + 1", "Ctrl + Alt + 1"}, new String[]{"Bubble", "Balun", "Hollow", "Circle"}, new String[]{"$", "*", "+", "#"}, new String[]{"CTRL + Page down", "CTRL +END", "ALT+ END", "Ctrl + down arrow"}, new String[]{"Formula Bar", "Address Book", "Name Box", "None"}, new String[]{"120", "121", "130", "122"}};
    public String[] mCorrectAnswer = {"=A1+A2", "500", "=sum (B1:B1048576)", "F2", "Ctrl + 1", "Bubble", "#", "CTRL +END", "Name Box", "121"};
    public String[] mQuestion = {"A1 और A2 को किस फार्मूला से जोड़ सकते है?", "libreoffice calc को अधिकतम zoom नहीं कर सकते", "B कॉलम को जोड़ने का कौन सा फार्मूला सही है?", "MS Office Cell फार्मूला डालने की shortcut Key है?", "Libreoffice Calc में फॉर्मेट सेल डायलॉग बॉक्स ओपन करने के लिए किस शॉर्टकट की का प्रयोग किया जाता है ?", "Calc में Chart क्या होता है?", "Libreoffice Calc में फार्मूला  Error होने पर कौन सा Sign दिखाई देता है?", "Libreoffice Calc के अंतिम एक्टिव सेल में जाने की शॉर्टकट की क्या है?", "Libreoffice Calc में किसी सेल का एड्रेस कहा दिखाई देता है ?", "Libreoffice Calc मे =CEILING(120,11) का मान कितना होगा?"};

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
